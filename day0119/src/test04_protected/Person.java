package test04_protected;

// class는 public 아니면 default
public class Person {
	protected String name; // 다른 패키지에서는 안되지만..
	protected int age; // 다른 패키지에 있더라도 상속을 받은 클래스라면 접근 가능
	
	public static void main(String[] args) {
		Person p1 = new Person();
		// 자기자신이므로 접근 가능!
		p1.name = "이승재";
	}
}
