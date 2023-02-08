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
