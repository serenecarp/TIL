package com.ssafy.ws.step3;

public class BookTest {
	public static void main(String[] args) {
		// 선언할 것들이 더 많으면 어떡하지? 한번에 좌르륵 선언할 수 있는 방법은 없을까?
		Book a = new Book("12345", "Java Pro++", "잉어", "붕어", 16000, "Java Pro 업그레이드 버전");
		Book b = new Book("98765", "분석설계개론", "콩", "나물", 40000, "개론이지만 더 비쌈");
		Book c = new Book();
		
		// 책 정보들을 출력할 때 배열+반복문을 쓰고 싶어서 검색해왔다!
		// 객체 배열 사용! 아마 내일 배울 내용인 것 같다. 한번 사용해보자.
		Book[] books = new Book[10];
		// 10권 넘으면 배열 다시 확장해서 만드는 걸로 알고 있는데... 나중에 배우겠지? 일단 여기선 넘어가자.
		
		
		// 배열에 넣는 것조차 수작업.. 한꺼번에 선언하고 그걸 차례대로 배열에 넣는 방법은?
		books[1] = a;
		books[2] = b;
		books[3] = c;
		
		System.out.println("********************도서목록********************");
		for(int i=0; i<books.length; i++) {
			if (books[i] == null) continue;
			// 배열 빈칸을 출력시켜봤더니 null이란 글자가 나왔다. 그래서 null이면 건너뛰게 했다.
			System.out.println(books[i].toString());
		}
	}
}
