package com.ssafy.ws.step2;

import java.util.Arrays;

public class MovieManager {
	private static int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size = 0;

	public void add(Movie movie) {
		if (size < MAX_SIZE) {
			movieList[size++] = movie;
		} else {
			System.out.println("리스트가 가득 찼습니다.");
		}
	}
	
	
	// 전체 영화 리스트 get
	public Movie[] getList() {
		return Arrays.copyOf(movieList, size);
	}
	
	
	// 일반 영화만 get
	public Movie[] getMovies() {
		int count = 0;

		for (int i = 0; i < this.size; i++) {

			if (!(movieList[i] instanceof SeriesMovie)) {
				count++;
			}
		}
			if (count == 0) {
				return null;
			}
			
		Movie[] mov = new Movie[count];

		for (int i = 0, index = 0; i < this.size; i++) {
			if (!(movieList[i] instanceof SeriesMovie)) {
				mov[index++] = movieList[i];
			}
		}

		return mov;
	}
	
	
	// 시리즈영화만 get
	public SeriesMovie[] getSeriesMovies() {
		int count = 0;
		for(int i=0; i<this.size; i++) {
			if(movieList[i] instanceof SeriesMovie){
				count++;
			}
		}
			if(count == 0) {
				return null;
			}
		
		SeriesMovie[] serMov = new SeriesMovie[count];
		for(int i=0, index=0; i<this.size; i++) {
			if(movieList[i] instanceof SeriesMovie) {
				serMov[index++] = (SeriesMovie) movieList[i];
			}
		}
		return serMov;
	}

	// 제목 검색 (contains(~)) -> 해당 string이 포함되는지 검사해줌!
	public Movie[] searchByTitle(String title) {
		int count = 0;
		for(int i=0; i<this.size; i++) {
			if(movieList[i].getTitle().contains(title)) {
				count++;
			}
		}
			if(count==0) {
				return null;
			}
			
		Movie[] fndTitle = new Movie[count];
		for(int i=0, index=0; i<this.size; i++) {
			if(movieList[i].getTitle().contains(title)) {
				fndTitle[index++] = movieList[i];
			}
		}
		return fndTitle;
	}
	
	// 영화 상영시간 평균내주기
	public double getRunningTimeAvg() {
		int sum = 0;
		for(int i=0; i<this.size; i++) {
			sum += movieList[i].getRunningTime();
		}
		return sum/this.size;
	}
	
}
