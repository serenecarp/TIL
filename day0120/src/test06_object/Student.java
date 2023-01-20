package test06_object;

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
	
	public void eat() {
		System.out.println("지식을 먹는다.");
	}
	
	// 마우스 우클릭 -> Source -> generate toString()
	@Override
	public String toString() {
		return "Student [name="+super.name+", age="+super.age+", major="+this.major+"]";
	}
	//마우스 우클릭 -> Source -> override...
	@Override
	public boolean equals(Object obj) {
		return name.equals(((Student)obj).name);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	
}
