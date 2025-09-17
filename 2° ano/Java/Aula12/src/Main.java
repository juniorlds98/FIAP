
public class Main {
    public static void main(String[] args) {
        //Provocando Exceptions - ISSO NÃO É ERRO.
        String [] frutas = {"Maça", "Banana", "Mamão"};
        //Exception 1
        //System.out.println(frutas[3]); //Ao Acessar indices

        //Exception 2
        //int divisao = 10/0; //Divisão inexistente (por 0)

        //Exception 3
        String nula = null;
        //System.out.println(nula.toUpperCase()); //Acesso de elemento nulo

        float altura = 1.80f;

        //Incompatibilidade de tipos
        String umTexto = "Um Texto";
        //umTexto = 10;

        //Declaração não resolvida
        //System.out.println(pipoca);


        //Três formas de contronar uma Exception
        // Forma 1 - Providenciar o que é necessário para não quebrar
        umTexto = "Outro Texto";
        System.out.println(frutas[2]); //Indique um índice que faça sentido para a linguagem

        // Forma 2 - Trabalhar com testes automatizados

        // Forma 3 - Estrutura try/catch

        try{
            //Se faz a tentativa de executar alguma instrução
            System.out.println(frutas[2]);
            System.out.println("Foi");
        }
        catch (ArrayIndexOutOfBoundsException umaExcept){
            System.out.println("Erro ao executar o código: ");
            System.out.println(umaExcept);
        }

        try {
            umTexto = null;
            System.out.println(umTexto.toUpperCase());
            System.out.println("foi");
        }
        catch (NullPointerException umaExcept){
            System.out.println("Erro ao executar o código: ");
            System.out.println(umaExcept);
        }
        //Criando estrutura try/catch para captar qualquer exception

        try{
            System.out.println(frutas[0]);
            int div = 84/0;
            umTexto = null;
            System.out.println(umTexto.toUpperCase());
            System.out.println("Foi");
        }
        catch (Exception umaExcept){
            System.out.println("Erro ao executar o código: ");
            System.out.println(umaExcept);
        }

        //Trabalhando com o bloco finally

        try{
            int div = 76/0;
            System.out.println("Foi");
        }
        catch (Exception umaExcept){
            System.out.println("Não foi");

        }
        //O finally SEMPRE será executado
        finally {
            System.out.println("Chegou no final da execução");
        }
    }
}