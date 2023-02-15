package test05_public;

// class는 public 아니면 default
public class Person {
	public String name; 
	public int age; 
	// 어디서든 접근 가능
	
	public static void main(String[] args) {
		Person p1 = new Person();
		// 자기자신이므로 접근 가능!
		p1.name = "이승재";
	}
}
