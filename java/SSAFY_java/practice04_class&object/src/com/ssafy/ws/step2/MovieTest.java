package com.ssafy.ws.step2;

public class MovieTest {
	public static void main(String[] args) {
		
		// 파라미터 바로 집어넣기
		Movie inception = new Movie(1234, "Inception", "Nolan", "SF", 147);
		
		// 일단 기본으로 생성하고 파라미터 나중에 넣어주기
		Movie soul = new Movie(); //5678, "Soul", "Pete", "Animation", 107
		
		// 기본 생성자일 때 출력 한번 해보기
		soul.getRunningTime();
		System.out.println(soul.genre);		

		soul.id = 5678;
		soul.title = "Soul";
		soul.director = "Pete";
		soul.genre = "Animation";
		soul.runningTime = 107;

		
				
		// 객체들의 속성 출력해보기
		System.out.println(inception.runningTime);		
		System.out.println(soul.genre);		

		// 메소드로 출력해보기
		inception.getId();
		soul.getRunningTime();
	}
}
