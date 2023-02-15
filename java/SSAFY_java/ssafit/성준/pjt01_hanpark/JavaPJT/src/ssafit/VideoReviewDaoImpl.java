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
