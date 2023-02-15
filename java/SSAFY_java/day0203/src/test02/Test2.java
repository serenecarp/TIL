package test02;

import com.google.gson.Gson;

public class Test2 {
	public static void main(String[] args) {
		// JSON => 자바 객체(멤버변수로 리스트)
		String str = "{\"name\":\"Yang\",\"age\":28,\"hungry\":true,\"hobbies\":[\"YouTube\",\"Cooking\"]}";
		
		Gson gson = new Gson();
		Person p1 = gson.fromJson(str, Person.class);
		System.out.println(p1);
	}
}
