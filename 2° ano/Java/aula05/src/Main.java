
public class Main {
    public static void main(String[] args) {
        boolean lightIsOn = false;

        //Simples - avalio o próprio boolean
        System.out.println(lightIsOn);

        //Media - operadores comparação
        System.out.println(10>9);

        //Complexa - Operadores lógicos
        System.out.println(10 < 9 && lightIsOn);

        //Sintaxe do if
        //Sintaxe: if(expressão booleana){instruções a serem executadas}
        if(lightIsOn){
            System.out.println("A estação está ligada!");
        }
        //Sintaxe do else
        //O else vem SEMPRE depois de um if
        //Sintaxe: else{instruções a serem executadas}
        if(10 > 9){
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
        //Trabalhando com expressões complexas
        String user = "FiapUser";
        String password = "Fiap1234";

        if(user.equals("FiapUser") && password.equals(("Fiap1234"))){
            System.out.println("Login efetuado com sucesso!");
        }else{
            System.out.println("Erro ao efetuar o login.");
        }
        //Operador OR ||
        boolean credito = true;
        boolean debito = false;

        if(credito || debito){
            System.out.println("Pagamento efetuado com sucesso");
        }else{
            System.out.println("Erro ao processar o pagamento");
        }


        //Trabalhando com operador not !
        String textField = "Joaquim da Silva";

        if(/*Negar afirmação*/!textField.isEmpty()){
            System.out.println("Nome encontrado" + " " + textField);
        }else{
            System.out.println("Preencha o campo corretamente!");
        }


        //Trabalhando com if / else if / else

        String semaforo = "vermelho";

        if (semaforo.equals("vermelho")){
            System.out.println("Pare");
        }else if (semaforo.equals("amarelo")) {
            System.out.println("Atenção");
        }else{
            System.out.println("Passe");
        }

        //Trabalhando com switch/case

        int diaSemana = 1;

        switch(diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            //Caso não seja coberto por nenhuma variável
            default:
                System.out.println("Dia da semana não encontrado");
        }

        //Trabalhando com operador ternário - Operador Elvis ?:

        int horaDia = 10;

        String resultado = (horaDia < 18) ? "Que dia lindo!" : "Que noite linda!";
        System.out.println(resultado);

        //Arrays primitivos - São rápidos mas limitados
        //Só pode ser colocado elementos do mesmo tipo
        //Tod0 array de java tem indice base 0
        int[] numParesUmDigito = {2, 4, 6, 8};
        String[] frutasComM = {
                "Melancia",
                "Maça",
                "Melão",
                "Mamão",
                "Marmelo"
        };

        //Imprimir um elemento de um array primitivo

        System.out.println(frutasComM[0]);

        //Imprimir todos os itens de um array
        System.out.println(frutasComM);

        //Lista - são mais lentas mas extremamente cheias de recursos
    }
}