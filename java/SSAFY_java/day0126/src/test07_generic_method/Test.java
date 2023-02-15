package test07_generic_method;

public class Test {
	public static void main(String[] args) {
		// 제네릭 클래스의 변수를 선언
		// 제네릭 클래스로 객체 생성
		// 선언과 객체 생성시 타입을 지정
		GenericBox<String> strBox = new GenericBox<String>();
		strBox.setData("Hell Generic..");
		System.out.println(strBox.getData());
		strBox.genericMethod(123);
		
		

		
		
		
	}
}
