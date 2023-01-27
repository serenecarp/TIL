package test06_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		String[] arr = {"samsung", "software", "academy", "for", "youth"};
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		
		// cd. Arrays.sort
		// Collection을 정렬할 때는
		// Collections.sort()
		Collections.sort(list);
		System.out.println(list);
	}
}
