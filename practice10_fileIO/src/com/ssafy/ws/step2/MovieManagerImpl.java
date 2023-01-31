package com.ssafy.ws.step2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieManagerImpl implements IMovieManager {
	Scanner sc = new Scanner(System.in);

	Movie normMovie = new Movie();
	SeriesMovie serMovie = new SeriesMovie();

	private static List<Movie> movieList = new ArrayList<>();

	int index = 0;
	// 싱글턴 패턴
	private static MovieManagerImpl instance = new MovieManagerImpl();

	private MovieManagerImpl() {
	}

	 static MovieManagerImpl getInstance() {
		loadData();
		return instance;
	}

	// 영화 추가
	public <T extends Movie> void add(T movie) {

		if (movie instanceof SeriesMovie) {
			// 시리즈 영화 정보 추가, 주어진 형식 외 다른 타입으로 입력했을 경우 오류 표시하는 것은 구현하지 않았음
			movieList.add((SeriesMovie) movie);

			System.out.print("시리즈 번호 입력(int): ");
			((SeriesMovie) movie).setSeriesNum(sc.nextInt());
			sc.nextLine(); // enter 버퍼 처리, 이하생략

			System.out.print("시리즈의 에피소드 입력(String): ");
			((SeriesMovie) movie).setEpisode(sc.nextLine());

			System.out.print("영화 id 입력(int): ");
			movie.setId(sc.nextInt());
			sc.nextLine();

			System.out.print("영화 제목 입력(String): ");
			movie.setTitle(sc.nextLine());

			System.out.print("영화 감독 입력(String): ");
			movie.setDirector(sc.nextLine());

			System.out.print("영화 장르 입력(String): ");
			movie.setGenre(sc.nextLine());

			System.out.print("영화 상영시간 입력(int): ");
			movie.setRunningTime(sc.nextInt());
			sc.nextLine();

			System.out.println("시리즈영화가 등록되었습니다.");

		} else if (!(movie instanceof SeriesMovie)) {
			// 일반영화 정보 추가
			movieList.add(movie);
			System.out.print("영화 id 입력(int): ");
			movie.setId(sc.nextInt());
			sc.nextLine();

			System.out.print("영화 제목 입력(String): ");
			movie.setTitle(sc.nextLine());

			System.out.print("영화 감독 입력(String): ");
			movie.setDirector(sc.nextLine());

			System.out.print("영화 장르 입력(String): ");
			movie.setGenre(sc.nextLine());

			System.out.print("영화 상영시간 입력(int): ");
			movie.setRunningTime(sc.nextInt());
			sc.nextLine();

			System.out.println("일반 영화가 등록되었습니다.");

		} else {
			System.out.println("잘못된 입력입니다.");
		}

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
		for (int i = 0; i < movieList.size(); i++) {
			// 리스트의 원소가 시리즈영화가 아니면 normMov(일반영화리스트)에 추가
			if (!(movieList.get(i) instanceof SeriesMovie)) {
				normMovList.add(movieList.get(i));
			}
		}
		// 없으면 null 반환
		if (normMovList.size() == 0) {
			System.out.println("정보가 없습니다.");
			return null;
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
		for (int i = 0; i < movieList.size(); i++) {
			// 리스트의 원소가 시리즈영화면 serMov(시리즈영화리스트)에 추가
			if (movieList.get(i) instanceof SeriesMovie) {
				// 여기서 movieList.get(i)가 Movie타입이라 serMovList에 넣어줄 수 없는 탓에 강제 형변환
				serMovList.add((SeriesMovie) movieList.get(i));
			}
		}
		// 없으면 null 반환
		if (serMovList.size() == 0) {
			System.out.println("정보가 없습니다.");
			return null;
		}
		// 반환해야 할 타입인 SeriesMovie[]는 배열이므로, serMov를 배열로 바꿔서 return해야 함
		// 깡통 배열에 그대로 넣어줌
		SeriesMovie[] serMovArr = new SeriesMovie[serMovList.size()];
		return serMovList.toArray(serMovArr);
	}

	// 제목(일부)으로 검색
	public Movie[] searchByTitle(String title) throws TitleNotFoundException {
		// ArrayList로 검색결과 영화 리스트 구현
		List<Movie> srchMovList = new ArrayList<>();

		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getTitle().contains(title)) {
				srchMovList.add(movieList.get(i));
			}
		}
		// 검색 결과가 없으면 TitleNotFoundException으로 던집니다
		if (srchMovList.size() == 0) {
			throw new TitleNotFoundException(title);
		}
		// Movie[]타입 배열로 return해주기 위해 리스트를 배열에 담음
		Movie[] srchMovArr = new Movie[srchMovList.size()];
		return srchMovList.toArray(srchMovArr);
	}

	// 상영시간 평균
	public double getRunningTimeAvg() {
		int sum = 0;
		for (int i = 0; i < movieList.size(); i++) {
			sum += movieList.get(i).getRunningTime();
		}
		return sum / movieList.size();
	}


	// 데이터 가져오기
	private static void loadData() {
		File file = new File("movie.dat");
		if (file.exists()) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
				movieList = (List<Movie>) ois.readObject();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// 데이터 저장하기
	public void saveData() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movie.dat"))) {
			oos.writeObject(this.movieList);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
