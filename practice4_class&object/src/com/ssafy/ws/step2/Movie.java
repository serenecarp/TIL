package com.ssafy.ws.step2;

public class Movie {
	
	// 인스턴스 변수(속성) 선언
	int id;
	String title;
	String director;
	String genre;
	int runningTime;
	
	// 기본생성자
	public Movie() {
		this(0000, "default", "default", "default", 000); // this()를 이용한 기본값? 이런 곳에 쓰는거 맞나?
	}
	
	// 인자를 받는 생성자
	public Movie(int id, String title, String director, String genre, int runningTime){
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
	// 메소드 만들어보기
	void getId() {
		System.out.println("영화의 id: "+id);
		return;
	}
	void getRunningTime() {
		System.out.println("영화의 상영시간: "+runningTime);
		return;
	}
	
}
