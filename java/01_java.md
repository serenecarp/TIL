# java

## 변수 (variable)

- 한 칸의 메모리
- 데이터를 담아두는 상자

## 변수 선언

```java
자료형 변수명; //선언
변수명 = 값; // 할당(assign)

자료형 변수명 = 값;
```

## 변수 작명 규칙

- `$` `_`
    - `-` (하이픈 절대 사용 금지)
- 알파벳 문자나 숫자, 한글(비추)
    - 알파벳이 먼저 와야 하고
    - `$` `_` 로 시작도 가능
- 중간에 공백(띄어쓰기) X
- 대소문자를 꼭꼭꼭 구분!
    - ASCII 코드
- 자바 언어 (내장함수) 키워드 사용 금지 (ex. max, min, sum..)
    - my_max처럼 이름을 달아 주자

```java
1_name = '성준'; // X
name_1 = '성준'; // O

_name = '성준';
$name = '성준';
```

## Data Type

### Primitive Data Type (기초형)

- 일반적인 값을 기억(저장)하는 변수의 type
- 논리형 (boolean)
    - 0, 1
    - false, true
    
    ```java
    boolean flag1 = true;
    boolean flag2 = false;
    ```
    
    - 다른 언어에서는..
        - python → `False` `True`
        - R → `FALSE` `TRUE`

- 문자형 (`char`)
    - 16비트 유니코드, 수치로는 0 ~ 65535
    - 비트 bit
        - 0, 1
        - 2bit → $2^n$
        - 8bit = 1byte

- 정수형 == 숫자
    - `byte` - 잘 안씀
    - `short` - 잘 안씀
    - `int` - 말 그대로 정수(음수, 0, 양수)
    - `long` - 잘 안씀

- 실수형 == 숫자(소수점)
    - `float` - 소수점
    - `double` - 잘 안씀

## Type Casting 형변환

### Automatic promotions (Implicit Type Casting)

- 작은 크기 → 큰 크기
- 사용자가 대입했을 때 자동으로 알아서 바꿔준다.
- 정수형은 실수형으로 자동 변환된다.

```java
long var = 100;
float fvar = var;
```

### Explicit Type Casting

- 큰 크기 → 작은 크기
- 실수형을 정수형의 타입으로 변경한다.

```java
// identifier = (target_value) value;
float fvar = 100;
long var = (long) fvar;
```

## Operator (연산자)

1. 1순위
- `[]` : 베얄여서 ㅈ;장힐 떼
    - [1, 3, 5, 7, 9]
- `++` , `--`
    - 정수형에 값을 증가/감소
    
    ```java
    int vars = 3;
    vars++
    vars--
    ```
    
- `+` , `-`
    - 정수, 실수
- `~` (비트)
    - 0 → 1
    - 1 → 0
- `!` (논리)
    - true → false
    - false → true
- `new`
    - 객체를 만들 때 사용
- `(type)`
    - 캐스팅 연산자
    - [explicit casting](java%20125a212bd92140158b9eeadde8c7d69e.md)

1. 2순위
- `*` : 곱셈
- `/` : 나눗셈 (몫)
- `%` : 나머지

1. 3순위
- `+`
- `-`

1. 4순위
- `<<` `>>` `>>>`
- 비트 연산 사용시

1. 5순위
- `<` , `>` : 값 대소 비교
- `<=` , `>=` : 이상, 이하

1. 6순위
- `==` : 같음
- `!=` : 다름

1. 7순위
- `&` : AND 연산자
    
    
    | true | true | true |
    | --- | --- | --- |
    | true | false | false |
    | false | true | false |
    | false | false | false |
    - 하나라도 false이면 → false
    - == 비교 대상이 둘다 true → true
    
1. 8순위
- `^` : 배타논리

1. 9순위
- `|` : OR 연산자
    
    
    | true | true | true |
    | --- | --- | --- |
    | true | false | true |
    | false | true | true |
    | false | false | false |

1. 10순위
- `&&` : 조건 AND

1. 11순위
- `||` : 조건 OR

1. 12순위
- `? :` : 조건 삼항

1. 더 있긴 한데 생략!

## Conditional (조건문)

`()` : 소괄호

`{}` : 중괄호

`[]` : 대괄호

`들여쓰기` : indent

### if

- if (**조건**)
    - 조건 - boolean_expression
    
    ```java
    if (boolean_expression){
    	statement1
    } else if (boolean_expression){
    	statement2
    	if (boolean_expression){
    		statement2_1
    	}
    } else // 그 외의 모든 경우 {
    	statement3
    }
    ```
    
    - boolean_expression 1(조건1)이 true일 때 statement 1이 실행된다.
    - boolean expression
        - `if` , `else if` O
        - `else` X
    - statement
        - `if`, `else if`, `else` 3개 모두 O

### switch

- expr 타입은
    - `int` , `byte` , `short` , `char`

```java
switch (expr) {
	case 값1:
		statement1;
		break;

	case 값2:
		statement2;
		break;

	case 값3:
		statement3;
		break;

	default:
}
```

## Loop  (반복문)

### for

- 범위를 정해 놓고 시작

```java
for(init_expr; boolean_testexpr; alter_expr){
	statement or block;
}
```

```java
int[] nums = {1, 2, 3, 4, 5, 6};
for(int i = 0; i < nums.length; i++){
	System.out.println(nums[i]);
}
//1
//2
//3
//4
//5
//6
```

```java
for(type item; items){
	statement or block;
}
```

```java
int[] nums = {1, 2, 3, 4, 5, 6};
// 멤버스 연산자
for(int n: nums){
 System.out.println(n);
}
//1
//2
//3
//4
//5
//6
```

### while

- while(범위x)
- boolean ← 거짓이 될 때까지! : 참이면 무조건 작동!
- 무한반복 (runtime error..)

```java
while(boolean){
	statement or block;
}
```

### do ~ while

- 일단 ㄱ

```java
do {
	statement or block;
} while (boolean);
```

### break, continue

- ㅋㅋ