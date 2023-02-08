package test05;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		// File 클래스
		// file 또는 directory의 객체 생성
		File f = new File("big_input.txt");
		System.out.println("이름: " + f.getName());
		System.out.println("경로: " + f.getPath());
		System.out.println("디렉토리 여부: " + f.isDirectory());
		System.out.println("파열 여부: " + f.isFile());
		System.out.println(f.toString());
		System.out.println(f);
	}
}
