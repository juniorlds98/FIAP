const nome = document.querySelector("#nome")
const numero = document.querySelector("#numero")
const btn = document.querySelector("#btn")
const camisaNome = document.querySelector("#camisa_nome")
const camisaNumero = document.querySelector("#camisa_numero")

btn.addEventListener("click", () => {
    nomeUser = nome.value
    camisaNome.innerHTML = nomeUser

    numUser = numero.value
    camisaNumero.innerHTML = numUser
})