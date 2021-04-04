var storyArray = [];

function checkValue(value, name, id) {
    switch (id) {
        case "coefA": {
            if (!+value) {
                coefA.classList.add("invalid");
            } else {
                coefA.classList.remove("invalid");
            }
            break;
        }
        case "coefB": {
            if (!+value) {
                coefB.classList.add("invalid");
            } else {
                coefB.classList.remove("invalid");
            }
            break;
        }
        case "coefC": {
            if (+value || +value === 0) {
                coefC.classList.remove("invalid");
            } else {
                 coefC.classList.add("invalid");
            }
            break;
        }
    }
}

function calculationOfRoots() {
    var A = document.getElementById('coefA').value;
    var B = document.getElementById('coefB').value;
    var C = document.getElementById('coefC').value;
    if (C === "") {
        C = 0;
    }


    A = parseFloat(A);
    B = parseFloat(B);
    C = parseFloat(C);

    let d = (+B) * (+B) - 4 * (+A) * (+C);
    let x1 = 0, x2 = 0;
    if (d > 0) {
        x1 = ((-B) - Math.sqrt(d)) / (2 * A);
        x2 = ((-B) + Math.sqrt(d)) / (2 * A);
    }
    if (d === 0) {
        x1 = -(B / (2 * A));
    }
    insertInTable(x1, x2);
}

function insertInTable(x1, x2) {
    let tableRef = document.getElementById('tableHistory').getElementsByTagName('tbody')[0];
    let newRow = tableRef.insertRow(tableRef.rows.length);
    let newCell = newRow.insertCell(0);
    if (x1 === 0 && x2 === 0) {
        storyArray.push({
            name: "Действительных корней уравнения не существует",
            id: storyArray.length
        });
    } else {
        storyArray.push({
            name: "x1 = " + x1 + " x2 = " + x2,
            id: storyArray.length
        });
    }
    newRow.id = storyArray.length - 1 + '';
    newCell.innerHTML = storyArray[storyArray.length - 1].name + '<button class="cleaning-button" onclick="deletePointerStory(event)"></button>';
}

function deletePointerStory(event) {
    let elementId = event.path[2].id;
    storyArray.splice(elementId, 1);

    refreshTable();
}

function refreshTable() {
    let tableRef = document.getElementById('tableHistory').getElementsByTagName('tbody')[0];
    tableRef.innerHTML = "";
    storyArray.forEach((story, id) => {
        let newRow = tableRef.insertRow(tableRef.rows.length);
        let newCell = newRow.insertCell(0);
        newRow.id = String(id);
        newCell.innerHTML = story.name + '<button class="cleaning-button" onclick="deletePointerStory(event)"></button>';
    })
}



