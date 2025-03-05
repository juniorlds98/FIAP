var pokemon1 = "src/img/piplup 2.png";
var pokemon2 = "src/img/prinplup.png";
var pokemon3 = "src/img/empoleon.png";
var nome1 = "Piplup";
var nome2 = "Prinplup";
var nome3 = "Empoleon";
var numero1 = "#001";
var numero2 = "#002";
var numero3 = "#003";

var status1 = `Status
HP: 53
Ataque: 51
Defesa: 53
Ataque Especial: 61
Defesa Especial: 56
Velocidade: 40
Total: 314`;

var status2 = `Status
HP: 64
Ataque: 66
Defesa: 68
Ataque Especial: 81
Defesa Especial: 76
Velocidade: 50
Total: 405`;

var status3 = `Status
HP: 84
Ataque: 86
Defesa: 88
Ataque Especial: 111
Defesa Especial: 101
Velocidade: 60
Total: 530`;

var habilidades = `Habilidades
Torrent
Habilidade Oculta: Defiant`;


window.onload = function(){
    trocar(pokemon1, nome1, numero1, status1, habilidades);
}

function trocar(imagem, nome, numero, status, habilidades){
    document.getElementById("figura").src = imagem;
    document.getElementById("nome").textContent = nome;
    document.getElementById("numero").textContent = numero;

    const statusList = document.getElementById("status");
    statusList.innerHTML = "";
    status.split("\n").forEach((linha, index) => {
        const item = document.createElement("li");
        item.textContent = linha;
        if (index === 0) item.classList.add("title");
        statusList.appendChild(item);
    });

    const habilidadesList = document.getElementById("habilidades");
    habilidadesList.innerHTML = "";
    habilidades.split("\n").forEach((linha, index) => {
        const item = document.createElement("li");
        item.textContent = linha;
        if (index === 0) item.classList.add("title");
        habilidadesList.appendChild(item);
    });
}

const botoes = document.querySelectorAll("footer button");

botoes.forEach(botao => {
    botao.addEventListener("click", () => {
        botoes.forEach(btn => btn.classList.remove("ativo"));
        botao.classList.add("ativo");
    });
});