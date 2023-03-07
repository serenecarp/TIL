# PJT_02_WEB
1. [프로젝트 학습 목표](#-📌-프로젝트-학습-목표)
2. [역할 분담](#-👥-역할-분담)
3. [프로젝트 과정](#-🚩-프로젝트-과정)
4. [후기](#-😥-후기)

<br>

## 📌 프로젝트 학습 목표
<hr>

1. `HTML`, `CSS`와 `Bootstrap`으로 웹 페이지 구조를 만들고 꾸밀 수 있다.
2. `JavaScript`로 `HTML`의 요소 및 이벤트를 제어할 수 있다.
3. `localStorage`, `AJAX`로 데이터를 주고 저장하거나 불러올 수 있다.
4. `git`을 통해 원활한 협업을 진행할 수 있다.
5. `UX`, `UI`를 고려하여 사용자가 편리하게 사용할 수 있는 서비스를 구현한다.

<br>

<br>

## 👥 역할 분담
<hr>

* 박성준: `HTML`, `Bootstrap`으로 구조 만들기
* 한상빈: `JavaScript`로 데이터 제어하기

  -> `CSS`를 잘 챙기지 못했다..

<br>
<br>

## 🚩 프로젝트 과정
<hr>

### A. 프로토타이핑
![프로토타이핑1](./%EB%B0%95%EC%84%B1%EC%A4%80/img_README/11.jpg)
![프로토타이핑2](./%EB%B0%95%EC%84%B1%EC%A4%80/img_README/2.jpg)
![프로토타이핑3](./%EB%B0%95%EC%84%B1%EC%A4%80/img_README/3.jpg)
* 상빈이가 `Figma`로 제작하기도 했지만, 거의 노트에 그려서 제작했다.


```

 to-do-list와 이번 프로젝트에서 가장 크게 느낀 것은 프로토타이핑의 중요성이었다. 코딩에 들어가기 전에 정교하게 짠 도안, 프로토타입이 없으면 나중에 고생하게 되는 것 같다.

 이 요소는 어디에 어떤 위치에 있어야 할지 미리 정확하게 짜두지 않으면 일이 더 복잡해지고 오래 걸린다.

```

<br>

### B. HTML

<details>
<summary>코드</summary>
  
```html
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>PhysicsTube</title>
  <!-- 부트스트랩 css -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <!-- 부트스트랩 아이콘 -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
  <!-- css -->
  <link rel="stylesheet" href="./css/main.css">
  <!-- 폰트 -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700;800&display=swap" rel="stylesheet">
</head>

<body>
  <!-- 화면 상단 /start -->
  <header>
    <!-- header의 상단: 홈로고, 메뉴 -->
    <div class="header-top">
      <!-- 좌상단 홈 로고 -->
      <div class="top-left">
        <a href="#">
          <span href="#" class="home-logo">
            <h1><strong>SSAFIT</strong></h1>
          </span>
          <hr class="logo-hr">
        </a>
      </div>
      <!-- 우상단 메뉴 -->
      <div class="top-right">
        <a href="#" class="home">HOME</a>
        <a href="#" class="find-gym">헬스장찾기</a>
        <a href="#" class="sign-up"><i class="bi bi-person-fill-add"></i></a>
        <a href="#" class="sign-in"><i class="bi bi-person-circle"></i></a>

      </div>
    </div>
    <!-- header의 하단: 이미지, 검색창 -->
    <div class="header-bottom">
      <div class="home-image"><img src="./img/zz.png" alt="운동"></div>
      <div class="search"><input type="text" placeholder="운동 제목을 검색해요"></div>

    </div>
  </header>
  <!-- 화면 상단 /end -->

  <!-- 주요 내용 /start -->
  <main>
    <!-- 최근 가장 많이 본 영상 -->
    <section class="recent-video">
      <div class="recent-title">
        <span class="board-title">
          <h2>최근 가장 많이 본 영상</h2>
        </span>
      </div>
      <!-- 썸네일 표시할 캐러셀 -->
      <div id="carouselExampleIndicators" class="carousel slide">
        <div class="carousel-inner">
          <div class="carousel-item active" id="pictures1">
            <!-- 썸네일 들어갈 곳!!! -->
          </div>
          <div class="carousel-item active" id="pictures2">
            <!-- 썸네일 들어갈 곳!!! -->
          </div>
        </div>
        <!-- 캐러셀 이전/다음 버튼 -->
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
          data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
          data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>
    </section>

    <!-- 가슴운동 영상: 캐러셀 작동하지 않음 -->
    <section class="recent-video">
      <div class="recent-title">
        <span class="board-title">
          <h2>가슴운동 영상</h2>
        </span>
      </div>
      <div id="carouselExample" class="carousel slide">
        <div class="carousel-inner">
          <div class="carousel-item active" id="pictures3">
            <!-- 이미지 들어가는 곳!!! -->
          </div>
          <div class="carousel-item active" id="pictures4">
            <!-- 이미지 들어가는 곳!!! -->
          </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
          data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
          data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>
    </section>

    <!-- 영상 정보/리뷰 modal -->
    <div class="modal modal-xl fade" id="review-modal" tabindex="-1" aria-labelledby="exampleModalLabel"
      aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h1 class="modal-title fs-5" id="exampleModalLabel">운동 영상 리뷰</h1>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>
          <div class="modal-body">
            <img src="./img/zz.png" alt="영상">

            <section id="review-board">
              <!-- 글쓰기 버튼 -->
              <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#writeModal"
                data-bs-whatever="@mdo">글쓰기</button>
              <!-- 글쓰기 modal -->


              <!-- 게시판 -->
              <table class="bulletin table table-striped">
                <thead>
                  <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>조회수</th>
                    <th>작성시간</th>
                  </tr>
                </thead>
                <tbody>
                </tbody>
              </table>
              <hr>
              <!-- 리뷰 페이지 123 nav -->
              <nav aria-label="Page navigation example">
                <ul class="pagination justify-content-center">
                  <li class="page-item disabled">
                    <a class="page-link">Previous</a>
                  </li>
                  <li class="page-item"><a class="page-link" href="#">1</a></li>
                  <li class="page-item"><a class="page-link" href="#">2</a></li>
                  <li class="page-item"><a class="page-link" href="#">3</a></li>
                  <li class="page-item">
                    <a class="page-link" href="#">Next</a>
                  </li>
                </ul>
              </nav>
            </section>
          </div>
          <div class="modal-footer">
          </div>
        </div>
      </div>
    </div>

    <!-- 글쓰기 modal -->
    <div class="modal fade" id="writeModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h1 class="modal-title fs-5" id="exampleModalLabel">운동 영상 리뷰</h1>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>
          <div class="modal-body">
            <form>
              <div class="mb-3">
                <label for="recipient-name" class="col-form-label">제목</label>
                <input type="text" class="form-control" id="recipient-name">
              </div>
              <div class="mb-3">
                <label for="message-text" class="col-form-label">내용</label>
                <textarea class="form-control" id="message-text"></textarea>
              </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="regist btn btn-primary" data-bs-dismiss="modal">등록</button>
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">취소</button>
          </div>
        </div>
      </div>
    </div>
  </main>
  <!-- 주요 내용 /end -->

  <!-- 부트스트랩 js -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
    crossorigin="anonymous"></script>
  <!-- 프로젝트 js -->
  <script type="text/javascript" src="./js/main.js"></script>

</body>

</html>
```
</details>

```

사실 HTML, CSS는 자신 있다고 생각해서 겁이 없었는데, 오늘 막 배운 Bootstrap을 적용시키려니 머리가 또 아파졌다. 물론 굉장히 쉽게 만들어진 친구인 건 맞지만 그날 바로 배우고 적용하기에는 이전 배운 것들과 마찰 생겨 쉽지 않았다.

HTML을 그냥 짜고 Bootstrap을 적용시키면 되었을 텐데, 급한 마음에 Bootstrap에 HTML을 끼워 맞춘 급으로 코드를 짜버리고 말았다.

```

<br>

### C. CSS
<details>
<summary>코드</summary>

```css
/* 전체 초기화 */
* {
  font-family: 'Nanum Gothic', sans-serif;
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-size: 1em;
  list-style: none;
}

/* a태그 초기화 */
a {
  text-decoration: none;
  color: black;
}

/* 상단 nav바 */
.nav-top {
  display: flex;
  justify-content: space-between;
}


/* 전체 썸네일 크기 조정 */
img {
  width: 30em;
  margin: 0px 13px 0px;
}

/* 버튼류 조정 */
button {
  background-color: black;
  color: black;
}

/* 페이지 상단 부분 정렬 */
.header-bottom {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.header-top {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
}

/* 섹션 제목 */
.board-title {
  margin: 20px 0 0 0;
}

/* 영상 정렬 */
.recent-video {
  margin: 60px 0 0 0;
  text-align: center;
}
```

</details>

```

CSS에 신경을 쓰지 못해서 정말 부끄러운 수준의 UI로 마무리가 되었다.

웹페이지를 만들 때, 어떤 순서로 만들어야 하는지 모르겠다. 나는 혼자 할 때 우선 HTML부터 짜고, JavaScript를 먼저 짤까, CSS를 먼저 짤까 고민하다가 그냥 마구잡이로 생각나는 대로 짜곤 했다.

무엇보다 똑부러지는 프로토타입이 있다면 이런 걱정은 좀 덜 수 있지 않을까?

```


<br>

### D. JavaScript

<details>
<summary>코드</summary>

```javascript

// url 설정
const URL = "https://www.googleapis.com/youtube/v3/search";
      

// key 설정
// const API_KEY = "AIzaSyCMySpqUcZcRuvYPSGT5JUuejkjEKT-_OE";
const API_KEY = "AIzaSyDApPybFJAuUePFquZzbCUCNNMCZqsBDow";



(function() {
    if(!document.querySelector("#pictures1")) return;
 
    let keyword = '맨몸운동';
    fetch(
        `${URL}?key=${API_KEY}&part=snippet&q=${keyword}&type=video&maxResults=3`
    ).then((response) => response.json())
    .then((body) => body.items)
    .then((items) => {
        const ulTag = document.querySelector("#pictures1");
        items.forEach((item) => {
            let imgTag = document.createElement("img");
            
            imgTag.src = item.snippet.thumbnails.medium.url;
            
            imgTag.setAttribute("id", "exerciseThumbnailImg");
            imgTag.setAttribute("class", "d-inline-block w-3");
            imgTag.setAttribute("alt", "xbox");
            imgTag.setAttribute("data-bs-toggle", "modal");
            imgTag.setAttribute("data-bs-target", "#review-modal");
            
            ulTag.appendChild(imgTag);

        })
    })
    keyword = '운동유튜브';
    fetch(
        `${URL}?key=${API_KEY}&part=snippet&q=${keyword}&type=video&maxResults=3`
        ).then((response) => response.json())
        .then((body) => body.items)
        .then((items) => {
            const ulTag = document.querySelector("#pictures2");
            items.forEach((item) => {
                let imgTag = document.createElement("img");
                
                imgTag.src = item.snippet.thumbnails.medium.url;
                
                imgTag.setAttribute("id", "exerciseThumbnailImg");
                imgTag.setAttribute("class", "d-inline-block w-3");
                imgTag.setAttribute("alt", "xbox");
                imgTag.setAttribute("data-bs-toggle", "modal");
                imgTag.setAttribute("data-bs-target", "#review-modal");
                
            ulTag.appendChild(imgTag);
        })
    })
    if(!document.querySelector("#pictures1")) return;
    keyword = '가슴운동';
    fetch(
        `${URL}?key=${API_KEY}&part=snippet&q=${keyword}&type=video&maxResults=3`
        ).then((response) => response.json())
        .then((body) => body.items)
        .then((items) => {
            const ulTag = document.querySelector("#pictures3");
            items.forEach((item) => {
                let imgTag = document.createElement("img");
                imgTag.src = item.snippet.thumbnails.medium.url;
                imgTag.setAttribute("id", "exerciseThumbnailImg");
                imgTag.setAttribute("class", "d-inline-block w-3");
                imgTag.setAttribute("alt", "xbox");
                imgTag.setAttribute("data-bs-toggle", "modal");
                imgTag.setAttribute("data-bs-target", "#review-modal");

            ulTag.appendChild(imgTag);
        })
    })
    keyword = '김계란 가슴운동';
    fetch(
        `${URL}?key=${API_KEY}&part=snippet&q=${keyword}&type=video&maxResults=3`
        ).then((response) => response.json())
        .then((body) => body.items)
        .then((items) => {
            const ulTag = document.querySelector("#pictures4");
            items.forEach((item) => {
                let imgTag = document.createElement("img");
                imgTag.src = item.snippet.thumbnails.medium.url;
                imgTag.setAttribute("id", "exerciseThumbnailImg");
                imgTag.setAttribute("class", "d-inline-block w-3");
                imgTag.setAttribute("alt", "xbox");
                imgTag.setAttribute("data-bs-toggle", "modal");
                imgTag.setAttribute("data-bs-target", "#review-modal");


            ulTag.appendChild(imgTag);
        })
    })

})()
var selectedThumbnail;
document.querySelector(".home-logo").addEventListener("click", ()=>{
    window.location.replace("index.html");
})

document.querySelector(".regist").addEventListener("click", () =>{
    let title = document.querySelector("#recipient-name").value;
    let content = document.querySelector("#message-text").value;

    let table = document.querySelector(".bulletin");
    console.log(table);
    console.log(table.innerHTML);
    let text = table.innerHTML;
    text += `<tr><td>1</td><td>${title}</td><td>익명</td><td>0</td><td>2023-02-10</td></tr>`;
    table.innerHTML = text;
    window.close()
  })

```

</details>

```

자바스크립트는 상빈이가 99% 만들어 주어서 특별히 첨언할 것은 없다.
나는 자바스크립트에 자신이 별로 없었고, HTML, CSS쪽을 만지고 싶었는데 상빈이는 반대여서 마음이 편했다.
덕분에 데이터 관리는 크게 신경쓰지 않고 만들 수 있었다.

이래도 되나 싶을 정도로 자바스크립트를 고려하지 않고 코드를 만들었는데, 사실 그랬으면 안 되었을 것 같다. 시간이 더 주어진다면 더 신중하게 코드를 짜야겠다.

```

<br>

## 😥 후기
<hr>

### **1. 또다시 협업의 어려움을 느꼈다.**
  * 특히 `git`을 사용하는 것이 어려웠다. 충돌 생기면 당황해서 대처를 잘 하지 못했고, 거의 공용 드라이브 쓰듯이 계속 덮어쓰고 덮어씌우기를 반복한 것 같다. 아직 **브랜치**의 개념을 제대로 이해하지 못했나보다. 그래도, 이전보다는 조금은! 더 알게 되었다고 생각한다.

  <br>

### **2. 내가 협업 자체를 별로 좋아하지 않는 것인지, 본인에게 조금 실망했다.**
  * 내가 생각한 상상 속의 협업은, ***'각자 맡은 역할을 알아서 개인적으로 완성한 뒤 그것들을 합치면 완성!'*** 인줄 알았다. 그러나 어디선가 서로의 영역에 간섭하게 되는 부분이 반드시 왔다. 나는 그런 부분 속에서, 프로젝트 흐름이 내가 생각했던 대로 흘러가지 않는다는 점, 나의 느린 템포대로 진행해선 안 된다는 점, 팀원의 기대에 부응하지 못할까봐 두렵다는 점이 나를 불편하게 만든다는 것을 알게 되었다.
  * 그렇다면 나는 협업이 적은 직업을 선택해야 할까? 협업이라는 활동에 익숙해지도록 더 노력해야 할까? (UX 관련 분야는 협업을 많이, 잘 해야 할 것 같은데..)

  <br>
  
### **3. 프로젝트는 시간 엄수!**
  * 프로젝트는 마감 기한을 정해두고 하는 활동이다. 관통프로젝트처럼 하루 안에 주어진 과제를 해내야 하는 것이 너무 힘들었다. 팀원의 눈치뿐만 아니라 다른 팀들보다 내 진행이 더딘 것 같다는 느낌이 들면 조바심이 든다. 이는 곧 자책으로 이어지기도 했다.
  
  <br>
  
### **4. `HTML`, `CSS`, `JavaScript`는 더 공부하고 싶은 욕심히 생긴다.**
  * 앞서 언급한 자책에서 비롯된 것인지, 내가 지금 너무너무 잘 못하고 있다는 비관적인 마음에 다음엔 더더 잘하고 싶다는 생각이 든다.
  * *front짱*이라는 예상치 못한 칭호가 정말정말 기분이 좋았지만, 한편으로는 더 열심히, 더 잘해야 한다는 강박이나 부담이 될 때도 있다. 열심히 하게 되는 건 좋지만, 스트레스가 되지 않도록 가볍게 생각했으면 좋겠다.
  * `HTML`, `CSS`는 이제 약간은 자신감이 생겼(었)다. `to-do-list`를 만들면서 자신감이 붙었다가, 오늘 조금 줄어들었다. 그래도 아직은 양수값이다.
  * `JavaScript`를 효율적으로 잘 짜는 능력이 부족한 것 같다. 고수의 자바스크립트 코드쇼를 보고 싶다.