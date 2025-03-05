function primo(num){
    //Inicio
    let i = 2
    while(i < num){
          //Condição
        if(num%i==0){
            console.log(i)
        }
        //passos
        i++;
    }
}
primo(6)
//--------------------------------------------------------------------------------------------------//
//resposta
//primeiro exercicio
function primo(num){
    for(let i=2;i<n;i++){
        if(num%i==0){
            return false;
        }
    }
    return true
}

x = primo(6)
if (x){
    console.log("Primo")
}else{
    console.log("Não é primo")
}


//segundo exercicio
for(let i=inicio; i<= fim; i++){
    if(primo(i)){

    }
}


//terceiro exercicio





//Outra forma

for (let i=2; i < numeroInteiro; i++){

}

//exercício você tem dois baldes, um de 3 litros e um de 5 litros e você precisa deixar o total com 4 litros
/*
balde a = B3
balde b = b5

enchebalde(b5) 5litros
despejabalde(b5) 2litros | 3 litros
esvaziabalde(b5) 2litros | 0 litros
enchebalde(b5) 2litros | 5 litros
despejabalde(b5) 3litros | 4 litros
esvaziabalde(b3) 0litros | 4 litros
*/



