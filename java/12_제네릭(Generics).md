# 제네릭(Generics)

## 제네릭?

- 타입 파라미터를 이용하여 클래스, 인터페이스, 메소드를 다양한 타입을 처리할 수 있도록 작성하는 기법

### 제네릭 클래스란?

- 클래스를 정의할 때
- 클래스 안에서 사용되는 자료형(타입)을 구체적으로 명시하지 않고
- T와 같이 타입 매개변수를 이용하는 클래스

### 왜 필요?

- 다양한 타입의 객체를 다루는 메소드, 컬렉션 클래스에서 컴파일시 타입 체크
- 미리 사용할 타입을 명시해서 형변환을 하지 않아도 되게 함
- 객체의 타입에 대한 안전성 향상 및 형변환의 번거로움 감소

## 표현

- 클래스 또는 인터페이스 선언시 `<>` 에 타입 파라미터 표시

- ClassName: Raw Type
- ClassName<T>: Generic Type

```java
public class ClassName<T>{}
public interface InterfaceName<T>{}
```

```java
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable{... }
public class HashMap<K, V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable {... }
```

- 타입 파라미터: 특별한 의미의 알파벳보다는 단순 임의 참조형 타입을 만함
    - T: reference Type
    - E: Element
    - K: Key
    - V: Value

### 클래스 생성

시발이게뭐야