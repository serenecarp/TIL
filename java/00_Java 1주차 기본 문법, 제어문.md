# Java 1주차: 기본 문법, 제어문

## 컴퓨터의 자료표현

### 비트(Binary digit, Bit)

: 컴퓨터 값을 저장할 수 있는 최소 단위 **(0 or 1)**

### 바이트(Byte)

= 8 bits = 256가지 (-128 ~ 127)

: 정보의 최소 단위

### 2진수(Binary)

| 0 | 0 | 0 | 0 | 1 | 0 | 0 | 1 |
| --- | --- | --- | --- | --- | --- | --- | --- |

⇒ 8 + 1 = 9

| 1 | 0 | 0 | 0 | 1 | 0 | 0 | 1 |
| --- | --- | --- | --- | --- | --- | --- | --- |

- **2의 보수법**: 반전!
    
    
    | 0 | 1 | 1 | 1 | 0 | 1 | 1 | 0 |
    | --- | --- | --- | --- | --- | --- | --- | --- |
    
    ⇒ -119
    

## JVM(Java Virtual machine, 자바 가상 머신)

: 자바 바이트코드(중간 언어)를 실행할 수 있는 주체

※ **바이트코드**: 고급 언어로 작성된 소스 코드를 가상머신이 이해할 수 있는 중간 코드로 컴파일한 것.

- 자바 바이트코드는 플랫폼에 독립적

```java
outer:
for (int i = 2; i < 1000; i++) {
    for (int j = 2; j < i; j++) {
        if (i % j == 0)
            continue outer;
    }
    System.out.println (i);
}
```

왼쪽이 우리가 작성하는 코드

이것을 자바에서 컴파일하면 오른쪽처럼 기계가 이해하기 쉬운 코드로 바뀜

```java
0:   iconst_2
1:   istore_1
2:   iload_1
3:   sipush  1000
6:   if_icmpge       44
9:   iconst_2
10:  istore_2
11:  iload_2
12:  iload_1
13:  if_icmpge       31
16:  iload_1
17:  iload_2
18:  irem
19:  ifne    25
22:  goto    38
25:  iinc    2, 1
28:  goto    11
31:  getstatic       #84; // Field java/lang/System.out:Ljava/io/PrintStream;
34:  iload_1
35:  invokevirtual   #85; // Method java/io/PrintStream.println:(I)V
38:  iinc    1, 1
41:  goto    2
44:  return
```

## main method

`public static void main(String[] args) { }`

- java 실행 시 가장 먼저 호출

## 주석(Comment)

`//` : 해당 줄 주석

`/*  */` : 해당 범위 주석

`/**  */` : Documentation API를 위한 주석

## 출력

- `print` : 줄바꿈x
- `println` : 줄바꿈o
- `printf` : 형식
    - `%d` : 정수
    - `%f` : 실수
    - `%c` : 문자
    - `%s` : 문자열
    

## 변수(Variable)

- **정의**
    - **데이터를 저장할 메모리의 위치**
    - 메모리 상에 데이터를 보관할 수 있는 공간을 확보
    - 적절한 메모리 공간을 확보하기 위해 변수의 **타입** 등장
    - `=` 을 통해 CPU에게 연산 작업 의뢰
- 메모리의 단위
    - 0과 1을 표현하는 **bit**
    - 8bit = 1byte
    
- 특징
    - 대소문자 구분
    - 공백 ㄴㄴ
    - 숫자로 시작 ㄴㄴ
    - `$` , `_` 사용 가능, 그 밖의 특수문자는 ㄴㄴ
    - 예약어(keyword) 사용 불가 (abstract, int, static, .. 이런 것들)
    - 합성어는 **camelCase**
    - 한글 사용 가능
    

## 자료형(Data Type)

### 기본 자료형(Primitive Type)

- 8가지
- 비객체 타입
- 스택(Stack) 메모리에 저장

| 타입 | 세부타입 | 데이터형 | 크기 | 기본값 | 값의 범위 |
| --- | --- | --- | --- | --- | --- |
| 논리형 |  | boolean |  | false |  |
| 문자형 |  | char | 2byte | null(\u0000) |  |
| 숫자형 | 정수형 | byte | 1byte | (byte)0 |  |
|  |  | short | 2byte | (short)0 |  |
|  |  | int | 4byte | 0 |  |
|  |  | long | 8byte | 0L |  |
|  | 실수형 | float | 4byte | 0.0f |  |
|  |  | double | 8byte | 0.0d |  |

```java
// 선언
int age;

// 저장(할당)
age = 30;

// 초기화
int score = 30;
```

### 참조 자료형(Reference Type)

- 기본 자료형을 제외한 모든 타입
- 데이터 값을 그대로 저장하는 게 아니고, 메모리 상에서 데이터가 저장된 **주소를 저장**함
- 힙 메모리 영역에 저장
- java.lang.Object 클래스를 상속하는 모든 클래스
- 클래스 타입(class type), 인터페이스 타입(interface type), 배열 타입(array type), 열거 타입(enum type)
- (ex) `class` , Array (`Object[]`), annotation(`@`), `interface` , `enum` , ….

### String Class(문자열)

- 참조형이지만 기본형처럼 사용함
- `==` 아니고 `.equals()` 사용

### Wrapper Class

- 기본 자료형을 참조 자료형처럼 사용하기 위한 클래스
- 기본 자료형 값을 감싸서 객체의 형태로 만들어 줌
    - 1. 제네릭, 2. 기본 자료형 값을 문자열로 변환 (혹은 반대) 할 때 주로 사용

| Primitive Type | Wrapper class |
| --- | --- |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| double | Double |
| char | Character |
| float | Float |
| boolean | Boolean |

## 형 변환(Type Casting)

### 묵시적(암묵적, Implicit Casting)

- 작은 집 → 큰 집

### 명시적(Explicit Casting)

- 큰 집 → 작은 집 : 어려워!
- `(타입) 값`

## 연산자(Operator)

| 종류 | 연산 기호 | 결합 방향 | 우선 순위 |
| --- | --- | --- | --- |
| 최우선 연산자 | () , . , 참조연산자, [] , 배열 참조 연산자 |  |  |
| 단항 연산자 | ++ . -- , +(부호), - (부호), ~ , ! , type (형변환) | ← | 높음 |
| 산술 연산자 | * , / , % | → |  |
|  | +(덧셈), -(뺄셈) | → |  |
|  | << , >> , >>> | → |  |
| 비교 연산자 | < , > , <= , >= , instanceof | → |  |
|  | == , != | → |  |
| 논리 연산자 | & | → |  |
|  | ^ | → |  |
|  | | | → |  |
|  | && | → |  |
|  | || | → |  |
| 삼항 연산자 | ? , : | → |  |
| 대입 연산자 | = , *= , /= , %= , += , -= , <<= , >>= , >>>= , &= , &= , ^= , |= | ← | 낮음 |

### 단항 연산자

- `!` : 논리 값 반전
- `~` : 비트 값 반전

### 산술 연산자

- 정수와 정수 연산 ⇒ 정수
- 정수와 실수 연산 ⇒ 실수

### 비교 연산자

- `instanceof`

### 논리 연산자

- `&&` : 논리 곱(AND)
- `||` : 논리 합(OR)
- `!` : 논리 부정(NOT)

### 삼항 연산자

- `조건식 ? 식1 : 식2`
- 조건식이 참이면 식1, 거짓이면 식2

### 대입 연산자

- ㅇ

## 제어문

### 조건문(Conditional Statement)

- if문
    
    ```java
    if (조건식) {
    	실행할 문장1;
    	실행할 문장2;
    	...
    } else if {
    	실행할 문장a;
    	...
    } ...{
    } else {
    	실행할 문장A;
    	...
    }
    ```
    
- switch문
    
    ```java
    switch(수식) {
    	case 값1:
    		실행문 A;
    		break;
    	case 값2:
    		실행문 B;
    		break;
    	default:
    		실행문 C;
    }
    ```
    
    수식에 byte, short, char, int, enum, string 가능, break 없어도
    

### 반복문(Loop)

- for문
    
    ```java
    for( 초기화식 ; 조건식 ; 증감식 ) {
    	반복 수행할 문장
    }
    ```
    
- while문
    
    ```java
    while( 조건식 ) {
    	반복 수행할 문장
    }
    ```
    
- do while문
    
    ```java
    do {
    	반복 수행할 문장;
    } while ( 조건식 );
    ```
    
- break
    - 반복문 빠져나오기
- continue
    - 다음 반복으로 넘기기