package pkg1;

import pkg1.pkg2.pkg3.Person;

public class PackageTest {
	public static void main(String[] args) {
		// 서로 다른 패키지에 있는 클래스 중에서
		// 하나를 골라서 쓸 때만 이렇게 쓸 수 있음
		
//		Person p1 = new Person();
//		System.out.println(p1.pkg);
		
		// 만약 서로 다른 패키지에 있는 이름이 같은 클래스를
		// 두 개 이상 사용하고 싶다면 패키지 생략X
		// 패키지명.클래스명 => 풀패키지 이름으로 써야 함
		
		pkg1.Person p1 = new pkg1.Person();
		pkg1.pkg2.Person p2 = new pkg1.pkg2.Person();
		pkg1.pkg2.pkg3.Person p3 = new pkg1.pkg2.pkg3.Person();
		Person p4 = new Person();
		
		System.out.println(p1.pkg);
		System.out.println(p2.pkg);
		System.out.println(p3.pkg);
		System.out.println(p4.pkg); // 임포트해온 패키지의 것으로 나옴

		
	}
}
