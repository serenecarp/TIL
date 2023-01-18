package test01;
// 모든 클래스는 특정 패키지(폴더)에 속해 있음
// 패키지: 클래스가 모여 있는 폴더

public class Person {
	// 속성, 데이터, 필드, 변수
	String name;
	int age;
	
	// 생성자
	// 클래스명과 같다.
	// 반환형을 지정하지 않음(메소드와는 다르다!)
	public Person() {
		
	}
	
	// 메소드
	public void eat() {
		System.out.println(name+"이 식사를 합니다.");
	}
}
