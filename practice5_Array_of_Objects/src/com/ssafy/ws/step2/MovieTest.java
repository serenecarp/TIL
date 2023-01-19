package com.ssafy.ws.step2;

import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		
		// 문제에 제시된 size변수는 어디에 써야했던 걸까..?
		Scanner sc = new Scanner(System.in);
		MovieManager mm = MovieManager.getInstance();
		
		
		System.out.println("***************영화 정보 관리***************");
		System.out.println("1. 영화 정보 입력");
		System.out.println("2. 영화 목록 조회");
		System.out.println("3. 제목으로 영화 검색");
		System.out.println("****************************************");
		System.out.println("원하는 기능의 번호를 입력하세요: ");
		
		
		
		
		switch(sc.nextInt()) {
		case 1:
			mm.add();
			break;
		case 2:
			System.out.println(mm.getList());
			break;
		case 3:
			sc.nextLine();
			System.out.println(mm.searchByTitle(sc.nextLine()));
			break;
		default:
			break;
		
		}
		
		
		
	}
}
