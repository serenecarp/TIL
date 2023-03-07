

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
  const htmlContent = '<input type="text" class="text" placeholder="     휴지통 눌러도 삭제가 안돼요.." autofocus>';
  const htmlEdit = `<button class="delete"><img src=" ./img/delete.png" alt="add"></button>`;
  newCell1.innerHTML = htmlCheck;
  newCell2.innerHTML = htmlContent;
  newCell3.innerHTML = htmlEdit;
  const newDelBtn = table.childNodes[1].childNodes[1].childNodes[5].childNodes[1].childNodes[1];
  
  newDelBtn.addEventListener("click", function () {
    
    delRow(newDelBtn.parentElement.parentElement.parentElement);
  });
  // const newDelBtn = table.childNodes[1].childNodes[1].childNodes
}


function delRow(tr) {
  tr.remove();
}



function saveData() {
  let toDoList = {

  }
}

function isChecked() {
  let checkboxList = document.querySelectorAll('input[type="checkbox"');
}


init();