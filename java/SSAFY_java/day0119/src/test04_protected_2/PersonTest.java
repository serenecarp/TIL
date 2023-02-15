package test04_protected_2;

import test04_protected.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		// 다른 패키지에 있으므로 protected 속성에 접근 불가
//		p1.name = "홍승길";
	}
}
