package com.ssafy.ws.step2;

public interface IMovieManager {
//	void add(Movie movie);
	// 제네릭으로 만들어야 할 필요가 생겨서 이렇게 만들어봤어요!
	<T extends Movie>void add(T movie);
	Movie[] getList();
	Movie[] searchByTitle(String title);
	Movie[] getMovies();
	SeriesMovie[] getSeriesMovies();
	double getRunningTimeAvg();
}
