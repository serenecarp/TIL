package test01;

import com.google.gson.Gson;

public class Test2 {
	public static void main(String[] args) {
		// JSON 문자열 => 자바 객체
		// gson.fromJson(JSON 문자열, 타입)
		String str1 = "{\"name\":\"Lee\",\"age\":30,\"hungry\":false,\"hobbies\":[\"YouTUbe\",\"Cooking\"]}";
		String str2 = "{\"name\":\"Hong\",\"age\":24,\"hungry\":false,\"mbti\":null,\"hobbies\":[\"YouTube\",\"Cooking\",\"Fishing\"]}";
		
		
		Gson gson = new Gson();
		Person p1 = gson.fromJson(str1, Person.class);
		Person p2 = gson.fromJson(str2, Person.class);
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
