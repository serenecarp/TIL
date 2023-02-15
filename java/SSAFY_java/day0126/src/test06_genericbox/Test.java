package test06_genericbox;

public class Test {
	public static void main(String[] args) {
		// 제네릭 클래스의 변수를 선언
		// 제네릭 클래스로 객체 생성
		// 선언과 객체 생성시 타입을 지정
		GenericBox<String> strBox = new GenericBox<String>();
		strBox.setData("Hell Generic..");
		System.out.println(strBox.getData());
		
		// new 키워드 다음에 생성자를 호출할 때 <>안에 타입은 생략해도 됨
		// 왜냐하면 컴파일러가 문맥에서 유추할 수 있음
		// <> : 다이아몬드
		GenericBox<Integer> intBox = new GenericBox<>();
		intBox.setData(123);
		Integer i = intBox.getData();

		
		// Integer: 래퍼클래스(wrapper class)
		// 기본형으로 사용하는 int -> 값.
		// 래퍼클래스를 이용하면 마치 객체처럼 사용 가능.
		int b = 123;
		
		// 래퍼클래스
		// byte -> Byte
		// short -> Short
		// int -> Integer
		// long -> Long
		// float -> Float
		// double -> Double
		// char -> Character
		// boolean -> boolean
		// void -> Void
		
		int i1 = new Integer(123); // 그냥 기본형 값으로만 사용
		Integer i2 = new Integer(123); // 객체처럼 사용할 수도 있어요.
		
		//  static method
		int num = Integer.parseInt("123123"); // 문자열을 정수로 바꿔줌!
		
	}
}
