# 인터페이스(Interface)

**interface**: a point where two systems meet and interact.

ex) USB, HDMI..

## 인터페이스

- 완벽히 추상화된 설계도: 모든 메소드가 추상메소드(약속)
- 모든 메소드가 `public abstract` , 생략도 가능
- 모든 멤버변수가 `public static final` , 생략 가능
- `interface` 키워드를 이용하여 선언
- 클래스에서 해당 인터페이스를 `implements` 키워드를 이용하여 구현

```java
public interface MyInterface{
	public static final int MEMBER1 = 10;
	int MEMBER2 = 10; // public static final생략 가능

	public abstract void method1(int param);
	void method2(int param); // public abstract생략 가능
}
```

1. `Interface` 키워드를 이용하여 선언
2. 선언되는 변수는 모두 상수로 적용
3. 선언되는 메소드는 모두 추상메소드(public abstract가 생략)
4. 인터페이스 `extends` 를 이용하여 상속 가능 (다중상속 가능, 구현부가 없음)
    - 인터페이스가 인터페이스를 상속
5. 객체 생성이 불가능(추상클래스와 동일한 특성)
6. 클래스가 인터페이스를 구현할 경우에는 `extends` 키워드가 아니라 `implements` 키워드를 이용
    - 다중구현도 가능

```java
interface Shape{}
class Circle extends Shape {} //--- X
class Circle implements Shape {} //--- O
```

1. 인터페이스를 구현하는 하위클래스는 추상메소드를 반드시 오버라이딩(재정의)해야 한다.
    - 구현하지 않을 거면 abstract 클래스로 표시해야 함
2. 인터페이스 다형성 적용

## 인터페이스 vs. 클래스

### 인터페이스와 클래스 비교

|  | 클래스 | 인터페이스 |
| --- | --- | --- |
| 특징 | - class 키워드를 사용하여 정의
- 필드, 메소드, 생성자 | - interface 키워드 사용하여 정의
- 상수, 추상메소드(메소드 선언부)-
- public static final 생략, public abstract 생략 |
| 관계 | 인터페이스를 구현함 | 클래스에 의해 구현됨 |
| 멤버 변수 | 선언 가능 | 상수만 가능 |
| 다중 상속 | 클래스는 하나의 클래스만 상속 가능 | 인터페이스는 여러 개의 인터페이스 상속 가능(구현부가 없으므로 헷갈리지 않음) |
| 다중 구현 | 클래스는 여러 개의 인터페이스를 다중으로 구현(implements) 가능 | ? |
| 인스턴스 | 생성 가능 | 생성 불가 |
| 타입 | 타입으로 사용 가능(다형성) | 타입으로 사용 가능(다형성) |

### 인터페이스와 추상클래스 비교

|  | 추상 클래스  | 인터페이스 |
| --- | --- | --- |
| 객체 생성 | 불가 | 불가 |
| 일반 메소드 | 가능 | 불가 |
| 일반 필드 |  가능 | 불가(상수만 가능) |
| 메소드 | abstract를 붙여야만 추상 메소드 | 모든 메소드는 추상 메소드 |
| 사용 | - 추상적인 클래스의 성격을 가질 때(일부 메소드만 미완성인 설계도)
- 서로 유사한 클래스 사이에 코드를 공유하고 싶을 때 | - 서로 관련 없는 클래스 사이에 공통으로 적용되는 인터페이스를 구현하고자 할 때 (ex. Comparable, Serializable, ..)
- 객체(클래스)의 성격이라기보다, 어떤 기능을 구현하고 있다는 느낌 |
| 공통점 | 특정 기능의 구현을 강제하고 싶을 때 | “ |