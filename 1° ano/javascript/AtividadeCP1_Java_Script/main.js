function tempo(){
    let elemento1 = document.getElementById("horascomeco");
    let horas1 = parseFloat(elemento1.value);
    let elemento2 = document.getElementById("minutoscomeco");
    let minutos1 = parseFloat(elemento2.value);
    let elemento3 = document.getElementById("horastermino");
    let horas2 = parseFloat(elemento3.value);
    let elemento4 = document.getElementById("minutostermino");
    let minutos2 = parseFloat(elemento4.value);

    let tempoDeInicio = horas1 *60 + minutos1;
    let tempoDeTermino = horas2 *60 + minutos2;
    let duracao;

    if (tempoDeTermino <= tempoDeInicio){
        let respostaerro = "O horario de termino deve ser maior que o de início";
        document.getElementById("resposta").innerText = respostaerro;
    } else {
        let duracao = tempoDeTermino - tempoDeInicio;
        let horas = parseInt(duracao / 60)
        let minutos = duracao % 60;
    
        let resposta = `Duração da reunião: ${horas} horas e ${minutos} minutos.`;
        document.getElementById("resposta").innerText = resposta;
    }
}

















//function tempo(){
//    let horas1 = document.getElementById("horascomeco");
//    let minutos1 = document.getElementById("minutoscomeco");
//    let horas2 = document.getElementById("horastermino");
//    let minutos2 = document.getElementById("minutostermino");
//    let resposta = document.getElementById("resposta");
//    let resultadoDeHoras = horas2 - horas1
//    console.log(resultadoDeHoras)
//   let resultadoDeMinutos = minutos2 - minutos1
//    console.log(resultadoDeMinutos)
//}


