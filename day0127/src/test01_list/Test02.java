package test01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test02 {
	public static void main(String[] args) {
		List<Object> al = new ArrayList<Object>();
		List<Object> ll = new LinkedList<Object>();
		List<Object> v = new Vector<Object>();
		
		test1("순차적 추가 -  ArrayList -", al); // 쫌느림
		test1("순차적 추가 - LinkedList -", ll); // 좀빠름
		test1("순차적 추가 -    Vector  -", v);  // 빠름
		
		test2("중간에 추가 -  ArrayList -", al); // 개느림(배열특: 뒤로 밀어줘야함)
		test2("중간에 추가 - LinkedList -", ll); // 빠름
		test2("중간에 추가 -    Vector  -", v);  // 개느림(배열특: 뒤로 밀어줘야함)
		
		test3("데이터 조회 -  ArrayList -", al); // 개빠름
		test3("데이터 조회 - LinkedList -", ll); // 개느림
		test3("데이터 조회 -    Vector  -", v);  // 빠름

		
	}
	
	// 뒤에 추가
	public static void test1(String testname, List<Object> list) { //왜 여기에, static으로 만드는 건지 모름
		long start = System.nanoTime(); //시작시간
		for(int i=0; i<50000; i++) {
			list.add(new String("Hello")); // 뒤에다 추가
		}
		long end = System.nanoTime(); // 끝시간
		System.out.printf("%s \t 소요시간: %15d ns. \n", testname, end-start);
	}
	
	// 처음(중간)에 추가
	public static void test2(String testname, List<Object> list) { //왜 여기에, static으로 만드는 건지 모름
		long start = System.nanoTime(); //시작시간
		for(int i=0; i<50000; i++) {
			list.add(0, new String("Hello")); // 맨앞에다 추가(중간에 추가)
		} 
		long end = System.nanoTime(); // 끝시간
		System.out.printf("%s \t 소요시간: %15d ns. \n", testname, end-start);
	}
	
	// 리스트 모든 원소 조회
	public static void test3(String testname, List<Object> list) { //왜 여기에, static으로 만드는 건지 모름
		long start = System.nanoTime(); //시작시간
		for(int i=0; i<list.size(); i++) {
			list.get(i); // 조회
		} 
		long end = System.nanoTime(); // 끝시간
		System.out.printf("%s \t 소요시간: %15d ns. \n", testname, end-start);
	}
}
