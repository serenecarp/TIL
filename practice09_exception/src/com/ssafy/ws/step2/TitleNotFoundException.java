package com.ssafy.ws.step2;

public class TitleNotFoundException extends Exception{
	private String title;
	
	public TitleNotFoundException(String title) {
		// 예외 발생시 출력
		super(title + " 제목을 포함하는 영화가 존재하지 않습니다.");
		this.title = title;
	}
	
	// 왜 만든 메소드일까
	public String getTitle() {
		
		return this.title;
	}
	
}
