package test04;


public class Test {
	public static void main(String[] args) {
		// 자식클래스에서 추상클래스에 없는 메소드를 추가해보자.
		// eat
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Person();
		
//		a1.eat(); // 외않됀데? -> 추상메소드에서도 빈껍데기 메소드라도 만들어줘야 한다
		
		// 안되는 것을 해결하는 방법1
		// 부모클래스에 추상메소드 혹은 일반메소드를 정의해놔야
		// 부모클래스 타입으로 참조했을 때 그 메소드를 사용할 수가 있다
		
		// 방법2. instanceof 사용해서 형변환
		
		// instanceof 연산자
		// 객체가 해당 클래스로 만든 객체이거나
		// 객체가 해당 클래스의 조상 클래스로 만든 객체인 경우 true
		// 자식 클래스, 전혀 상관 없는 클래스로 만든 객체인 경우 false
		
		System.out.println(a1 instanceof Animal); // a1은 Animal의 객체인가요?
		System.out.println(a1 instanceof Cat); // a1은 Cat의 객체인가요?
		System.out.println(a1 instanceof Dog); // a1은 Dog의 객체인가요?
		
		
		if(a1 instanceof Cat) {
			Cat c = (Cat) a1;
			c.eat();
		}
		if(a2 instanceof Dog) {
			Dog d = (Dog) a2;
			d.eat();
		}
		if(a3 instanceof Person) {
			Person p = (Person) a3;
			p.eat();
		}
		
	}
}
