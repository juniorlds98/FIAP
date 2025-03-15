import chalk from "chalk";
import {catNames, randomCatName} from "cat-names";

export default function gatinhos(){
    const nomeGatinho = randomCatName()

    const mensagemDoGatinho = ["Eu sou o mestre das sonecas!",
        "Cuidado, eu sou um ninja de pelo macio!",
        "Se eu me esconder, você nunca vai me encontrar!",
        "Miau! Quem é o gatinho mais fofo? Eu sou!",
        "Minha missão é caçar... almofadas!",
        "Eu sou especialista em espreguiçar o corpo!",
        "Os humanos são engraçados... sempre me dando carinho!",
        "O que você está fazendo? Eu estou de olho em você!",
        "Gatos não andam, eles deslizam!",
        "Meu brinquedo favorito? O que você está segurando!",
        "Você pode me chamar de 'Gato Pulo', porque sou rápido como um raio!",
        "Estou treinando para ser o rei da casa.",
        "Esqueça a bolinha de lã, eu sou o verdadeiro show!",
        "Estou apenas descansando... e também planejando minhas próximas travessuras!",
        "Alguém viu minha cauda? Ela estava aqui há pouco tempo."]

    const fraseAleatoria = mensagemDoGatinho[Math.floor(Math.random()*mensagemDoGatinho.length)]
    
    const espacoExtra = 6;
    const larguraMensagem = fraseAleatoria.length + nomeGatinho.length;
    const larguraCaixa = larguraMensagem + espacoExtra;
    
    const gatos = [`
 //\\_/\\  
  ( o.o ) ┌${"─".repeat(larguraCaixa)}┐
  > ^ <   |${nomeGatinho} diz: ${fraseAleatoria}|
          └${"─".repeat(larguraCaixa)}┘
`,
`
 //\_/\\  
( =^.^= ) ┌${"─".repeat(larguraCaixa)}┐
  (")(")  |${nomeGatinho} diz: ${fraseAleatoria}|
          └${"─".repeat(larguraCaixa)}┘
`,
`
//\\_/\\  
( =^-^= ) ┌${"─".repeat(larguraCaixa)}┐
(")(")    |${nomeGatinho} diz: ${fraseAleatoria}|
          └${"─".repeat(larguraCaixa)}┘
`,
`        
/\\_/\\  
(=^.^=)  ┌${"─".repeat(larguraCaixa)}┐
(")(")   |${nomeGatinho} diz: ${fraseAleatoria}|
         └${"─".repeat(larguraCaixa)}┘
`
,
]
    let gatosAleatorios = gatos[Math.floor(Math.random()*gatos.length)]

    return chalk.blue(gatosAleatorios)
}