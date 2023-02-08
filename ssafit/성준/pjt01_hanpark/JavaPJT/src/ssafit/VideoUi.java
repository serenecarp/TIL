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
