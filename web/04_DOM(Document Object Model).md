# DOM(Document Object Model)

## window (최상위 객체)

### window가 가지고 있는 메소드

- alert
- confirm
- prompt
- open
- parseInt, parseFloat
- setTimeout, clearTimeout
- setInterval, clearInterval

## DOM

- XML, HTML 문서의 각 항목을 계층으로 표현하여 생성, 변형, 삭제할 수 있도록 돕는 인터페이스
- DOM은 문서 요소 집합을 트리 형태의 계층 구조로 HTML 표현
- HTML 문서의 요소를 제어하기 ㅜ이해 지원
- 상단의 document 노드를 통해 접근

### 문서 접근 방식 이해

- `getElementById(string)`
- `querySelector(css selector)`
- `querySelectorAll(css selector)`

### 문서 조작 방식 이해

- `createElement(tagName)`
- `createTextNode(text)`
- `appendChild(node)`
- `append(string | node)`
- `removeChild(node)`
- `setAttribute(name, value)`
- `innerHTML`
- `innerTEXT`

## Event

### Event

- (특히 중요한) 사건[일]: 브라우저, HTML DOM, 자바스크립트의 이벤트
- 웹 페이지에서 여러 종류의 상호작용이 있을 때마다 이벤트가 발생
- 마우스를 이용했을 때, 키보드를 눌렀을 때 등 많은 이벤트가 존재
- JavaScript를 사용하여 DOM에서 발생하는 이벤트를 감지하고 대응하는 작업을 수행할 수 있다

### 이벤트 종류

- 키보드 → keyup, keydown, keypress
- 마우스 → click, mousemove, mouseup, mousedown, mouseenter, mouseleave
- 로딩 → load, unload
- 폼 → input, change, blur, focus, submit

### 이벤트 처리 방식의 이해

- 고전 이벤트 처리 방식: attribute / property 방식으로 등록
- 표준 이벤트 처리 방식: addEventListener 메소드 이용

### 이벤트 전파(Event propagation)

- 캡처링 단계(capturing phase): 이벤트가 상위 요소에서 하위요소 방향으로 전파
- 타깃 단계(target phase): 이벤트가 타깃에 도달
- 버블링 단계(bubling phase): 이벤트가 하위 요소에서 상위 요소 방향으로 전파

### 고전처리방식 vs. 표준처리방식

- 고전 처리방식: 타깃 단계와 버블링 단계의 이벤트만 캐치 가능
- 표준 처리방식: 타깃 단계와 버블링 단계 뿐만 아니라 캡처링 단계의 이벤트도 선별적으로 캐치 가능
- 캡처링 단계의 이벤트를 캐치하려면 `addEventListener`의 3번째 인수로 true를 전달
- 3번째 인수를 생략하거나, false를 전달 ⇒ 타깃단계와 버블링 단계의 이벤트 캐치