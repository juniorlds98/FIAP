import encript from "./crypto.js";
import readlineSync from "readline-sync"
import chalk from "chalk"
import faker from "faker-br"

console.log(encript("Oi gente"));

let nome = readlineSync.question("Qual é seu nome?");
console.log ("Oi " + nome + "!");
console.log(chalk.blue("Hello") + chalk.red(" World!") )

let meuCpf = faker.br.cpf()
console.log(meuCpf);

let cep = faker.address.zipCode()
console.log(cep);

let nome = faker.name.firstName()
console.log(nome);