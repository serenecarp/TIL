package reference;

public class ReferenceTest {
	public static void main(String[] args) {
		ReferenceTest reference = new ReferenceTest();
		reference.objectCast();
	}
	
	public void objectCast() {
		ParentCasting parent = new ParentCasting();
		ChildCasting child = new ChildCasting();
		
		// ParentCasting parent2 = child;
		
		// 1. 컴파일 오류 - imcompatible types
		// ChildCasting child2 = parent; 
		// cannot convert from ParentCasting to ChildCasting
		// - 부모가 자식의 메소드 사용 할 수 없어서
		
		// 2. 예외 
		// ChildCasting child3 = (ChildCasting) parent;
		// reference.ParentCasting cannot be cast to reference.ChildCasting'
		// 형변환 연산을 이용해서 "dear parent, plz pretend to be like child" 
		// -> 컴파일 오류 피함
		
		// 3. 정상 작동
		// ChildCasting child4 = (ChildCasting) parent2;
		// ParentCasting parent2 = child; // 주석 풀지 마세요.
		// parent2는 child를 대입한 결과 & child는 ChildCasting 클래스의 객체.
		// parent2의 겉모습은 ParentCasting 클래스 같지만.. 
		// - 실제로는 ChildCasting 클래스의 객체
		// -> parent2를 ChildCasting 클래스로 형 변환해도 전혀 문제 없다.
	}
}
