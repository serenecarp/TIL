package test02;

import java.util.ArrayList;

import com.google.gson.Gson;

public class Test1 {
	public static void main(String[] args) {
		// 자바 객체(멤버 변수로 리스트를 갖고 있는) -> JSON
		Person p1 = new Person("Yang", 28, true, null, new ArrayList<String>());
		p1.hobbies.add("YouTube");
		p1.hobbies.add("Cooking");
		System.out.println(p1);
		
		Gson gson = new Gson();
		String str = gson.toJson(p1);
		System.out.println(str);
	}
}
