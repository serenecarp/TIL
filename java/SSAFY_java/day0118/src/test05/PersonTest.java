package test05;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("박성준", 27);
		Person p2 = new Person("ㅁㄴㅇ", 25);
		Person p3 = new Person("ㄹㅇㄹ", 21);
		Person p4 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		System.out.println(p4.name);
	}
}
