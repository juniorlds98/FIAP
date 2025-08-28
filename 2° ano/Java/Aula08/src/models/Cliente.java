package models;

public class Cliente {

    //DONE: Propriedades
    //Ao privar propriedades, estamos entrando no processo de encapsulamento
    private String nome;
    private String cpf;

    //DONE: Construtores
    //Métodos  construtores nos ajudam a constuir um objeto que não tenha nenhuma informação em NULL
    //Sintaxe: NomeIgualAoDaClasse(){}
    public Cliente(String nome, String cpf){
        //Passo cada parametro para a sua propriedade correspondente
        //Utilizamos a palavra reservada this para indicar a propriedade
        this.nome = nome;
        this.cpf = cpf;
    }
    //DONE: Métodos GETTER
    //São métodos que permitem fazer a leitura de um dado privado

    public String getNome(boolean eGerente) {

        if(eGerente){
            return nome;
        } else {
            return "Acesso não permitido";
        }
    }

    public String getCpf(boolean eGerente) {

        if(eGerente){
            return cpf;
        } else {
            return "Acesso não permitido";
        }
    }


    //DONE: Métodos SETTER
    //São métodos que permitem fazer a modificação de um dado privado
    public void setNome(boolean eGerente, String novoNome){
        if(eGerente){
            this.nome = novoNome;
        } else {
            System.out.println("Acesso não permitido");
        }
    }

    public void setCpf(boolean eGerente, String novoCpf){
        if(eGerente){
            this.cpf = novoCpf;
        } else {
            System.out.println("Acesso não permitido");
        }

    }

    //TODO: Métodos próprios
    void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

    //TODO: Coisas para fazer
    //FIXME: COisas para concertar
}
