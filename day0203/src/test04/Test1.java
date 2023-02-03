package test04;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Test1 {
	public static void main(String[] args) {
		// 자바스크립트 객체의 배열 => 자바 객체의 배열, 객체의 리스트
		// - 자바 객체의 배열
		// - 객체의 리스트
		
		Person[] arr = new Person[3];
		arr[0] = new Person("Lee", 30);
		arr[1] = new Person("Yang", 30);
		arr[2] = new Person("Park", 30);
		
		Gson gson = new Gson();
		String str = gson.toJson(arr);
		System.out.println(str);
		
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Oh", 20));
		list.add(new Person("Hong", 20));
		list.add(new Person("Jung", 20));

		String str2 = gson.toJson(list);
		System.out.println(str2);
	}
}
