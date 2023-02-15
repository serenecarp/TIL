# 상속(Inheritance)

## 상속(Inheritance)

- 어떤 클래스의 특성을 그대로 갖는 새로운 클래스를 정의한 것
- 상위클래스 / 부모클래스 / super class
- 하위클래스 / 자식클래스 / sub class

```java
public class Person{
	String name;
	int age;

	public void eat(){
		System.out.println("음식을 먹는다.");
	}
}
```

```java
public class Student{
	String name;
	int age;
	String major;
	
	public void eat(){
		System.out.println("음식을 먹는다.");
	}
	public void study(){
		System.out.println("공부를 한다.");
	}
}
```

```java
public class Student extends Person{
	String major;

	public void study(){
		System.out.println("공부를 한다.");
	}
}
```

- 모든 객체는 ‘Object’를 상속받는다.

## 상속의 특징

1. 확장성, 재사용성
    - 부모의 생성자와 초기화 블록은 상속 x
2. 클래스 선언시 extends 키워드를 명시
    - 자바는 다중 상속 허용X, 단일 상속 지원 (부모는 하나만! `extends 단일부모`
3. 관계
    - 부모(상위, Super) 클래스: Person
    - 자식(하위, Sub) 클래스: Student
4. 자식 클래스는 부모 클래스의 멤버변수, 메소드를 자신의 것처럼 사용할 수 있다.
    
    (단, 접근제한자에 따라 사용 여부가 달라진다.)
    
    - private: 상속x
    - (default): 같은 패키지에 있으면 상속O
    - protected: 다른 패키지에 있더라도 상속관계라면 상속O
    - public: 누구나 가능
5. Object 클래스는 모든 클래스의 조상 클래스
    - 별도의 extends 선언이 없는 클래스는 extends Object가 생략
    

## Super 키워드

- super를 통해 조상클래스의 생성자 호출 (`this` 랑 비슷한 느낌)
- `super()` : 조상클래스의 생성자 호출
- `super.멤버변수` : 조상클래스의 멤버변수 호출
- `super.메소드()` : 조상클래스의 메소드 호출

## 오버라이딩(재정의, overriding)

- 상위 클래스에 선언된 메소드를 자식 클래스에서 재정의하는 것
- 메소드의 이름, 반환형, 매개변수(타입, 개수, 순서) 동일해야 한다.
- 하위클래스의 접근제어자 범위가 상위클래스보다 크거나 같아야한다.
- 상보다 더 큰 예외를 던질 수 없다.
- 메소드 오버로딩(overloading)과 혼동하지 말 것.

```java
public class Student extends Person{
	String major;

	public Student(String name, int age, String major){
		super(name, age);
		this.major = major;
	}

	public void study(){
		super.eat();
		System.out.println("공부를 한다.");
	}
}
```

```java
public class Student extends Person{
	String major;

	public Student(String name, int age, String major)
		super (name, age);
		this.major = major;
	}

	public void study(){
		super.eat();
		System.out.println("공부를 한다.");
	}
	@Override // 어노테이션 = 컴파일러가 읽는 주석
	public void eat(){
		System.out.println("지식을 먹는다.");
	}
}

Student st = new Student("김싸피", 28, "컴퓨터공학");
```

## Object 클래스

- 가장 최상위 클래스로 모든 클래스의 조상
- Object의 멤버는 모든 클래스의 멤버
    - `toString()`, `equals()`, `hashCode()`, `getClass()`, …
    

### toString 메소드

- toString 메소드

### equals 메소드

- 두 객체가 같은지 비교하는 메소드
    - `==` : 참조값, 주소값을 비교
    
    ```java
    public boolean equals(Object obj){
    	return (this==obj); // 원래 주소값을 비교하는데... String 클래스에서는 재정의된다.
    } // 주소값이 아닌 값을 비교하게 됨!
    ```
    
- 객체의 주소 비교: `==` 활용
- 객체의 내용 비교: equals 재정의

### hashCode 메소드

- 객체의 해시 코드: 시스템에서 객체를 구별하기 위해 사용되는 정수값
- HashSet, HashMap 등에서 객체의 동일성을 확인하기 위해 사용
- 해시값의 특징
    - 2개의 객체가 동일하다 → 같은 해시값이 나옴
    - 2개가 같은 해시값을 가진다 → 두 객체가 동일할 수도 있고 아닐수도 있다
- equals 메소드를 재정의할 때는 반드시 hashCode도 재정의할 것
- 미리 작성된 String이나 Number 등에서 재정의된  HashCode 사용 권장

## final

- 해당 선언이 최종 상태, 결코 수정될 수 없음
- `final 클래스` : 상속 금지
- `final 메소드` : overriding 금지
- `final 변수` : 더 이상 값을 바꿀 수 없음. 상수화!

## 다형성(Polymorphism)

- 다형성: 여러 형상을 가질 수 있는 성질
- 상속관계에 있을 때 조상 클래스의 타입으로 자식 클래스 객체를 참조할 수 있다.