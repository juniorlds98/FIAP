package models;

public class Cliente {

    //DONE: Propriedades
    private String numConta;
    private String dataAdesao;

    //DONE: Construtores

    public Cliente(String numConta, String dataAdesao) {
        this.numConta = numConta;
        this.dataAdesao = dataAdesao;
    }

    //DONE: Getters

    public String getNumConta(){
        return numConta;
    }

    public String getDataAdesao(){
        return dataAdesao;
    }
    //DONE: Setters
    public void setNumConta(String numConta){
        this.numConta = numConta;
    }

    //DONE: Métodos de classe
    public void imprimirDados(){
        System.out.println("===== Dados do Cliente =====");
        System.out.println("Número da conta " + numConta);
        System.out.println("Adesão: " + dataAdesao);
        System.out.println("==========================");
    }
}
