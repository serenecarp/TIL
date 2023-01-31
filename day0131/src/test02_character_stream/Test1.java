package test02_character_stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		// character stream -> reader, writer
		try(FileReader reader = new FileReader("big_input.txt");
				FileWriter writer = new FileWriter("big_input-copy.txt")){
			int c; // character를 int에 담을 수 있다
			while((c=reader.read()) != -1) {
				writer.write(c);
			}
			System.out.println("복사를 완료했습니다.");
			System.out.println("try with resource 구문을 사용해서 알아서 정리가 됐어요.");
		}
	}
}
