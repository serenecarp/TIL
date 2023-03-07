# CSS

참고자료

재밌는 개구리 이동시키기~~ [https://flexboxfroggy.com/#ko](https://flexboxfroggy.com/#ko)

## CSS(CasCading Style Sheets)

- HTML을 화면에 표시하는 방식을 정의한 안어
- 웹 문서의 내용과 관계없이 디자인만 바꿀 수 있음

## 기본 구조

```css
.box /* 선택자(selector) */ {   
	background-color: red; /*선언*/
	width: 100px; /*속성*/ /*값*/
	height: 100px;
	/* CSS 주석 */
}
```

## 적용 방법

- inline: 특정 tag의 속성으로
- internal → <style>  </style>
- external: style.css 파일을 만들어서 link

### External style sheet

- 

### Internal style sheet

- 파일 내에 스타일을 적용하는 방식
- <style> 태그 사이에 CSS 규칙 작성
- <head> 안에 작성
- 외부 스타일 시트보다 우선 적용

### Inline style

- tag에서 style 속성을 사용하고 속성값으로 CSS 규칙 작성
- 스타일 적용우선순위: 인라인 > 내부 스타일 시트 > 외부 스타일 시트

## CSS Selector

### CSS 선택자

- HTML 문서에서 CSS 규칙을 적용할 요소를 정의
- 기본 선택자
    - 전체 선택자
    - 
- 그룹 선택자
- 결합자
    - 자손 결합자, 자식 결합자
    - 
- 의사 클래스 / 요소
    - 의사 클래스
    - 의사 요소
    

### Universal selector (전체 선택자)

### Type selector (유형 선택자)

### Class selector (클래스 선택자)

중복o

### ID selector (ID 선택자)

중복x

### Selector list (선택자 목록)

### Descendant combinator (자손 결합자)

콤마 없음,

selector1의 자손 중에서 selector2인 요소한테만 적용하겠다

```css
selector1 selector2 { style properties }
```

### Child combinator (자식 결합자)

selector1의 바로 아래 자식인 노드 선택

```css
selector1 > selector2 { sytle properties }
```

### General sibling combinator (일반 형제 결합자)

첫번째 요소를 뒤따르면서(앞 형제는 x) 같은 부모를 공유하는 두번째 요소를 모두 선택

```css
former-element ~ target-element { sytle properties }
```

### Adjacent sibling combinator (인접 형제 결합자)

첫번째 요소 바로 뒤에 위치하면서 같은 부모 공유하는 두번째 요소 선택

```css
former-element + target-element { style properties }
```

## 우선순위

‘cascading’ 폭포

- 같은 요소에 두 개 이상의 CSS 규칙이 적용된 경우
- `마지막 규칙`, `구체적인 규칙`, `!important` 가 우선 적용

## Inheritance

- 부모 요소에 적용된 스타일이 자식 요소에게 상속이 될 수도, 안 될 수도 있음
- 상속되는 속성
    - 요소의 상속되는 속성에 값이 지정되지 않은 경우, 요소는 부모의 해당 속성의 계산값을 얻음
    - ex) color
- 상속되지 않는 속성
    - 요소의 상속되지 않는 속성에 어떤 값이 지정되지 않는 경우, 요소는 그 속성의 초기값을 얻음
    - ex) border
    

## 단위

### 크기 단위

- 길이 값(length): px, cm, mm, in, em, rem 등 (em, rem은 상대적인 크기 단위)
    - em: 부모의 font size에 대해 상대적 크기
    - rem: root element(html)의 font size에 대해 상대적 크기
- 백분율(%): 상위 block에 대한 백분율의 단위, 상위 block의 크기가 바뀌면 자신의 크기도 자동으로 바뀜
- auto(width): 100%, 자신의 상위 block이 허용하는 width 크기만큼 채운다.
- auto(height): .

### 색상 단위

- 색상 키워드: 대소문자 구분x (ex) red, blue, …
- RGB 색상: 16진수 표기법 혹은 함수형 표기법을 사용해서 특정 색을 표현하는 방식
- HSL 색상: 색상, 채도, 명도를 통해 특정 색을 표현하는 방식

```css
div {
	color: block;
	color: #000;
	color: #ffffff;
	color: rgb(255, 0, 0);
	color: hsl(120, 100%, 0);
	color: rgba(0, 0, 255, 0.5);
	color: dfadfasdfasf
}
```

## font

font-family

font-size

font-style

font-variant

font-weight

font

## Text

text-align

text-decoration

text-indent

text-transform

white-space

vertical-align

letter-spacing

word-spacing

line-hieght

color

## Background

## Box model (!!)

- 모든 HTML 요소는 box 형태로 되어 있음
- margin > border > padding > 0x0

## display: block (!)

## position

## flexbox(!!!!!)

- 주요 개념
    - 주축, 교차축
    - 시작선, 끝선
    - Container와 item

### flex container

- display 속성을 이용하여 container를 생성