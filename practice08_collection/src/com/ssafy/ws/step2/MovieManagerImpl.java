package com.ssafy.ws.step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieManagerImpl implements IMovieManager {
	Scanner sc = new Scanner(System.in);
	Movie movie = new Movie();
	SeriesMovie serMovie = new SeriesMovie();

	private List<Movie> movieList = new ArrayList<>();
	
	// 싱글턴 패턴
	private static MovieManagerImpl instance = new MovieManagerImpl();
	private MovieManagerImpl() {}
	public IMovieManager getInstance() {
		return instance;
	}
	
	// 영화 추가
	public void add(Movie movie) {
		while (true) {
			System.out.print("시리즈 영화인가요?(y/n): ");
			String seriesOrNot = sc.next();
			switch (seriesOrNot) {
			// 시리즈면 시리즈추가, 일반이면 일반추가
			case "y":
				movieList.add(serMovie);
				serMovie.setId(sc.nextInt());
				// 출력 및 입력받기 구현 @#@!#!@#!#!@#@!#@!#@!#@!@#
			case "n":
				movieList.add(movie);

			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}

//		System.out.println("영화 id(int): ");
//		System.out.println("영화 제목(String): ");
//		System.out.println("영화 감독(String): ");

	}
	
	// 영화 목록
	public Movie[] getList() {
		// 반환해야 할 타입인 Movie[]는 배열이므로, movieList를 배열로 바꿔서 return해야 함
		// 그래서 이 리스트를 넣어줄 깡통 배열 생성
		Movie[] mov = new Movie[movieList.size()];
		// toArray를 이용해 배열로 변환
		return movieList.toArray(mov);
	}
	
	// 일반 영화 목록
	public Movie[] getMovies() {
		// ArrayList로 일반영화 리스트 구현
		List<Movie> normMovList = new ArrayList<>();
		
		// movieList 리스트의 크기만큼 검사
		for(int i=0; i<movieList.size(); i++) {
			// 리스트의 원소가 시리즈영화가 아니면 normMov(일반영화리스트)에 추가
			if(!(movieList.get(i) instanceof SeriesMovie)) {
				normMovList.add(movieList.get(i));
			}
		}
		// 반환해야 할 타입인 Movie[]는 배열이므로, normMov를 배열로 바꿔서 return해야 함
		// 깡통 배열에 그대로 넣어줌
		Movie[] normMovArr = new Movie[normMovList.size()];
		return normMovList.toArray(normMovArr);
	}

	// 시리즈 영화 목록
	public SeriesMovie[] getSeriesMovies() {
		// ArrayList로 시리즈영화 리스트 구현
		List<SeriesMovie> serMovList = new ArrayList<>();
		
		// movieList 리스트의 크기만큼 검사
		for(int i=0; i<movieList.size(); i++) {
			// 리스트의 원소가 시리즈영화면 serMov(시리즈영화리스트)에 추가
			if(movieList.get(i) instanceof SeriesMovie) {
				// 여기서 movieList.get(i)가 Movie타입이라 serMovList에 넣어줄 수 없는 탓에 강제 형변환
				serMovList.add((SeriesMovie)movieList.get(i));
			}
		}
		// 반환해야 할 타입인 SeriesMovie[]는 배열이므로, serMov를 배열로 바꿔서 return해야 함
		// 깡통 배열에 그대로 넣어줌
		SeriesMovie[] serMovArr = new SeriesMovie[serMovList.size()];
		return serMovList.toArray(serMovArr);
	}

	// 제목(일부)으로 검색
	public Movie[] searchByTitle(String title) {
		// ArrayList로 검색결과 영화 리스트 구현
		List<Movie> srchMovList = new ArrayList<>();
		
		for(int i=0; i<movieList.size(); i++) {
			if(movieList.get(i).getTitle().contains(title)) {
				srchMovList.add(movieList.get(i));
			}
		}
		// Movie[]타입 배열로 return해주기 위해 리스트를 배열에 담음
		Movie[] srchMovArr = new Movie[srchMovList.size()];
		return srchMovList.toArray(srchMovArr);
	}
	
	// 상영시간 평균
	public double getRunningTimeAvg() {
		int sum = 0;
		for(int i=0; i<movieList.size(); i++) {
			sum+= movieList.get(i).getRunningTime();
		}
		return sum/movieList.size();
	}


	
}
