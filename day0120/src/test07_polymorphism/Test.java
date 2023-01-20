package test07_polymorphism;


import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Person[] people = new Person[3];
		people[0] = new Person("홍승길", 27);
		people[1] = new Person("정민우", 28);
		people[2] = new Student("오지혜", 20, "자바");
		// 부모클래스로 참조할 수 있지만,
		// 부모클래스의 관점에서 보기 때문에
		// 접근 가능한 범위가 달라진다.
		
		
		// Person p = Person("홍승길", 27) .... Student("오지혜", 20, "자바")
		for(Person p: people) {
			System.out.println(p.toString());
		}
		
		Person st = new Student("이승재", 22, "자바");
		
		
		
	}
}
