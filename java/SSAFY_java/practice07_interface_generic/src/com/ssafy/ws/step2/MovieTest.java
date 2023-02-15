package com.ssafy.ws.step2;

import java.util.Arrays;
import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie movie1 = new Movie(123, "java", "fdas", "bbb", 80);
		Movie movie2 = new Movie();
		movie2.setId(333);
		movie2.setTitle("ㅋㅋ");
		movie2.setGenre("aa");
		movie2.setDirector("aaaaaaa");
		movie2.setRunningTime(1111);
		SeriesMovie movie3 = new SeriesMovie(321, "qwerty", "asdf", "aaa", 100, 1, "keyboard");
		
		// 싱글톤패턴 - 객체 여러개 해도 인스턴스 하나만 건드리게 되는거 확인 -> 2개 생성해봄
		MovieManagerImpl mmi = MovieManagerImpl.getInstance();
		MovieManagerImpl mmmi = MovieManagerImpl.getInstance();
		
		mmi.add(movie1);
		mmmi.add(movie2);
		mmi.add(movie3);
		
		System.out.println(Arrays.toString(mmi.getList()));
		System.out.println(Arrays.toString(mmi.getMovies()));
		System.out.println(Arrays.toString(mmmi.getSeriesMovies()));
		System.out.println(Arrays.toString(mmi.searchByTitle("ㅋ")));
		System.out.println(mmi.getRunningTimeAvg());
	}
}
