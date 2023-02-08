package ssafit;

import java.util.List;

//박성준
public interface VideoReviewDao {
	// VideoReviewDao 인터페이스 - 기능 강제 구현
	int insertReview (VideoReview videoReview);
	List<VideoReview> selectReview (int videoNo);
}
