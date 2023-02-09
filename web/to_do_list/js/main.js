init();

function init() {
  // 항목 추가 버튼 모으기
  const addBtnList = document.querySelectorAll('button.add');
  
  
  // 항목 추가 -> addRow
  addBtnList.forEach(function (addBtn) {
    let thisTable = addBtn.parentElement.previousElementSibling;
    addBtn.addEventListener("click", function () {
      
      addRow(thisTable);
    });
  });

  let saveBtn = document.querySelector('.save-button');
  saveBtn.addEventListener("click", function(){
    saveData();
  });

}



// 행 추가
function addRow(table) {

  const newRow = table.insertRow();
  const newCell1 = newRow.insertCell(0);
  const newCell2 = newRow.insertCell(1);
  const newCell3 = newRow.insertCell(2);


  const htmlCheck = '<input type="checkbox">';
  const htmlContent = '<input type="text" class="text" placeholder="     오늘의 할 일을 입력해요." autofocus>';
  const htmlEdit = `<button class="delete"><img src=" ./img/delete.png" alt="add"></button>`;
  newCell1.innerHTML = htmlCheck;
  newCell2.innerHTML = htmlContent;
  newCell3.innerHTML = htmlEdit;
}






function saveData() {
  let toDoList = {

  }
}

function isChecked() {
  let checkboxList = document.querySelectorAll('input[type="checkbox"');
}