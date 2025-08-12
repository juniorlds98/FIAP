public class Main {
    public static void main(String[] args) {
    /*Atribuindo valores - Operadores*/
        var dados = 10;
        dados = 11;
        dados = 12;

        /*Operadores matematicos + - * / */
        var soma = 10 + 10;
        var sub = 20 - 10;
        var mul = 3 * 3;
        var div = 30 / 10;

        /*Atribuição de valores e operação simultaneamente*/
        var valorA = 10;

        valorA = valorA + 10;
        System.out.println("Valor A: " + valorA);

        valorA += 10;
        System.out.println("Valor A: " + valorA);
        /*A mesma atribuição chegando ao mesmo valor*/


        /*Incremento e decremento - Operadores ++ ou --*/

        var valorB = 20;
        valorB = valorB + 1;
        System.out.println("Valor B: " + valorB);

        valorB ++;
        System.out.println("Valor B: " + valorB);

        valorB --;
        System.out.println("Valor B: " + valorB);

        //Comparação - Operadores == != > < >= <=
        //São validos para tipos primitivos, classes não entram nisso

        var compA = 10;
        var compB = 11;

        System.out.println(compA == compB);
        System.out.println(compA != compB);
        System.out.println(compA < compB);
        System.out.println(compA > compB);
        System.out.println(compA <= compB);
        System.out.println(compA >= compB);

        //Classificação dos operadores

        var unario = -10; //Unário: age apenas em um valor
        var binario = 10 + 10; //Ele age entre dois valores
        var ternario = (10 > 9) ? "Dez é maior" : "Dez é menor"; //Trabalha com a decomposição de 3 etapas (Operador Elvis)
        System.out.println(ternario);

        var idade = 19;
        var habilitacao = (idade >= 18) ? "Pode tirar habilitação": "Não pode tirar habilitação";
        System.out.println(habilitacao);


        //Operadores lógicos: AND &&, OR ||, NOT -!
        System.out.println("a" == "a" && 10 > 11); // AND &&
        System.out.println("a" == "a" || 10 > 11); // OR ||
        System.out.println(!("a" == "a")); //NOT - !
    }
}