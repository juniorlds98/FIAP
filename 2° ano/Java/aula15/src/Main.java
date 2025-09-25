import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //Lambda é definida como uma função in-line (feita em uma unica linha) anônima que pode ser utilizada como valor para uma variável ou parâmetro de uma função
        //Ela é feita para otimizar códigos
        //Sintaxe: (parâmetros) -> {instruções}
        //O operador seta indica a utilização de uma lambda
        //Todas as lambdas tem origem a partir de interfaces funcionais

        //Trabalhando com lambda built-in

        ArrayList<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Maça");
        listaFrutas.add("Banana");
        listaFrutas.add("Mamão");

        //Trabalhando com a sintaxe completa
        listaFrutas.forEach((umaFruta) -> {
            System.out.println(umaFruta);
        });

        //Podemos suprimir os () quando estiver somente um parâmetro

        listaFrutas.forEach(umaFruta -> {
            System.out.println(umaFruta);
        });

        //Podemos suprimir {} quando estiver somente uma instrução

        listaFrutas.forEach(umaFruta -> System.out.println(umaFruta));

        //Em alguns casos podemos utilizar o métod0 de referência
        //Sintaxe: nomeClasse::métod0
        listaFrutas.forEach(System.out::println);

        //Utilizando interfaces funcionáis como lambdas

        Ola primeiraLamb = () -> {
            System.out.println("Minha primeira lambda.");
        };

        primeiraLamb.mensagem();

        //Utilizando lambda customizada com parâmetros
        Impressora impA = conteudo -> {
            System.out.println(conteudo);

        };

        impA.imprimir("Imprimir um texto qualquer!");

        //Trabalhando com multiplos parâmetros e multiplas instruções
        Identidade docA = (numRG, numCPF) -> {
            System.out.println("Número do RG: " + numRG);
            System.out.println("Número do CPF: " + numCPF);
        };
        docA.identificar("00.000.000-0", "111.111.111-11");

        //Alternativa para POO
        Operacao operA = ((valorA, valorB) -> {
            System.out.println(valorA + valorB);
        });
        operA.Operacao(5, 8);
    }
}