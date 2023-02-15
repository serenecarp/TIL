package test07_singleton;

public class Person {
	// 싱글턴으로 바꾸기
	// 1. private으로 자기 자신을 만들기
	// - static: 객체를 생성하지 않고 클래스 이름으로 접근하기 위함!
	private static Person instance = new Person();
	
	// 2. 생성자를 private으로 막기
	private Person() {
		this.name = "유일한 사람";
		this.age = 123;
	}
	// 3. 유일한 객체에 접근할 수 있는 통로 만들기
	public static Person getInstance() {
		return instance;
	}
	
	private String name;
	private int age;
	private boolean hungry;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("헛소리하지마임마");
			return;
		}
		if(age>200) {
			System.out.println("나이가 많으시네요");
			return;
		}
		this.age = age;
	}
	public boolean isHungry() {
		return hungry;
	}
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	
	// 위 멤버변수에 접근할 수 있는 통로를
	// public한 메소드로 만들어줌
	// - 값을 변경 -> 설정자 setter : set + 멤버변수 이름
	// - 값을 조회 -> 접근자 getter : get + 멤버변수 이름
	
	// 마우스 우클릭 -> Source -> generate getters and setters
	
	
	
}
