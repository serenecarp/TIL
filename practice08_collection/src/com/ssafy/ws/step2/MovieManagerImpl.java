package com.ssafy.ws.step2;

import java.util.ArrayList;
import java.util.List;

public class MovieManagerImpl implements IMovieManager {
	private List<Movie> movieList = new ArrayList<>();
	
	// 싱글톤 패턴
	private static MovieManagerImpl instance = new MovieManagerImpl();
	private MovieManagerImpl() {}
	public IMovieManager getInstance() {
		return instance;
	}
	
	public void add(Movie movie) {
		movieList.add(movie);
	}
	
	public Movie[] getList() {
		
		return movieList;
	}
	
	public Movie[] getMovies() {
		
	}

	public SeriesMovie[] getSeriesMovies() {
		
	}
	
	public Movie[] searchByTitle(String title) {
		
	}
	
	public double getRunningTimeAvg() {
		
	}
}
