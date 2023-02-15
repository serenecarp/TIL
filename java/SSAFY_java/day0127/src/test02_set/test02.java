package test02_set;

import java.util.HashSet;
import java.util.Set;

public class test02 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		Person p1 = new Person("보노보노", "123123");
		Person p2 = new Person("보노보노", "123123");
		
		set.add(p1);
		set.add(p2);
		
		System.out.println(set); // 왜 둘다 나옴?
				// HashSet은 hashCode, equals 둘다 같아야 같은 걸로 보는데..
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.equals(p2));
				// 둘다 다르다..!!
	}
}
