package test02;

public class Person {
	// static 키워드 -> 클래스 변수 
	// 이 클래스로 생성되는 모든 인스턴스가 공유
	static String species = "호모 사피엔스 사피엔스 샆";
	
	// static 키워드가 없으면 -> 인스턴스 변수
	String name;
	int age;
	
	// 생성자를 만들지 않고..
	// 만약 설계도에 생성자가 하나도 없다면
	// JVM이 기본생성자를 추가해준다.
	// Person(){};
	
	
	public void eat() {
		// 지역 변수(local variable)
		String dish = "짜장면";
	}
}
