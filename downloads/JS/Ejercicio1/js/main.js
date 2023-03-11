// 1- Pedir por pantalla mediante un prompt tu nombre y almacenarlo en una variable.
var yo= prompt("¿Cuál es tu nombre?");
//2- Seleccionar el h1 cuyo id sea titulo y almacenarlo en una variable constante
const titulo= document.querySelector("h1#titulo");
//3- Cambiar el textContent del elemento anterior por un String que diga "Hola " y 
// el nombre introducido por el prompt
titulo.textContent="Hola "+ yo;
//4- Añadir al className del elemento anterior la clase " letraRoja"
titulo.className+=" letraRoja";
//5- Seleccionar el div contenedor de cartas y almacenarlo en una variable constante 
const cartas= document.querySelector("div#contenedorCartas");
//6- Añadir al innerHTML del elemento anterior un div con las clases "carta" y "fondoRojo" 
cartas.innerHTML+= '<div class="carta fondoRojo"></div>'
//7- Seleccionar el div cuya clase sea "carta fondoRojo" y almacenarlo en una variable constante
const carta = document.querySelector("div.carta.fondoRojo")
//8- Añadir al innerHTML del elemento anterior un <p> en el que aparezca escrito "Esto es el contenido"
carta.innerHTML +='<p>"Esto es el contenido"</p>'