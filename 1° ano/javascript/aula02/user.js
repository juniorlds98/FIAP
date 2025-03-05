import { rg, nomeFake, sobrenomeFake, emailFake } from "./fakers.js"; 
export default function createUser (){ //Quando for default não precisa deixar claro o que vai ser exportado
    let firstName = nomeFake()
    let obj = {
        firstName: nomeFake(),
        lastName: sobrenomeFake(),
        rg: rg(),
        email: emailFake()
    }
    return obj
}