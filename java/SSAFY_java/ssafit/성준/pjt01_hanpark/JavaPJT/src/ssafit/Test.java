package ssafit;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException{
		
		// video ui 실행
		VideoUi ui = VideoUi.getInstance();
		ui.service();
	}
}
