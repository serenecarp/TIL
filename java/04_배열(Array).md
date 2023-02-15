# 배열(Array)

## 자료구조(data structure)

- 어떻게 자료를.. 저장 접근 수정?
- 배열, 연결 리스트, 스택, 큐, 맵, 트리, 그래프 …

## 배열이란

- 같은 종류의 데이터를 저장하기 위한 자료 구조
- 크기 고정! (한번 생성된 배열은 크기 변화 불가)
- java에서 배열은 객체로 취급(참조형)
- 배열 요소 참조
    - 배열 이름과 index(0, 1, 2, …)를 가지고 접근
- `배열이름.length` : 배열 길이 조회
    - 배열 길이는 임의 변경 불가
    

## 선언

- `타입[] 변수`
    - `int[] arr;`
    - 권장
- `타입 변수[]`
    - `int arr[];`
    - 되도록 위에꺼 권장: 앞부분만 봐도 딱 배열인 것을 알 수 있음
    

## 생성과 초기화

- `자료형[] 배열이름 = new 자료형[길이];` : 배열 생성(자료형의 초기값으로 초기화)
- `자료형[] 배열이름 = new 자료형[] {값1, 값2, 값3, 값4};` : 배열 생성 및 값 초기화
- `자료형[] 배열이름 = {값1, 값2, 값3, 값4};` : 선언과 동시에 초기화

# for-each

- 기존 방법 : 더 유연하게 가져옴(특정 범위, 순서, index 등 조정 가능)

```java
for(int i=0; i<intArray.length; i++){
	int x = intArray[i];
	System.out.println(x);
}
```

- for-each : 배열 처음부터 끝까지 순서대로 가져옴

```java
int intArray[] = {1, 3, 5, 7, 9};
for(int x : intArray){
	System.out.println(x);
}
```

## 배열 출력

- 반복문으로 출력하기
- `Arrays.toString(arr)` 로 출력하기

```java
import java.util.Arrays;
public class Example2 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};
        System.out.println(Arrays.toString(arr));
    }
}
```

## 배열 복사

- 배열은 한 번 생성하면 길이를 변경할 수 없어서 더 많은 저장공간이 필요하면 큰 배열을 새로 만들어 이전 배열 값을 복사해야 함!
- `새로운 배열 = Arrays.copyOf(복사하고_싶은_배열, 새로운_배열의 크기)`

## 최대값, 최소값

```java
int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};

int min = 1000;
int max = 0;
for(int num: intArray){
	if(num>max){
		max = num;
	}
	if(num<min){
		min = num;
	}
}
System.out.printf("min: %d, max: %d%n", min, max);
```

```java
int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 52};

int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;

for (int num: intArray){
	min = Math.min(min, num);
	max = Math.max(max, num);
}

System.out.printf("min: %d, max: %d%n", min, max);
```

## 빈도수

```java
int[] intArray = {3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3};
int[] used = new int[10];
for(int num: intArray){
	used[num]++;
}

System.out.println(Arrays.toString(used));
```

## 다차원 배열(Multidimensional Array)

### 2차원 배열

- 선언
    - `int[][] iArr = new 배열유형[1차원 배열개수][1차원 배열크기];`
        - 권장
    - `int iArr[][]`
    - `int[] Arr[]`
- 4방 탐색: ‘델타’