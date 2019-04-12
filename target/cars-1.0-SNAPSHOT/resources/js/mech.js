const element = document.getElementById('mechanic_container');

function createMechanicCard(mechanic) {
    return '<div class="card bg-dark text-white">\n' +
        ' <img class="card-img-top" src="/resources/images/mechanics/' + mechanic.photoPath + '" alt="Card image cap">\n' +
        ' <div class="card-body">\n' +
        ' <h5 class="card-title">' + mechanic.firstName + ' ' +mechanic.lastName + '</h5>\n' +
        ' <p class="card-text">Опыт: ' + mechanic.experience + '</p>\n' +
        ' <p class="card-text">' + mechanic.position + '</p>\n' +
        ' </div>\n' +
        ' </div>\n';
}


function getAllMechanics(){
    $.ajax({
        url: '/mechanics/getAll', // указываем URL и
        dataType : "json", // тип загружаемых данных
        success: function (data) { // вешаем свой обработчик на функцию success
            for (const mech of data){
                element.insertAdjacentHTML('beforeend', createMechanicCard(mech));
            }
        }
    });
}


getAllMechanics();