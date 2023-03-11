
//Ejercicio 1
const redBtn = document.getElementById("red");
const blueBtn = document.getElementById("blue");
const greenBtn = document.getElementById("green");
const resetBtn = document.getElementById("reset");
const body = document.querySelector("body");

redBtn.addEventListener("click", changeThemeRed);
blueBtn.addEventListener("click", changeThemeBlue);
greenBtn.addEventListener("click", changeThemeGreen);
resetBtn.addEventListener("click", resetTheme);


function changeThemeRed() {
  body.style.backgroundColor = "red";
  body.style.color = "white";
}

function changeThemeBlue() {
  body.style.backgroundColor = "blue";
  body.style.color = "white";
}

function changeThemeGreen() {
  body.style.backgroundColor = "green";
  body.style.color = "white";
}

function resetTheme() {
  body.style.backgroundColor = "black";
  body.style.color = "white";
}

//Ejercicio 3

const emailInput = document.getElementById("email");
const errorText = document.getElementById("error");

emailInput.addEventListener("blur", validateEmail);

function validateEmail() {
  const email = emailInput.value;
  const emailRegex = /^\S+@\S+\.\S+$/;

  if (email === "") {
    setError("El campo de correo electrónico no puede estar vacío.");
  } else if (!emailRegex.test(email)) {
    setError("Por favor, introduce una dirección de correo electrónico válida.");
  } else {
    setSuccess();
  }
}

function setError(errorMessage) {
  emailInput.classList.remove("success");
  emailInput.classList.add("error");
  errorText.textContent = errorMessage;
}

function setSuccess() {
  emailInput.classList.remove("error");
  emailInput.classList.add("success");
  errorText.textContent = "";
}





 
