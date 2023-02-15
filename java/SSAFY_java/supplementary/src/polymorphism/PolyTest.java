package polymorphism;

public class PolyTest {
	public static void main(String[] args) {
		PolyTest poly = new PolyTest();
		poly.testPrintName();
	}
	
	public void testPrintName() {
		// 모두 Parent 타입으로 선언
		Parent parent1 = new Parent(); 
		Parent parent2 = new Child();
		Parent parent3 = new ChildOther();
		
		parent1.printName();
		parent2.printName();
		parent3.printName();
		
		// Parent 타입으로 선언되었지만, 각 인스턴스들의 printName() 메소드 결과 상이
		// 실제 호출된 메소드는 생성자를 사용한 클래스에 있는 것으로 호출됨
		// - 왜냐면... 각 실제 타입은 다르기 때문!!!
		// => 형 변환을 하더라도 실제로 호출되는 것은 원래 객체에 있는 메소드가 호출된다.
	}
}
