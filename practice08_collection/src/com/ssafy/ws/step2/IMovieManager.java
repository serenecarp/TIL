package com.ssafy.ws.step2;

public interface IMovieManager {
	void add();
	Movie[] getList();
	Movie[] searchByTitle();
	Movie[] getMovies();
	SeriesMovie[] getSereisMovies();
	double getRunningTimeAvg();
}
