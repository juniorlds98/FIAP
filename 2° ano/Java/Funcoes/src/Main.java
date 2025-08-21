
public class Main {
    //A função main é o executavel de um aap JAVA
    public static void main(String[] args) {
        //Paradigma de programação - formas de programar

        //A função printLn serve para exibir elementos via console
        primeiraFuncao();
        somar15mais15();
        somar2valores(2,8);
        String pessoaA = identificarPessoa("Junior","Silva");
        String pessoaB = identificarPessoa("Francisca","lira");
        subtrairDoisValores(20, 10);
        subtrairDoisValores(19.77f, 11.55f);
        //Diferença entre parametros e argumentos
        //No momento em que preenchemos uma função, passamos argumentos

    }
    //Criando uma primeira função
    //Sintaxe: modificador retorno nome(parâmetros){instruçoes a serem executadas}
                //opcional obrig.  obrig obrig.     obrig.
    //nome de funções devem seguir lowerCamelCase
    //É um script de algumas instruções que podem ser utilizadas repetidas vezes
    //Para se utilizar uma função, ela deve ser invocada
    static void primeiraFuncao(){
        //A função permite que você crie seus próprios comandos
        System.out.println("Ola funções");
    }
    //Modificador static - Torna uma função acessível dentro de sua própria classe
    static void somar15mais15(){
        System.out.println(15 + 15);
    };

    //Trabalhando com parâmetros
    //PArãmetros são dados pedidos pela função que devem ser ARGUMENTADOS durante a invocação
    static void somar2valores(int valor1, int valor2){
        System.out.println("A somatória dos valores indicados é: ");
        System.out.println(valor1 + valor2);
    };

    //Trabalhando com retorno
    //Nos dá a possibilidade de arnazenar e guardar valores de uma função em repositórios
    static String identificarPessoa(String nome, String sobrenome){
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);

        return nomeCompleto;
    }

    //Trabalhando com sobrecarga de funções
    //É a habilidade de funções terem o mesmo nome, mas processarem dados de tipo diferente

    static float subtrairDoisValores(float valorA, float valorB){
        float valorTotal = valorA - valorB;
        System.out.println(valorTotal);

        return valorTotal;
    }
    static int subtrairDoisValores(int valorA, int valorB){
        int valorTotal = valorA - valorB;
        System.out.println(valorTotal);

        return valorTotal;
    }

}