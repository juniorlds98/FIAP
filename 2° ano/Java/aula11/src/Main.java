import models.PessoaFisica;
import models.PessoaJuridica;

public class Main {
    public static void main(String[] args) {

        //Criando objetos

        PessoaFisica pessoaFisicaA = new PessoaFisica(
                "0000-00",
                "22/02/2022",
                "Joaquim Nunes Pereira",
                "000.000.000-00"
        );
        pessoaFisicaA.imprimirDados();

        PessoaJuridica pessoaJuridicaA = new PessoaJuridica(
                "1111-11",
                "03/03/2023",
                "Quebra Pedra Pedreira LTDA",
                "00.000.000/0001-00"
        );
        pessoaJuridicaA.imprimirDados();
    }
}