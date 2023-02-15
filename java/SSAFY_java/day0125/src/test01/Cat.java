package test01;


// 일반클래스인데 추상클래스를 상속받는다.
public class Cat extends Animal{
	// 자식클래스는 부모 클래스의 추상메소드를 모두 오버라이드해야한다
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}

}
