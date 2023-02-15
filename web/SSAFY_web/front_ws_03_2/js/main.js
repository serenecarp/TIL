
// 초기 설정 함수
// 해당 버튼을 누르면 그 버튼 index로 printLike 호출하도록

function init() {
  let like_button_list = document.querySelectorAll("div.like");
    // 그냥 for문
  // for (let index = 0; index < like_button_list.length; index++) {
  //   like_button_list[index].addEventListener("click", function () {
  //     saveLike(index);
  //   });
  // }

  // forEach문
  like_button_list.forEach(function(value, index) {
    like_button_list[index].addEventListener('click', function() {
      saveLike(index);
    });
  });

}

// 찜 버튼(submit)을 눌렀을 때, 찜목록의 index와 일치하는 영화li의 정보를 읽어 옴
function saveLike(index) {
  let movie_title = document.querySelector(`ul.movies li:nth-child(${index+1}) span.movie-title`).innerText;
  let genre = document.querySelector(`ul.movies li:nth-child(${index+1}) span.genre`).innerText;
  let director = document.querySelector(`ul.movies li:nth-child(${index+1}) span.director`).innerText;
  let running_time = document.querySelector(`ul.movies li:nth-child(${index+1}) span.running-time`).innerText;

  console.log(
    movie_title + "\n"
    + genre + "\n"
    + director + "\n"
    + running_time + "\n"
    + "찜"
  )
};

init();


