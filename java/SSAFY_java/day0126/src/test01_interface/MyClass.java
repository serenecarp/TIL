package test01_interface;


// 클래스는 인터페이스를 구현한다.
// 인터페이스는 클래스에 의해 구현된다.
// 클래스가 인터페이스를 구현할 때는 implements 키워드를 사용
public class MyClass implements MyInterface {
	// 클래스는 구현하는 인터페이스의 모든 (추상메소드)를 override(재정의)해야 함
	@Override
	public void method1() {
		System.out.println("method 1");
	}

	@Override
	public void method2() {
		System.out.println("method 2");
	}
}
