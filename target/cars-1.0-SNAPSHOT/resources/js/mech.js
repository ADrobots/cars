const mechanics = [
    {
        fullName:'Kyle Broflovski',
        experience: 4,
        description: 'Механик от бога',
        photo: 'kyle-broflovski.png'
    },
    {
        fullName:'Eric Cartman',
        experience: 3,
        description: 'Мастер по клапанам',
        photo: 'eric-cartman.png'
    },
    {
        fullName:'Stan Marsh',
        experience: 5,
        description: 'Эксперт в шиномонтаже',
        photo: 'stan-marsh.png'
    },
    {
        fullName:'Kenny McCormick',
        experience: 1,
        description: 'Водитель испытатель',
        photo: 'kenny-mccormick.png'
    }
]

const element = document.getElementById('mechanic_container');

function createMechanicCard(mechanic) {
    return '<div class="card bg-dark text-white">\n' +
        ' <img class="card-img-top" src="images/mechanics/' + mechanic.photo + '" alt="Card image cap">\n' +
        ' <div class="card-body">\n' +
        ' <h5 class="card-title">' + mechanic.fullName + '</h5>\n' +
        ' <p class="card-text">Опыт: ' + mechanic.experience + '</p>\n' +
        ' <p class="card-text">' + mechanic.description + '</p>\n' +
        ' </div>\n' +
        ' </div>\n';
}

for (mech of mechanics) {
    element.insertAdjacentHTML('beforeend', createMechanicCard(mech));
}
