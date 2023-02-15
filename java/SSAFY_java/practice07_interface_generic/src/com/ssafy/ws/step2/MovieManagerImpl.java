package com.ssafy.ws.step2;

import java.util.Arrays;

public class MovieManagerImpl implements IMovieManager {
	private static int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size = 0;
	
	// 자신을 멤버로 선언
	private static MovieManagerImpl instance = new MovieManagerImpl();
	
	// 생성자가 private -> 아무도 이 객체를 생성할 수 없다!
	private MovieManagerImpl() {}
	
	// 외부에서 인스턴스를 가져올 수 있는 유일한 메소드
	public static MovieManagerImpl getInstance() {
		return instance;
	}
	
	// movieList에 영화 객체 추가하기
	@Override
	public void add(Movie movie) {
		if (size < MAX_SIZE) { // 최대치가 안됐으면 계속 추가
			movieList[size++] = movie;
		} else {
			System.out.println("목록이 가득 찼습니다.");
		}
	}

	@Override
	// movieList 복사해서 return하기
	// 복사 안하고 본체를 return하니까 다른 메소드 한번 쓰면 본체에 있던 객체들이 다 망가지더라...
	public Movie[] getList() {
		return Arrays.copyOf(movieList, size);
	}

	// 제목으로 영화 찾기
	@Override
	public Movie[] searchByTitle(String title) {
		int count = 0; // 제목에 맞는 영화가 몇개인가? -> 그에 맞는 크기의 배열을 따로 만들어주기 위함
		for(int i=0; i<size; i++) {
			if(movieList[i].getTitle().contains(title)) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("검색 결과가 없습니다.");
			return null;
		}

		Movie[] srchdTitle = new Movie[count];
		for(int i=0, index=0; i<size; i++) {
			if(movieList[i].getTitle().contains(title)) {
				srchdTitle[index++] = movieList[i];
			}
		}
		return srchdTitle;
	}
	

	@Override
	public Movie[] getMovies() {
		int count = 0;
		for(int i=0; i<size; i++) {
			if(!(movieList[i] instanceof SeriesMovie)){
				count++;
			}
		}
		if(count==0) {
			System.out.println("결과가 없습니다.");
			return null;
		}
		
		Movie[] mov = new Movie[count];
		for(int i=0, index=0; i<size; i++) {
			if(!(movieList[i] instanceof SeriesMovie)) {
				mov[index++]=movieList[i];
			}
		}
		return mov;
	}

	@Override
	public SeriesMovie[] getSeriesMovies() {
		int count = 0;
		for(int i=0; i<size; i++) {
			if(movieList[i] instanceof SeriesMovie){
				count++;
			}
		}
		if(count==0) {
			System.out.println("결과가 없습니다.");
			return null;
		}
		
		SeriesMovie[] serMov = new SeriesMovie[count];
		for(int i=0, index=0; i<size; i++) {
			if(movieList[i] instanceof SeriesMovie) {
				serMov[index++]=(SeriesMovie)movieList[i];
			}
		}
		return serMov;
	}

	@Override
	public double getRunningTimeAvg() {
		int sum=0;
		for(int i=0; i<size; i++) {
			sum += movieList[i].getRunningTime();
		}
		return sum/size;
	}
}
