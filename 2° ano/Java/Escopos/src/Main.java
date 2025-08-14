import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Explicando escopos

        //Trabalhando com parenteses
        //Abrigam tuplas de dados (conjunto de dados que podem ser iguais ou diferentes)
        String nome = "Antonio";
        int idade = 60;
        float altura = 1.75f;

        System.out.println(nome + " " + idade + " " + altura);

        //Trabalhando com colchetes
        //Representam coleções de dados - [Um conjunto de dados do mesmo tipo]
        //Só pode entrar itens com o mesmo tipo
        //Isso é uma coleção primitiva

        String[] frutasComM = {"Mamão", "Melão", "Melancia"};
        System.out.println(frutasComM);

        //Trabalhando com chaves
        //Representa um bloco de execução, ou seja, tudo que estiver lá dentro, será executado em ordem

        var horaDoDia = 10;

        if(horaDoDia < 18){
            System.out.println("Hora informada: " + horaDoDia);
            System.out.println("Que dia lindo!");
        }
        else {
            System.out.println("Que noite maravilhosa!");
            System.out.println("Hora informada: " + horaDoDia);
        }

        //Trabalho com Diamante <Tipo Genérico>
        //Essa não é mais uma coleção primitiva

        ArrayList<Integer> idadeDosFuncionarios = new ArrayList<>();
        idadeDosFuncionarios.add(18);
        idadeDosFuncionarios.add(50);
        idadeDosFuncionarios.add(20);
    }
}