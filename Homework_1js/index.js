// найдем первую кнопку по id
const btn = document.querySelector("#magic-btn");
// скопируем ее - получилась вторая кнопка. Ее можно использовать.
const clonedBtn = btn.cloneNode(true);
// задали id


const clonedBtnElement=document.getElementById("magic-btn-2");

document.body.appendChild(clonedBtn)
btn.addEventListener('click', () => {
  // при нажатии на первую кнопку
  // работайте с clonedBtn
  // ваш код начинается здесь
  const btn = document.createElement("button");
  clonedBtn.id = "magic-btn-2";
  clonedBtn.textContent = "Я изменю тебя";
  clonedBtn.style.backgroundColor = "#a78b71";
  clonedBtn.style.color = "white";
})

clonedBtn.addEventListener("click", ()=>{
  btn.style.backgroundColor = "#9c4a1a";
  btn.style.color = "black";
})


// здесь можете создать EventListener для второй кнопки
