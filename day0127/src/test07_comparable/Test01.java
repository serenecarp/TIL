package test07_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("Park", "970516"));
		list.add(new Person("Lee", "961231"));
		list.add(new Person("Kim", "950505"));
		
		Collections.sort(list);
		System.out.println(list);
		
		
	}
}
