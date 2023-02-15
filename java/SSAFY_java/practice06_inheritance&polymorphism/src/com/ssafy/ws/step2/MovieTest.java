package com.ssafy.ws.step2;

import java.util.Arrays;

public class MovieTest {
	public static void main(String[] args) {
		MovieManager mm = new MovieManager();
		
		
		Movie aaa = new Movie();
		Movie bbb = new Movie(123, "잉어와 붕어", "감자", "스릴러", 100);
		SeriesMovie fff = new SeriesMovie();
		SeriesMovie ggg = new SeriesMovie(321, "스폰지밥", "김박사", "미스터리", 60, 1, "괴짜악단");
		
		aaa.setId(234);
		aaa.setTitle("콩콩");
		aaa.setDirector("밈미");
		aaa.setGenre("공포");
		aaa.setRunningTime(80);
		
		fff.setId(432);
		fff.setTitle("누룽지밥");
		fff.setDirector("김박사");
		fff.setGenre("미스터리");
		fff.setRunningTime(88);
		fff.setSeriesNum(2);
		fff.setEpisode("검은옷의살인마");
		
		mm.add(aaa);
		mm.add(bbb);
		mm.add(fff);
		mm.add(ggg);
		
		System.out.println(Arrays.toString(mm.getList())); // 전체 영화 리스트 출력
		System.out.println(Arrays.toString(mm.getMovies())); // 일반 영화만 출력
		System.out.println(Arrays.toString(mm.getSeriesMovies())); // 시리즈영화만 출력
		System.out.println(Arrays.toString(mm.searchByTitle("콩"))); // 특정 키워드로 검색 ... scanner로 받아올 수도 있겠지만.. 생략
		System.out.println(mm.getRunningTimeAvg());
	}
}
