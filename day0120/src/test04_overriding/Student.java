package test04_overriding;

// 클래스의 사옥은 extends 키워드를 사용한다.
public class Student extends Person {
	
	
	String major;
	
	// 파라미터가 있는 생성자를 만들어줘야 한다.
	public Student(String name, int age, String major) {
		super(name, age); // 부모클래스의 생성자를 호출
		this.major = major;
	}
	
	public void study() {
		System.out.println("공부를 한다.");
	}
	// 어노테이션을 붙이는 것을 권장
	// 붙이지 않아도 오버라이드는 되지만..
	@Override
	public void eat() {
		System.out.println("지식을 먹는다.");
	}
}
