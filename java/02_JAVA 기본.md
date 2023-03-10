# JAVA 기본

[Java 1주차: 기본 문법, 제어문](JAVA%20%E1%84%80%E1%85%B5%E1%84%87%E1%85%A9%E1%86%AB%20415ab2925a1d4a8899d42ec75f46216f/Java%201%E1%84%8C%E1%85%AE%E1%84%8E%E1%85%A1%20%E1%84%80%E1%85%B5%E1%84%87%E1%85%A9%E1%86%AB%20%E1%84%86%E1%85%AE%E1%86%AB%E1%84%87%E1%85%A5%E1%86%B8,%20%E1%84%8C%E1%85%A6%E1%84%8B%E1%85%A5%E1%84%86%E1%85%AE%E1%86%AB%20fd44715da0e74ea38ceae6dc26118bd6.md)

## 컴퓨터의 자료표현

### 비트(Binary digit)

: 컴퓨터 값을 저장할 수 있는 최소 단위 (0, 1)

### 바이트(Byte)

= 8 bits = 256가지 (-128 ~ 127)

: 정보의 최소 단위

### 2진수(Binary)

| 0 | 0 | 0 | 0 | 1 | 0 | 0 | 1 |
| --- | --- | --- | --- | --- | --- | --- | --- |

→ 8 + 1 = 9

| 1 | 0 | 0 | 0 | 1 | 0 | 0 | 1 |
| --- | --- | --- | --- | --- | --- | --- | --- |

- 2의 보수법
    - 반전: 0 1 1 1 0 1 1 1 → -119

## 자바 가상 머신(JVM, Java virtual machine)

- 자바 바이트코드를 실행할 수 있는 주체
- 자바 바이트코드는 플랫폼에 독립적이며 모든 JVM은 자바 가상 머신 규격에 정의된 대로 자바 바이트코드를 실행: 운영체제에 상관 없이 똑같이 컴파일

- JDK = JRE + 개발에 필요한 도구(컴파일러, 디버거)
- JRE = JVM 포함

### Hello SSAFY

```java
import java.lang.*
public class Hello {
	public static void main(String[] args){
		System.out.println("Hello SSAFY!")
	}
}
```