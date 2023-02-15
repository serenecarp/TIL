package com.ssafy.ws.step2;

public interface IMovieManager {
//	void add(Movie movie);
	// 제네릭
	<T extends Movie>void add(T movie);
	Movie[] getList();
	// 예외처리- searchByTitle이 잘못되면 TitleNotFoundException에 던질거에요
	Movie[] searchByTitle(String title) throws TitleNotFoundException;
	Movie[] getMovies();
	SeriesMovie[] getSeriesMovies();
	double getRunningTimeAvg();
	
	// 데이터  저장
	void saveData();
}
