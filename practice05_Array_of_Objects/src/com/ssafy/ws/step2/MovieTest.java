package com.ssafy.ws.step2;

import java.util.Arrays;
import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MovieManager mm = MovieManager.getInstance();

		Movie movie = new Movie();

		System.out.println(mm.getList());
		boolean flag = true;
		while (flag) {
			System.out.println("***************영화 정보 관리***************");
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 목록 조회");
			System.out.println("3. 제목으로 영화 검색");
			System.out.println("****************************************");
			System.out.print("원하는 기능의 번호를 입력하세요: ");


			switch (sc.nextInt()) {
			case 1:
				sc.nextLine(); // 앞이 nextInt: 버퍼 제거
				mm.add(movie);
				break;
			case 2:
				System.out.println(Arrays.toString(mm.getList()));
				break;
			case 3:
				System.out.print("찾으려는 영화 제목을 입력하세요: ");
				sc.nextLine(); // 앞이 nextInt: 버퍼 제거
				System.out.println(mm.searchByTitle(sc.nextLine()));
				break;
			default:
				break;
			}
		}
	}
}
