package reference;

public class Test {
	public static void main(String[] args) {
		// 가능.
		ParentCasting parent1 = new ChildCasting();
		
		// 불가능.
//		ChildCasting child1 = new ParentCasting();
		
		/* 자식 클래스인 ChildCasting 클래스에서는 
		 * 부모 클래스인 ParentCasting 클래스 메소드 사용 가능
		 * */
		
		/* 부모 클래스인 ParentCasting 클래스에서는
		 * 자식 클래스인 ChildCasting 클래스의 메소드와 변수 사용 못함
		 * 명시적 형변환이 필요.
		 * 큰집 -> 작은집
		 * */
	}
}
