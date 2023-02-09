init();
// 추가버튼 클릭시 행추가 이벤트
function init() {
    const addBtnList = document.querySelectorAll('button.add');
    const tableList = document.querySelectorAll('table.table');

    // add 버튼에 tableNo 속성 부여 (어떤 리스트의 add인지 구분)
    addBtnList.forEach(function (addBtn, index) {
        addBtn.classList.replace('add', `add${index}`);
    });
    // table 번호맥기기기
    tableList.forEach(function (table, index) {
        table.classList.replace('table', `table${index}`);
    });
    //
    console.log(addBtnList);
    for (let i = 0; i < addBtnList.length; i++) {
        addBtnList[i].addEventListener("click", function () {

            addRow(i);
            
        });
    }
}




function addRow(idx) {


    const table = document.querySelector(`.table${idx}`);
    //

    console.log(table);
    const newRow = table.insertRow();
    const newCell1 = newRow.insertCell(0);
    const newCell2 = newRow.insertCell(1);
    const newCell3 = newRow.insertCell(2);

    
    const check = '<td><input type="checkbox"></td>';
    const content = '<td><input type="text" class="text" autofocus></td>';
    newCell1.innerHTML = check;
    
    newCell2.innerHTML = content;
    newCell3.innerText = 'ㅁㅁ';
}

