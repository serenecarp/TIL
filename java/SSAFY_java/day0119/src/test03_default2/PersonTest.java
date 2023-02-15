package test03_default2;

import test03_default.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		// 다른 클래스(PersonTest)에 있으므로 접근 불가
		
		// 다른패키지이므로 default 속성에 접근 불가능!!!!
//		p1.name = "홍승길";
	}
}
