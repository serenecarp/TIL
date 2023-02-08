package test03;

import com.google.gson.Gson;

public class Test2 {
	public static void main(String[] args) {
		String str = "{\"name\":\"Lee\",\"age\":30,\"hungry\":false,\"hobbies\":[\"YouTube\",\"Movie\"],\"friends\":[{\"name\":\"Park\",\"age\":20,\"hungry\":true,\"hobbies\":[],\"friends\":[]}]}\r\n" + 
				"";
		Gson gson = new Gson();
		Person p = gson.fromJson(str, Person.class);
		System.out.println(p);
	}
}
