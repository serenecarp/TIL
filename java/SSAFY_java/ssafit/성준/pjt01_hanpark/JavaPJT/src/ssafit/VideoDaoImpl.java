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
