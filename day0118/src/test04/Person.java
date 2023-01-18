package test04;

public class Person {
	// static 키워드 -> 클래스 변수 
	// 이 클래스로 생성되는 모든 인스턴스가 공유
	static String species = "호모 사피엔스 사피엔스";
	
	// static 키워드가 없으면 -> 인스턴스 변수
	String name;
	int age;
	
	// 생성자를 만들지 않고..
	// 만약 설계도에 생성자가 하나도 없다면
	// JVM이 기본생성자를 추가해준다.
	// Person(){};
	
	
	public void eat() {
		// 지역 변수(local variable)
		System.out.println("식사를 합니다.");;
	}
	
	public void eat(String dish) {
		System.out.println(dish + "를 먹습니다.");
	}
	
	public void eat(String dish, int times) {
		System.out.println(dish+"를 "+times+"번 먹습니다.");
	}
	
	
	public void eat(int times, String dish){
		System.out.println(times+"번 " +dish+ "를 먹습니다.");
	};
	// 파라미터의 순서가 달라도 됨!
	
	// 메소드 오버로딩: 이름이 같은 메소드 여러 개를 만들 수 있다.
	// 대신 파라미터가 달라야 함
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	// 메소드 오버로딩의 장점
	// 다양한 자료형에 대해 메소드를 만들 때
	// 이름을 똑같이 할 수 있다
	// 이름을 똑같이 못하면... addInt(), addDouble()..
	
	
	
	// 메소드의 종료
	// - 블록의 끝을 만날 때
	// - return문을 만날 때(void에서도 return문을 쓸 수 있음)
	
	public void study(String subject) {
		double probability = Math.random();
		
		System.out.println(subject+"를 공부합니다.");
		System.out.println("알고리즘 문제를 풉니다.");
		
		if(probability < 0.9999)
			return;
		System.out.println("게임을 합니다.");
		System.out.println("LoL 영상을 시청합니다.");
	}
}
