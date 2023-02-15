package test02;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		
		System.out.println(Person.species); // 클래스 변수이므로 클래스명.으로도 접근 가능
		System.out.println(p1.species);
		System.out.println(p2.species);
		System.out.println(p3.species);

		
	}
}
