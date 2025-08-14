
public class Main {
    public static void main(String[] args) {

        //Primitivo char
        char umChar = 35;
        System.out.println(umChar);
        char char1 = 'F';
        char char2 = 'I';
        char char3 = 'A';
        char char4 = 'P';

        //Uma string é uma coleção de char, como se fosse um array
        //Uma String no mínimo vai ocupar 67 mil posições
        String fiap = "" + char1 + char2 + char3 + char4;
        System.out.println(fiap);

        //Problemas com Strings
        //Concatenação de Strings
        String numeroInteiroA = "10";
        String numeroInteiroB = "20";

        System.out.println(numeroInteiroA + numeroInteiroB);

        //Comparação de Strings - Não se deve usar o simbolo de comparação entre Strings, serve SOMENTE para tipos primitivos
        //Java é 100% case sensitive, então se tiver diferença entre letras maiusuculas e minusculas ele não entende como igual

        String compA = "Um texto";
        String compA2 = "Um texto";
        String compB = "Outro texto";
        //Transformar em maiuscula
        String transformadaA = compA.toUpperCase();
        String transformadaB = compB.toUpperCase();
        System.out.println(transformadaA.equals(transformadaB));


        //Métodos

        String testando = "Bem-vindo ao mundo dos textos";

        //Verificar se a string está vazia
        System.out.println(testando.isEmpty());

        //Verificando se uma String está em branco
        System.out.println(testando.isBlank());

        //Verificando se uma string tem um fragmento de texto
        System.out.println(testando.contains("mundo"));

        //Verificando a quantidade de simbolos em uma string

        System.out.println(testando.length());

        //Verificando o primeiro caractere de uma String
        //A partir do Java 21, nasceu o método .first

        System.out.println(testando.charAt(5));

        //Verificando o último caractere de uma String

        System.out.println(testando.charAt(testando.length() -1));

        //Puxando um intervalo de uma String
        System.out.println(testando.substring(0, 3));


        //Deixando uma String com todos os caracteres em maíusculo ou minusculo

        System.out.println(testando.toUpperCase());
        System.out.println(testando.toLowerCase());

        //Trabalhando com emenda de texto

        String nome = "Joaquim";
        String sobrenome = "Nunes";

        //Forma 1 - Concatenação ou somatoria de textos (+)

        System.out.println(nome + " " + sobrenome);

        //Forma 2 - Interpolação - .format()
        //Os fragmentos a serem inseridos devem ser indicados com o scape %s
        String formatada = String.format("Ola, meu nome é %s, e meu sobrenome é %s", nome, sobrenome);
        System.out.println(formatada);

        //Trabalho com blocos de texto

        String blocoDeTexto = """
                Ó mar salgado, quanto do teu sal
                São lágrimas de Portugal!
                Por te cruzarmos, quantas mães choraram,
                Quantos filhos em vão rezaram!
                Quantas noivas ficaram por casar
                Para que fosses nosso, ó mar!
                """;
    }
}