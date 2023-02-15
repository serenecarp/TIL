# 다형성(Polymorphism)

## 다형성

- 다형성: 많은 형상을 가질 수 있는 성질
- 상속관계에 있을 때 조상클래스의 타입으로 자식클래스 객체를 참조할 수 있다.

## 다형성의 활용

1. 다른 타입의 객체를 다루는 배열
2. .
3. .

## 다형성과 참조형 객체의 형변환

- 작은 집(child)에서 큰 집(super)으로 → 묵시적 캐스팅
    
    ```java
    byte b = 10;
    int i = b;
    ```
    
    ```java
    Person person = new Person();
    Object obj = person;
    ```
    

- 큰 집(super)에서 작은 집(child)으로 → 명시적 캐스팅
    
    ```java
    int i = 10;
    byte b = (byte)i;
    ```
    
    ```java
    Person person = new Student();
    Student student = (Student)person;
    ```
    

- 참조형 객체의 형변환
    - 무늬만 Student인 Person
    
    ```java
    Person person = new Person();
    Student student = (Student)person;
    student.study();
    ```
    
    → 메모리 객체는 study() 없음: 오류!
    
    - 조상을 무작정 자손으로 바꿀 수는 없다.