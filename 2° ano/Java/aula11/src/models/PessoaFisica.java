package models;

//Essa classe herdará de Cliente (A palavra extends indica o polimorfismo
public class PessoaFisica extends Cliente{

    //DONE: Pripriedades
    private String nome;
    private String cpf;

    //DONE: Construtores

    public PessoaFisica(String numConta, String Adesao, String nome, String cpf) {
        //super faz a execução do construtor da classe pai
        super(numConta, Adesao);
        this.nome = nome;
        this.cpf = cpf;
    }

    //DONE: Getters

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    //DONE: Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //DONE: Métodos sobrescritos
    //Indica que o métod0 é uma sobrescrita - utilização é opcional
    @Override
    public void imprimirDados() {
        //super: Quando presente, executa também o metod0 da classe pai
        super.imprimirDados();

        System.out.println("===== Dados do Cliente =====");
        System.out.println("Número da nome " + nome);
        System.out.println("Número da cpf " + cpf);
        System.out.println("Número da conta " + getNumConta());
        System.out.println("Adesão: " + getDataAdesao());
        System.out.println("==========================");
    }
}
