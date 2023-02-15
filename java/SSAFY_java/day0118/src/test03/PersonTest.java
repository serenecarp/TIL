package test03;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		int sum = p1.add(4, 5);
		System.out.println(sum);
		
		p1.study("자바");
	}
}
