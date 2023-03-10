package com.ssafy.ws.step2;

import java.util.Arrays;
import java.util.Scanner;

public class MovieManager {

	private final int MAX_SIZE = 100; // final: 더이상 고칠 수 없는 상수
	private int size = 0;
	private Movie[] movieList = new Movie[MAX_SIZE];

	// 싱글턴
	// 1. private으로 자기자신의 인스턴스를 만들기
	// 2. 생성자를 private으로 막기
	// 3. 유일한 인스턴스에 접근 가능한 getter 만들기

	private static MovieManager instance = new MovieManager();

	private MovieManager() {
		
	}

	public static MovieManager getInstance() {
		if(instance == null) // 최초에 한 번만 new로 메모리에 할당한다... 라고 한다....
		{
			instance = new MovieManager(); // 솔직히 잘 와닿진 않는다. 위에서 이미 한거 아냐?
		}
		return instance;
	}

	// 메소드가 static이라는 의미는 무엇인가
	// 인스턴스(객체) 생성하지 않고 호출 가능
	// 속도 증가, 공유(반복 사용)에 효율적
	// 영화 목록에 추가하는 add도 반복 사용할거니까 static 추가??!
	// ...
	// static을 추가했더니 안된다고 떴다.
	// cannot make a static reference to the non-static field mv
	// 스태틱과 논 스태틱 메소드는 각각 다른 메모리 영역에 생성되어 동작한다. (메소드영역/스택영역)
	// 컴파일될 때 메소드영역이 먼저 컴파일되고 나중에 스택 애들이 컴파일 된다는데..
	// 스태틱 멤버 입장에서, 컴파일할 때 논 스태틱 애들은 아직 정의되지도 않았기 때문에 이상하게 생각한다.
	// 고 한다....
	Scanner sc = new Scanner(System.in);

	public void add(Movie movie) {
		Boolean flag = true;
		while(flag) {
			movieList[size] = movie;
			
			System.out.print("영화의 id를 입력하세요: ");
			movieList[size].setId(sc.nextInt());

			System.out.print("영화의 제목을 입력하세요: ");
			sc.nextLine(); // 앞이 nextInt: 버퍼 제거
			movieList[size].setTitle(sc.nextLine());

			System.out.print("영화의 감독을 입력하세요: ");
			movieList[size].setDirector(sc.nextLine());

			System.out.print("영화의 장르를 입력하세요: ");
			movieList[size].setGenre(sc.nextLine());

			System.out.print("영화의 상영시간을 입력하세요(단위-분): ");
			movieList[size].setRunningTime(sc.nextInt());

			size++;
			// 영화 목록 가득찬 경우 + 계속 입력할 것인지 말 것인지
			if (size >= 100) {
				System.out.println("영화 목록이 가득 찼습니다.");
				break;
			}
			
			System.out.print("계속 입력하시겠습니까? y/n: ");

			sc.nextLine();
			
			String keepgoing = sc.next();
			
			
			if (keepgoing.equals("y")) {
				continue;
			} else if (keepgoing.equals("n")) {
				break;
			}
		}

	}

	public Movie[] getList() {
		return Arrays.copyOf(movieList, size);
	}

	public Movie searchByTitle(String title) {



		for (size = 0; size < movieList.length; size++) {
			if (title.equals(movieList[size].getTitle())) {
				return movieList[size];
			}
		}
		System.out.println("결과가 없습니다.");
		return null;

	}

}
