# java PJT

---
*(목차 만들어 보려다 실패했어요..)*

---

## ✔ 이번 pjt를 통해 배운 내용

* 객체지향의 특성 중 'Encapsulation'의 중요성에 대해 알게 되었다.
  * 우리 코드는 encapsulation이 잘 구현되지 않아 유지보수가 불편해 더 절실히 깨달았다.
* 협업, 분업이 단순한 일은 아님을 알았다.
  * 특히 마감 기한이 정해져 있어 시간에 쫓길 때 부담감이 배로 생겼다.
* 명세서와 클래스 다이어그램의 존재가 크게 느껴졌다.
  * 없었다면 얼마나 헤맸을까. / 명세서는 누가 만들까?
  * 그렇다고 예시에 불과한 이 클래스 다이어그램에 너무 얽매여 작성하는 것도 좋지 않은 것 같다.

<br>

---
<br>

## 👥 팀원 정보 및 엄무 분담
* 한상빈: 전반적인 java 코드 작성
* 박성준: review 일부 코드 작성 및 주석  
<br>
---

<br>

## A. 기본 기능 - 영상 정보 데이터 관리 (입력 및 출력)

* 요구 사항 : 영상정보 데이터 파일을 기반으로 필요한 정보를 파싱 처리 후 영상정보 제공
* 결과 : JSON 형식의 데이터 파일에서 영상 8개의 정보를 성공적으로 읽어 옴. 그러나 8개 이상의, 점점 추가될 수도 있는 많은 데이터들을 불러오고자 할 경우에 대해서는 해결책이 불확실함.


<br>


**(Video UI)**
```Java
package ssafit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VideoUi {

	// 싱글턴 패턴
	private VideoDao videoDao = VideoDaoImpl.getInstance();
	private static VideoUi instance = new VideoUi();
	
	private VideoUi() {}
	
	public static VideoUi getInstance() {
		return instance;
	}
	
	// 처음 실행 화면 ui
	public void service() throws IOException{
		System.out.println("-----------------------------");
		System.out.println("자바로 구현하는 SSAFIT");
		System.out.println("-----------------------------");
		System.out.println("1. 영상정보");
		System.out.println("그 외. 종료");
		System.out.println("-----------------------------");
		System.out.printf("메뉴를 선택하세요 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try { int input = Integer.parseInt(br.readLine());
		// input 1이 아니면 프로그램 종료
			if (input != 1) {
				System.out.println("프로그램을 종료합니다...");return;
			}
		}
		// 예외처리
		catch ( NumberFormatException e) {
			System.out.println("잘못된 입력입니다, 프로그램을 종료합니다...");
			return;
		}
		
		// ui: 영상 목록 / 이전으로
		System.out.println("-----------------------------");
		System.out.println("1. 영상목록");
		System.out.println("0. 이전으로");
		System.out.println("-----------------------------");
		System.out.printf("메뉴를 선택하세요 : ");
		int input = Integer.parseInt(br.readLine());
		// 잘못된 입력의 경우 다시 입력 받음
		while (input != 0 && input != 1) {
			System.out.print("입력이 잘못되었습니다, 다시 입력하세요 : ");
			input = Integer.parseInt(br.readLine());
		}
		// input==1이면 영상 목록 출력
		if (input == 1) this.listVideo();
		// input==0이면 이전으로
		else this.service();
	}
	
	// 영상 목록 출력 메소드
	private void listVideo() throws NumberFormatException, IOException {
		System.out.println("-----------------------------");
		System.out.printf("전체 %d개\n",videoDao.selectVideo().size());
		System.out.println("-----------------------------");
		// 영상 리스트를 받아 와서 정보 출력
		for(Video vdo : videoDao.selectVideo()) {
			System.out.printf("%d %5s %s\n",vdo.getNo(),vdo.getPart(),vdo.getTitle());
		}
		// 1. 영상 상세 / 0. 이전으로
		System.out.println("-----------------------------");
		System.out.println("1. 영상상세");
		System.out.println("0. 이전으로");
		System.out.println("-----------------------------");
		System.out.print("메뉴를 선택하세요 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		// input==1 이면 영상 상세 출력
		if (input == 1) this.detailVideo();
		// input==0 이면 이전으로 (처음으로 돌아감)
		else this.service();
	}
	
	// 영상의 상세 정보 출력
	private void detailVideo() throws NumberFormatException, IOException {
		// 영상 번호 입력 받기
		System.out.print("영상번호를 입력하세요 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		Video vdo = videoDao.selectVideoByNo(input-1);
		// vdo==null이면 잘못 읽었다고 판단 -> 해당 메소드 재실행
		if (vdo == null) this.detailVideo();
		// vdo!=null 이면 영화 상세 정보를 정상적으로 출력
		System.out.println("-----------------------------");
		System.out.printf("번호 : %d\n", vdo.getNo());
		System.out.printf("제목 : %s\n", vdo.getTitle());
		System.out.printf("운동 : %s\n", vdo.getPart());
		System.out.printf("영상 URL : %s\n", vdo.getUrl());
		System.out.println("-----------------------------");
		VideoReviewUi.getInstance(8).service(input);
	}
}

```

<br>

**(VideoDaoImpl)**
```Java
  package ssafit;

    import java.io.*;
    import java.util.Arrays;
    import java.util.List;

    import com.google.gson.Gson;


    public class VideoDaoImpl implements VideoDao{
        
        // 싱글턴 패턴
        private List<Video> list;
        private static VideoDao instance = new VideoDaoImpl();
        
        // 생성자에서 JSON파일 정보 불러오기
        private VideoDaoImpl() {
            try {
                BufferedReader br = new BufferedReader(new FileReader("data/video.json"));
                StringBuilder sb = new StringBuilder();
                String str = null;
                while((str = br.readLine())!=null) {
                    sb.append(str).append("\n");
                }
                Gson gson = new Gson();
                Video[] arr = gson.fromJson(sb.toString(), Video[].class);
                List<Video> videoList = Arrays.asList(arr);
                this.list = videoList;
            }
            // 파일이 없을 때 예외처리
            catch (FileNotFoundException e1) {
                System.out.println("파일을 찾을 수 없습니다");
                this.list = null;
            }
            // 기타 예외처리
            catch (IOException e) {
                System.out.println("기타 예외 발생");
            }
        }
        
        public static VideoDao getInstance() {
            return instance;
        }
        
        // 비디오 list를 반환하는 메서드
        @Override
        public List<Video> selectVideo() {
            return list;
        }
        
        // 입력 받은 번호의 영화를 반환하는 메서드
        @Override
        public Video selectVideoByNo(int no) {
            try { 
                return list.get(no);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("해당하는 번호의 영화가 없습니다");
                return null;
            }
        }
        
    }

  ```

  * 이 문제에서 어려웠던 점
    * 가장 최근에 배운 파일 입출력과 JSON의 개념이 생소해서 교재를 따라가며 차근차근 진행했다.
  * 내가 생각하는 이 문제의 포인트
    * JSON 파일을 잘 읽고 쓰는 것. 그 읽어 오는 과정에서 어떤 형에서 어떤 형으로 형변환을 어떻게 하는지 잘 파악하는 것이 중요한 것 같다. (배열, 리스트, 문자열..)

<br>

---
<br>

## B. 기본 기능 - 영상 별 리뷰 관리 (등록 및 출력)

* 요구 사항 : 선택한 영상에 대한 리뷰를 관리 (리뷰 등록 및 출력)
* 결과 : 영상 별로 리뷰를 등록하고 조회하는데 성공. 그러나 리뷰까지 JSON파일로 저장하는 기능을 구현하고 싶었는데, 코드 구조 및 시간 관계상 구현하지 못함.


<br>

**(VideoReviewUI)**
  ```Java
   package ssafit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VideoReviewUi {
	private VideoReviewDao videoReviewDao;
	private int videoNo;

	// 싱글턴 패턴
	// 생성자 private
	private VideoReviewUi() {
	}

	// 자기 자신을 멤버로 선언
	private static VideoReviewUi instance = new VideoReviewUi();

	// 유일하게 instance를 가져올 수 있는 메소드
	public static VideoReviewUi getInstance(int videoNo) {
		return instance;
	}

	// 리뷰 ui 실행
	public void service(int movieNo) throws NumberFormatException, IOException {

		listReview(movieNo);
	}

	// 번호를 받아서 그 번호 영화의 리뷰를 출력
	private void listReview(int movieNo) throws NumberFormatException, IOException {
		try {
			int movieNumber = movieNo;
			VideoReviewDaoImpl vrd = VideoReviewDaoImpl.getInstance();
			for (VideoReview rv : vrd.selectReview(movieNumber)) {
				System.out.println(rv);
			}
		} 
		// 예외처리
		catch (NullPointerException e) {
			System.out.println("해당 리뷰 없음");
		}
		
		// 리뷰 ui - 리뷰 등록 여부 입력
		System.out.println("-----------------------------");
		System.out.println("1. 리뷰등록");
		System.out.println("0. 이전으로");
		System.out.println("-----------------------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer input = Integer.parseInt(br.readLine());
		
		// 리뷰 등록: input == 1이면 registReview 호출
		if (input == 1)
			this.registReview(movieNo);
		// 이전으로: input == 0이면 이전으로 - 가장 처음 ui로 돌아감..
		else if (input == 0)
			VideoUi.getInstance().service();

	}

	// 리뷰를 작성해서 저장하는 메소드
	private void registReview(int movieNo) throws NumberFormatException, IOException {
		// 리뷰 정보 받기
		VideoReview rv = new VideoReview();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		rv.setVideoNo(movieNo);
		System.out.print("닉네임을 입력하세요 : ");
		rv.setNickName(br.readLine());
		System.out.print("내용을 입력하세요 : ");
		rv.setContent(br.readLine());
		int size;
		// 리뷰가 없으면 리뷰의 list를 생성
		if (VideoReviewDaoImpl.getInstance().selectReview(rv.getVideoNo()) == null)
			size = 1;
		// 리뷰가 있으면 list 사이즈 증가
		else
			size = VideoReviewDaoImpl.getInstance().selectReview(rv.getVideoNo()).size() + 1;
		rv.setReviewNo(size);
		VideoReviewDaoImpl.getInstance().insertReview(rv);
		// 리뷰 추가
		this.service(rv.getVideoNo());
	}
}

  ```

  <br>

**(VideoReviewDaoImpl)**
  ```Java
   package ssafit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoReviewDaoImpl implements VideoReviewDao {
	private static int reviewNo;
	private Map<Integer, List<VideoReview>> videoReviewDb = new HashMap<>();

	// 싱글턴 패턴
	// private 생성자: 외부에서 호출할 수 없도록 함.
	private VideoReviewDaoImpl() {}
	// 자신을 멤버로 선언
	private static VideoReviewDaoImpl instance = new VideoReviewDaoImpl();
	// 유일하게 외부에서 인스턴스를 가져올 수 있는 getInstance
	public static VideoReviewDaoImpl getInstance() {
			return instance;
	}
	
	// 해당 영화의 리뷰 객체를 받아서, 그 리뷰 리스트 안에 넣어 주는 메서드
	@Override
	public int insertReview(VideoReview videoReview) {
		// 데이터베이스에서 정보를 불러와 tmp에 저장
		List<VideoReview> tmp = selectReview(videoReview.getVideoNo());
		// 리뷰가 없으면 새로 목록을 생성
		if (tmp == null) {tmp = new ArrayList<VideoReview>(); tmp.add(videoReview);}
		// 리뷰가 있으면 리뷰를 추가
		else tmp.add(videoReview);
		// 리뷰가 추가된 목록을 다시 데이터베이스에 저장
		videoReviewDb.put(videoReview.getVideoNo(), tmp);
		
		return videoReview.getVideoNo();
	}
	
	// 비디오 번호를 받아서 해당 비디오의 리뷰들을 리턴
	@Override
	public List<VideoReview> selectReview(int videoNo) {
		try {return videoReviewDb.get(videoNo);
		
		}
		// 예외 처리
		catch (NullPointerException e) {
			return null;
		}
	}
}

  ```

  * 이 문제에서 어려웠던점
    * 예시로 주어진 클래스 다이어그램에서 억지로 기능을 변수와 메소드에 끼워 맞추려다 보니 코드가 부자연스러워진 면이 있었다.
  * 내가 생각하는 이 문제의 포인트
    * 익숙하지 않은 Map과 List를 잘 활용해 '맵 안의 리스트'를 생각하며 구현하기


<br>

---

<br>

## C. UI 부분에 대해서...
  * `service()` 메소드에 선택 메뉴를 출력하는 부분과, 다른 기능 메소드들을 호출하는 부분을 구현했어야 했는데, ui 출력 부분까지 '기능 메소드'에 들어가게 되어 모듈화가 잘 이루어지지 못한 것 같다.

<br>


---

# 후기

* `프로젝트 분업 & 협업`
  * 그런데 걱정대로 나는 코드를 거의 작성하지 못했고, 같은 팀원인 상빈이가 거의 다 작성해주었다. 고맙고 미안하다.
  * 상빈이는 시간 내에 제출하기 위해 빠르게 코드를 쭉쭉 짜 나갔고, 나는 명세서랑 클래스 다이어그램을 먼저 다 이해하고 시작하려고 해서 거의 시작조차 하지 못했다. 진행이 너무 느렸던 나로서는 상빈이 덕에 무사히 프로젝트를 마칠 수 있었던 것 같아 고마웠다.
* `객체 지향 프로그래밍이란?`
  * 이번 프로젝트에서는 encapsulation 면에서 아쉬움이 많이 남았다. 코드를 작성해보고 생긴 오류를 급하게 메꾸려고 하다 보니 각 메소드들 간 의존도가 너무 커지고 말았다. 뒤에 가서는 오류를 발견했는데 그걸 고치려면 거의 다 뜯어 고쳐야 해서 제대로 보완하지 못했다. 이런 까닭에 객체지향 프로그래밍에서 어떻게 모듈화하고 encapsulation을 구현해야 할지 더 생각해볼 수 있었다..
* `UX, UI / front, back`
  * UX에 관심이 있으니 UI부분을 주로 구현해보라는 말씀을 들었지만, 그땐 와닿지 않아 그저 기능별로 분업을 했다. 그런데 이렇게 프로젝트를 진행해 보니까 말씀대로 해볼걸 하는 아쉬움이 남는다.
  * 이번 프로젝트가 아주 단순한 것들을 다루어서(지금의 나에겐 단순하지 않지만), 백엔드와 프론트엔드에 대해서 잘 알지 못하지만 여태까지는 프론트엔드 쪽에 조금 더 눈길이 가는 것 같다. 그래도 한쪽을 아예 닫아 두지는 말고, 양쪽 다 열심히 해봐야겠다!
