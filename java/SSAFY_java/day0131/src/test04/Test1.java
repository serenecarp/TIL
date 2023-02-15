package test04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws IOException  {
		// Scanner vs. BufferedReader
		// - big_input.txt에서 한줄씩 읽어와서
		// - 정수형으로 바꾸기
		
		// Scanner
		test1("    Scanner   ");
		
		// BufferedReader
		test2("BufferedReader");
	}

	public static void test1(String testname) throws IOException {
		try(Scanner sc = new Scanner(new FileInputStream("big_input.txt"))){
			long start = System.nanoTime();
			while(sc.hasNext()) {
				int num = sc.nextInt();
			}
			long end = System.nanoTime();
			System.out.printf("%s - %15d ns. \n", testname, end-start);
		}
	}
	public static void test2(String testname) throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("big_input.txt")))){
			// 표준입출력 -> 알고리즘 -> System.in, System.out<= InputStream, OutputStream)
			
			// ex) 키보드에서 입력받을 때
			// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			// cf)
			// Scanner sc = new Scanner(System.int));
			
			// BufferedInputStream in = new BufferedInputStream(new FileInputStream());
			long start = System.nanoTime();
			String l;
			while((l=br.readLine()) != null) {
				int num = Integer.parseInt(l);
				
			}
			long end = System.nanoTime();
			System.out.printf("%s - %15d ns. \n", testname, end-start);
		}
	}

	
}
