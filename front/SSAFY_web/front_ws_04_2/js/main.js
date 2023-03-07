
// 중복 허용하지 않도록 개선 필요
// 삭제 기능 추가?

// localStorage 임시 클리어 (주석)
// localStorage.clear();



// 초기 세팅
// - 버튼의 인덱스 설정 (해당하는 영화를 index로 탐색하기 위함)
// --->> 해당 영화를 찾는 좋은 메소드들이 있었다..
// --- 부모, 자식 형제 찾는 메소드들.
// addLike(index)
// printLike()
function init() {

  if (localStorage.getItem('like_movie') == null) {
    var like_movies = new Array();
  }
  else {
    var like_movies = JSON.parse(localStorage.getItem('like_movie'));
  }
  printLike(like_movies);

  const like_button_list = document.querySelectorAll("div.like");
  // 버튼을 누르면 그 index의 addLike 호출 (localStorage에 추가)
  like_button_list.forEach(function (value, index) {
    like_button_list[index].addEventListener('click', function () {
      addLike(like_movies, index);
    });
  });




}

// 찜 버튼을 눌렀을 때 localStorage에 JSON형식으로 추가
function addLike(like_movies, index) {

  let like_movie = {
    movie_title: document.querySelector(`ul.movies li:nth-child(${index + 1}) span.movie-title`).innerText
    , genre: document.querySelector(`ul.movies li:nth-child(${index + 1}) span.genre`).innerText
    , director: document.querySelector(`ul.movies li:nth-child(${index + 1}) span.director`).innerText
    , running_time: document.querySelector(`ul.movies li:nth-child(${index + 1}) span.running-time`).innerText
  }
  // 찜목록(로컬스토리지)이 비어 있으면 새로 찜목록 객체 배열을 생성



  like_movies.push(like_movie);
  localStorage.setItem(`like_movie`, JSON.stringify(like_movies));
  printLike();

};


function printLike(like_movies) {
  // 찜목록을 출력할 찜리스트의 html위치
  const displayLike = document.querySelector('aside.like-list > ul.like-comment')

  // 데이터가 있으면 그 목록을 출력한다.
  if (like_movies != null) {
    // 각 객체의 정보 조회
    like_movies.forEach(function (movie_obj, index) {
      let movie_title = movie_obj.movie_title;
      let genre = movie_obj.genre;
      let director = movie_obj.director;
      let running_time = movie_obj.running_time;
      let like_movie_info = movie_title + " | " + genre + " | " + director + " | " + running_time;

      if (index == 0) {
        displayLike.innerHTML = `<li class="my-like-list">* ${like_movie_info}</li><br>`;
      }

      else {
        displayLike.insertAdjacentHTML ('beforeend', `<li class="my-like-list">* ${like_movie_info}</li><br>`);
      }
    });
  }

  // 데이터가 없으면 기본 문장을 출력한다.
  else {
    displayLike.innerHTML = '<span class="my-like-list" name="base">인생 영화를 찜해주세요!!</span>';
  }
}


init();