package models;

public class PessoaJuridica extends Cliente{
    //TODO: Propriedades
    private String razaoSocial;
    private String cnpj;

    //TODO: Construtores

    public PessoaJuridica(String numConta, String dataAdesao, String razaoSocial, String cnpj) {
        super(numConta, dataAdesao);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    //TODO: Getters


    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    //TODO: Setters

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    //TODO: Métodos sobrescritos


    @Override
    public void imprimirDados() {
        System.out.println("===== Dados do Cliente =====");
        System.out.println("Número da razão social " + razaoSocial);
        System.out.println("Número da cnpj " + cnpj);
        System.out.println("Número da conta " + getNumConta());
        System.out.println("Adesão: " + getDataAdesao());
        System.out.println("==========================");
    }
}
