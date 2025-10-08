package models;

/**
 * <h4>Classe para modelagem de duas operações de calculo</h4>
 * <p>- Possibilidade de somar dois valores;</p>
 * <p>- Possibilidade de subtrair dois valores;</p>
 * @author Junior Silva
 * @version 1.0.0
 * @since Outubro de 2025
 */
public class Calc {

    /**
     * <p>- Utilizar o construtor ou o setValorA para preencher o valorA com um número inteiro;</p>
     * <p>- Utilizar o construtor ou o setValorA para preencher o valorB com um número inteiro;</p>
     */

    private int valorA;
    private int valorB;

    /**
     * Métod0 construtor para criação de objetos Calc
     * @param valorA Preencher com um dos valores inteiros a serem operados;
     * @param valorB Preencher com um dos valores inteiros a serem operados;
     */
    public Calc(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    /**
     * Métod0 para realizar get do valorA
     * @return retornará o valor específicado no atributo valorA
     */
    public int getValorA() {
        return valorA;
    }

    /**
     * Métod0 para realizar um set para o valorA
     * @param valorA preencher com um valor inteiro
     */

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    /**
     * Métod0 para realizar get do valorB
     * @return retornará o valor específicado no atributo valorB
     */
    public int getValorB() {
        return valorB;
    }

    /**
     * Métod0 para realizar um set para o valorB
     * @param valorB preencher com um valor inteiro
     */

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    /**
     * Sobreescrita do métod0 toString()
     * @see Object classe de origem do métod0
     * @see String objeto de texto
     * @return uma formatação para visualizar todos os dados classe como String
     */
    @Override
    public String toString() {
        return "Calc{" +
                "valorA=" + valorA +
                ", valorB=" + valorB +
                '}';
    }

    /**
     * Métod0 para somar os dois valores indicados nas propriedades
     * @return somatória valorA e valorB
     */
    public int somarDoisValores(){
        return valorA + valorB;
    }

    /**
     * Métod0 para subtrair os dois valores indicados nas propriedades
     * @return subtração valorA e valorB
     */
    public int subtrairDoisValores(){
        return valorA - valorB;
    }

    /**
     * Métod0 para identificar o usuário dos calculos
     * @param nome indicar o nome em formato String a ser utilizado
     * @see String tipo a ser utilizado
     */

    public void identificarUsuario(String nome){
        System.out.println("Ola " + nome + " bem vindo(a) a nossa calculadora!");
    }
}
