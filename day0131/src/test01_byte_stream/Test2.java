package test01_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		// byte stream
		// => 이미지

		// 여기서는 예외처리 따로 x
		// try with resource
		// try 다음에 (), ()안에 필요한 리소스를 정의
		// 문장은 ; 구분
		// close를 따로할 필요 없이 알아서 close해줌
		try (FileInputStream in = new FileInputStream("newjeans.jpg");
				FileOutputStream out = new FileOutputStream("newjeans-copy2.jpg")) {

			int b; // byte를 int형으로 저장해도 됨
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			System.out.println("복사를 완료했습니다.");
			System.out.println("알아서 스트림을 닫아줍니다");
		}

	}

}
