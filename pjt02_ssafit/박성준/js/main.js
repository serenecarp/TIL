
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