let impToDoLists = [];
let comToDoLists = [];

function init() {
  // 항목 추가 버튼 모으기
  const addBtnList = document.querySelectorAll('button.add');
  let delBtnList = document.querySelectorAll('button.delete');
  const saveBtn = document.querySelector('input.save-button');

  saveBtn.addEventListener("click", function() {
  window.alert("아직 기능을 구현하지 못했어요.");
  });

  // 항목 추가 -> addRow
  addBtnList.forEach(function (addBtn) {
    let thisTable = addBtn.parentElement.previousElementSibling;
    addBtn.addEventListener("click", function () {

      addRow(thisTable);
    });
  });

  // 항목 삭제 -> delRow
  delBtnList.forEach(function (delBtn) {
    let thisTable = delBtn.closest('table');
    delBtn.addEventListener("click", function () {
      delRow(thisTable.childNodes[1].childNodes[1]);
    });
  });

  saveBtn.addEventListener("click", function() {
    saveData();
  });

}

function onClickDelete(table) {
  
}


// 행 추가
function addRow(table) {

  const newRow = table.insertRow();
  const newCell1 = newRow.insertCell(0);
  const newCell2 = newRow.insertCell(1);
  const newCell3 = newRow.insertCell(2);


  const htmlCheck = '<input type="checkbox">';
  const htmlContent = '<input type="text" class="text" placeholder="휴지통 눌러도 삭제가 안돼요.." autofocus>';
  const htmlEdit = `<button class="delete"><img src=" ./img/delete.png" alt="add"></button>`;
  newCell1.innerHTML = htmlCheck;
  newCell2.innerHTML = htmlContent;
  newCell3.innerHTML = htmlEdit;

  console.log(table.childNodes[1].lastChild.lastChild);
  const newDelBtn = table.childNodes[1].lastChild.lastChild;
  newDelBtn.addEventListener("click", function () {
    console.log(newDelBtn);
    console.log(newDelBtn.parentElement.parentElement);
    delRow(newDelBtn.parentElement.parentElement);
  });
}


function delRow(tr) {
  tr.remove();
}



function saveData() {
  localStorage.setItem(imp, JSON.stringify(impToDoLists));
  localStorage.setItem(com, JSON.stringify(comToDoLists));
}

function isChecked() {
  let impCheckbox = document.querySelectorAll('#important input[type="checkbox"');
  let comCheckbox = document.querySelectorAll('#common input[type="checkbox"');
}

// function setToDoVal() {

//   let impToDoval = document.querySelectorAll('#important input[type="text"]');
//   impToDoval.forEach(function(toDoVal){
//     toDoVal.setAttribute('value');
//   });
//   let comToDoval = document.querySelectorAll('#common input[type="text"]');
//   console.log(impToDoval);
//   console.log(comToDoval);
// }

init();

// setToDoVal();