// 1- Eliminar el primer elemento hijo desde el padre.
cardContainer.removeChild(cardContainer.children[0]);

// 2-  Eliminar, desde él mismo, el elemento cuya clase es "cards redClass".
cardContainer.removeChild(cardContainer.children[1]);

// 3- Crear un elemento h1 con vuestro nombre.
const yo = document.createElement("H1");
yo.textContent = "Ignacio";

// 4- Crear un elemento enlace con texto "Vedruna" y cuyo href sea la pagina del vedruna.
const link = document.createElement("a");
link.setAttribute("href", "https://vedrunasevilla.org/");
link.textContent = "Vedruna";

// 5- Crear un elemento boton cuyo id sea "botonJoker" y su texto sea "boton".
const button = document.createElement("button");
button.id = "BotonJoker";
button.textContent = "boton";

// 6- Crear un elemento div cuya clase sea "cards greenClass".
const classdiv = document.createElement("div");
classdiv.className = "cards greenClass";

// 7- Añadir al elemento div creado anteriormente los h1, enlace y boton creados anteriormente.
classdiv.appendChild(yo);
classdiv.appendChild(link);
classdiv.appendChild(button);

// 8-  Añadir a cardContainer el div del apartado anterior.
cardContainer.appendChild(classdiv);