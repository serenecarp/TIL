package com.ssafy.ws.step2;

import java.util.Arrays;
import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		// 인터페이스인 IMovieManager로 만들어야 할까?
		// 그걸 구현한 MovieManagerImpl로 만들어야 할까?
		MovieManagerImpl myMovies = MovieManagerImpl.getInstance();

		while (flag) {
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
			sc.nextLine(); // enter 버퍼 처리

			switch (menuSelect) {
			// 1. 영화 정보 입력
			case 1:
				System.out.print("시리즈 영화인가요?(y/n): ");
				String seriesOrNot = sc.next();
				/*
				 * 시리즈영화를 입력할 수도 있고 그냥영화를 입력할 수도 있을 텐데..
				 * 그럼 두 가지 타입에 대한 add()를 둘다 만들어야 하나 고민하다가
				 * 이럴 때 제네릭을 쓰면 되는 건가? 해서 써보기로 했다. (MovieManagerImpl)
				 */
				switch (seriesOrNot) {
				// 시리즈면 시리즈추가, 일반이면 일반추가
				// 일반 영화면 normMovie, 시리즈영화면 serMovie로 add메소드 실행

				case "y":
					SeriesMovie serMovie = new SeriesMovie();
					myMovies.add(serMovie);
					break;
				case "n":
					Movie normMovie = new Movie();
					myMovies.add(normMovie);
					break;

				}
				break;
				
			// 2. 모든 영화 조회
			case 2:
				System.out.println(Arrays.toString(myMovies.getList()));
				break;
			
			// 3. 일반 영화 조회
			case 3:
				System.out.println(Arrays.toString(myMovies.getMovies()));	
				break;
				
			// 4. 시리즈 영화 조회
			case 4:
				System.out.println(Arrays.toString(myMovies.getSeriesMovies()));
				break;
				
			// 5. 제목으로 영화 검색
			// 예외가 발생할 수 있으므로 try-catch
			case 5:
				try {
				System.out.print("키워드를 입력하세요: ");
				System.out.println(Arrays.toString(myMovies.searchByTitle(sc.nextLine())));
				} catch(TitleNotFoundException e) {
					e.printStackTrace();
				}
				break;
				
			// 6. 평균 영화 상영시간
			case 6:
				System.out.printf("평균 영화 상영시간(분): %f \n", myMovies.getRunningTimeAvg());
				break;

			// 그 외의 숫자 입력시
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				
			}

		}
	}
}
