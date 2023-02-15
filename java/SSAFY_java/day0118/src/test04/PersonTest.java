package test04;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		int sum = p1.add(4, 5);
		double sum2 = p1.add(23.4, 11.42);
		System.out.println(sum);
		System.out.println(sum2);
		
		p1.eat();
		p1.eat("탕수육");
		p1.eat("햄버거", 3);
		p1.eat(2, "피자");
		
	}
}
