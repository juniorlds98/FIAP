
public class Main {
    public static void main(String[] args) {
        //Tipos primitivos

        int numInteiro = 10;
        float numDecimal = 8.55f; //obrigatoriamente precisa ter o F de float
        char caracter = 'b';

        //Trabalhando com Classes

        String umTexto = "UmTexto";
        //Se tiver letra maiúscula é uma classe e não um primitivo
        //Aspas simples é para caracter e para um texto aspas duplas
        //Recomenda-se que uma string tenha até 67k caracteres


        //Três formas de String:

        //Forma 1 - String com conteúdo

        String comConteudo = "Com conteúdo";

        //Forma 2 - String sem conteúdo

        String semConteudo = "";

        //Forma 3 - String em branco

        String emBranco = "     ";


        //Problemas com String
        //É comum o tipo string representar dados que ele não deveria representar
        String data = "08/10/1988";
        String numeroInteiro = "10";
        String numeroDec = "77.99";
        String cpf = "011.987.678-00"; //Esse número deve ser uma string pois tem um caracter especial

    }
}