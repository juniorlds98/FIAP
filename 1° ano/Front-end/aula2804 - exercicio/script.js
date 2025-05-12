let filter = document.querySelectorAll(".time_filter-item")
let jogador = document.querySelectorAll(".time_jogador")

filter.forEach(elem => {
    elem.addEventListener("click", () =>{
        filterId = elem.getAttribute("id")

        jogador.forEach(idx => {
            posicao = idx.getAttribute("class")

            if(filterId == "all"){
                idx.classList.remove("disable")
            } else if(posicao != ("time_jogador " + filterId)){
                idx.classList.add("disab")
            }
        })
    })
})

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