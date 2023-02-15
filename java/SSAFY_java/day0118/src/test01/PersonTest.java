package test01;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(); // 객체의 생성: new 키워드 + 생성자 호출
		p1.name = "박성준";
		p1.age = 27;
		p1.eat();
		
		Person p2 = new Person();
		p2.name = "홍홍홍";
		p2.age = 123;
		p2.eat();
	}
}
