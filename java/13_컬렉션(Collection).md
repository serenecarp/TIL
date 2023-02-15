# 컬렉션(Collection)

## Collection Framework

: 자료구조 관련 인터페이스, 클래스

(자료구조 ex. 리스트, 집합, 스택, 큐, 맵..)

- 객체들을 한 곳에 모아 놓고 편리하게 사용할 수 있는 환경을 제공 (’자료 구조’)
    - 정적 자료구조(Static data structure)
        - 고정된 크기의 자료구조
        - ex. 배열
        - 선언시 크기를 명시하면 바꿀 수 없다
    - 동적 자료구조(Dynamic data structure)
        - 요소의 개수에 따라 자료구조의 크기가 동적으로 증가하거나 감소
        - ex. 리스트, 스택, 큐 등
- 자료구조
    
    → 어떤 구조에서 얼마나 빨리 원하는 데이터를 **조회**할 수 있는가? / **추가, 삭제, 수정**할 수 있는가?
    
    - 순서를 유지할 것인가?
    - 중복을 허용할 것인가?
    - 다른 자료구조에 비해 어떤 장단점이 있는가?

|  | 인터페이스 | 클래스(구현체) |  |  |
| --- | --- | --- | --- | --- |
| Collection | List | ArrayList |  |  |
|  |  | LinkedList * |  |  |
|  |  | Vector |  |  |
|  | Set | HashSet |  |  |
|  |  | TreeSet |  |  |
|  | Queue | LinkedList * |  |  |
|  | ——————— |  |  |  |
|  |  | Stack |  |  |
| ——————- |  |  |  |  |
|  | Map | HashMap |  |  |
|  |  | Hashtable |  |  |
|  |  | TreeMap |  |  |
|  |  | Properties |  |  |

## java.util 패키지

: 다수의 데이터를 쉽게 처리하는 방법 제공

### Collection Framework 핵심 interface

| interface | 특징 |  |
| --- | --- | --- |
| List | 순서가 있음, 중복 o |  |
| Set | 순서 x, 중복 x |  |
| Map | key와 value 쌍으로 데이터 관리, 순서x, key 중복x value 중복o |  |
| Queue |  |  |

### Collection interface

|  | Collection |
| --- | --- |
| 추가 |  |
|  |  |

## List

- 순서 O, 중복 O (배열과 유사)
- 구현 클래스
    - ArrayList
    - LinkedList
    - Vector

| Vector | ArrayList |
| --- | --- |
| 배열 |  |
| 100% | 50% |
| 싱글스레드 | 멀티스레드 |
| ? |  |

- 내부적으로 배열을 이용하여 관리(ArrayList, Vector)
- 배열과 다르게 크기가 유동적으로 변함(동적 자료구조)
- 배열을 다루는 것과 유사하게 사용할 수 있음
- 주요 메소드

|  |  |
| --- | --- |
|  |  |
|  |  |

### ArrayList

### LinkedList

### Vector

## Set

- 순서x, 중복x
- 장점: 빠른 속도, 효율적인 중복 데이터 제거 수단
- 단점: 단순 집합의 개념으로 정렬하려면 별도의 처리가 필요함
- 구현 클래스
    - HashSet: hashCode
    - TreeSet: red-black tree
    

## Map

- Key, Value를 하나의 Entry로 묶어서 데이터 관리

## Queue

: 대기줄

- 인터페이스. 구현체는 LinkedList
- 큐의 자료구조: FIFO(First-in-first-out), front, rear
- `boolean offer(E e)` : 데이터를 추가
- `E peek()` : 가장 앞에 있는 데이터 조회
- `E poll()` : 가장 앞에 있는 데이터 빼내기
- `boolean isEmpty()` : 큐가 비어있는지 여부

## Stack

: 쌓기

- Stack 클래스 사용
- 스택의 자료구조: LIFO(last-in-first-out)
- `E push(E e)` : 데이터 추가
- `E peek()` : 가장 위에 있는 데이터(top) 조회
- `E pop()` : 가장 위에 있는 데이터 빼내기
- `boolean isEmpty()` : 스택이 비어있는지 여부

## 정렬

- 요소를 특정 기준에 대한 내림차순/오름차순으로 배치하는 것
    - numerical order
    - 사전순
- 순서를 가지는 Collection들만 정렬 가능
    - List계열
    - Set에서는 SortedSet의 자식 객체
    - Map에서는 SortedMap의 자식 객체(Key기준)
- Collections의 `sort()`를 이용한 정렬
    - `sort(List<T> list)`
    - d
    - 객체가 Comparable(인터페이스)을 구현하고 있는 경우 내장 알고리즘을 통해 정렬 →  `String implements Comparable<String>` 이라서 가능
    

### Comparable interface