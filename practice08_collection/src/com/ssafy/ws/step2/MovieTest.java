package com.ssafy.ws.step2;

import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie m = new Movie();
		SeriesMovie sm = new SeriesMovie();

		System.out.println("***************영화 정보***************");
		System.out.println("1. 영화 정보 입력");
		System.out.println("2. 모든 영화  조회");
		System.out.println("3. 일반 영화 조회");
		System.out.println("4. 시리즈 영화 조회");
		System.out.println("5. 제목으로 영화 검색");
		System.out.println("6. 평균 영화 상영시간");
		System.out.println("************************************");

		System.out.print("원하시는 기능의 번호를 입력하세요: ");
		int menuSelect = sc.nextInt();

		switch (menuSelect) {
		case 1:
			// 버퍼 제거
			sc.nextLine();

			
			
		}

	}
}
