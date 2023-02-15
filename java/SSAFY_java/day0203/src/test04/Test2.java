package test04;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class Test2 {
	public static void main(String[] args) {
		
		String str = "[{\"name\":\"Lee\",\"age\":30},{\"name\":\"Yang\",\"age\":30},{\"name\":\"Park\",\"age\":30}]\r\n" + 
				"";
		// JSON 문자열 => 객체의 배열, 객체의 리스트
		Gson gson = new Gson();
		// 객체의 배열
		Person[] arr = gson.fromJson(str, Person[].class);
		System.out.println(Arrays.toString(arr));
		// 객체의 리스트
		List<Person> list = Arrays.asList(arr); // ArrayList로 바꿔줌
		System.out.println(list);
	}
}
