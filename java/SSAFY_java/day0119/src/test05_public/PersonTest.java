package test05_public;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		// 다른 클래스(PersonTest)에 있으므로 접근 불가
		// 같은 패키지에 있으면 protected에 접근 가능
		p1.name = "홍승길";
	}
}
