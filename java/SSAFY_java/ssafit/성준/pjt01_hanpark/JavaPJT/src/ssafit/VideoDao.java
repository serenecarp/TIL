package ssafit;

import java.util.List;

public interface VideoDao {
	
	// VideoDao 인터페이스 - 기능 구현 강제
	List<Video> selectVideo();
	Video selectVideoByNo(int no);
}
