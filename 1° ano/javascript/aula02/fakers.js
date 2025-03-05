import nomes from "./nomes.js"
import sobrenome from "./sobrenome.js"
import emails from "./emails.js"

function rg(){
    return Math.random().toString().slice(3, 12)
};

function nomeFake(){
    let idx = parseInt(Math.random()*nomes.length)
        return nomes[idx]
}

function sobrenomeFake(){
    let idx = parseInt(Math.random()*sobrenome.length)
        return sobrenome[idx]
}

function emailFake(nome){
    let idx = parseInt(Math.random()*emails.length)
    let dominio = emails[idx]
    return nome.toLowerCase()+"@"+dominio
    
}

export{rg, nomeFake, sobrenomeFake, emailFake}