# WebStorage, XMLHttpRequest

## Web Storage

: 브라우저 저장 공간

- Web Storage API: Application Programming Interface
- 키 / 값 쌍으로 값을 저장: 키, 값 모두 문자열
- sessionStorage: 브라우저 끄면 사라짐
- localStorage: 브라우저 꺼도 남아있음

### localStorage

- setItem(key, value)
- getItem(key)
- removeItem(key)
- clear()
- key(index)
- length
- 값은 반드시 문자열로 저장

## AJAX

### Ajax(Asynchronous JavaScript and XML)

- AJAX(비동기 방식의 자바스크립트 XML)
- AJAX Apps
    - 구글맵, VIBE, 네이버 검색 등…
- 직관적이고 자연스러운 사용자 상호액션 방식
    - 기존 클릭이 필요하지 않음
- 화면의 일부분만 변경
    - 기존 → 서버 요청, 대기, 전체화면 새로고침
    - AJAX → 업데이트가 필요한 부분만 변경
    

### 동작 방식

### XMLHttpRequest

- 자바스크립트 객체
- 1999년 마이크로소프트 개발
- 대부분의 브라우저에서 지원
    - Firefox, Opera, Safari, …
- 표준 HTTP방식 (GET / POST)으로 서버와 통신
    - 백그라운드에서 작업
- XMLHttpRequest 생성자 함수를 통해 생성: `new XMLHttpRequest();`

### XMLHttpRequest 객체의 메소드들

- open(”HTTP method”, “URL”, sync/async)
    - 요청의 초기화 작업(사전 준비 작업)
    - GET / POST 지정
    - 서버 URL 지정
    - 동기 / 비동기 설정
- send(content)
    - GET 방식은 URL에 필요 정보를 추가하기 때문에 null 적용
    - 
    

### XMLHttpRequest 객체 프로퍼티들

- onreadystatechange
    - 서버에서 응답이 도착했을 때 호출될 콜백함수 지정
    - 콜백함수는 상태(readyState)가 변경될 때마다 호출
- readyState
    - 0 → UNSENT (객체 생성 후 open 메소드 호출 전)
    - 1 → OPEND (open 메소드가 호출되고 send 호출 전)
    - 2 → HEADERS_RECEIVED (send 메소드가 호출되었지만 서버 응답 전, 헤더와 상태 확인 가능)
    - 3 → LOADING (다운로드 중, 데이터의 일부가 전송된 상태)
    - 4 → DONE (모든 데이터 전송 완료)
- status
    - 서버 처리 결과 상태 코드
    - 200 → OK (요청 성공)
    - 404 → Not Found (페이지를 못 찾을 경우)
    - 500 → Server Error (서버에서 결과 생성시 오류 발생)
- responseText
    - 서버의 응답결과를 문자열로 받기
- responseXML
    - 서버의 응답결과를 XML Document로 받기

### AJAX 프로그래밍 순서

1. 클라이언트 이벤트 발생
2. XMLHttpRequest 객체 생성
3. XMLHttpRequest 객체 콜백함수 설정
4. XMLHttpRequest 객체를 통한 비동기화 요청
5. 서버 응답결과를 생성하여 클라이언트로 전송
6. XMLHttpRequest 객체는 서버 결과를 처리할 콜백함수 호출
7. 결과를 클라이언트 화면에 반영