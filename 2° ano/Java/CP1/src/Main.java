
public class Main {
    public static void main(String[] args) {
        Tutor tutorA = new Tutor();
        Tutor tutorB = new Tutor();
        Pets petA = new Pets();
        Pets petB = new Pets();
        Pets petC = new Pets();
        Pets petD = new Pets();

        tutorA.nome = "Joaquim José";
        tutorA.idade = 44;
        tutorA.cpf = "111.111.111-11";

        tutorB.nome = "Francisca Maria";
        tutorB.idade = 38;
        tutorB.cpf = "222.222.222-22";

        petA.id = 1;
        petA.nome = "Caramelo";
        petA.raca = "Vira lata";
        petA.cor = "Amarela";
        petA.idade = 8;

        petB.id = 2;
        petB.nome = "Xuxa";
        petB.raca = "Dálmata";
        petB.cor = "Branca";
        petB.idade = 3;

        petC.id = 3;
        petC.nome = "Lola";
        petC.raca = "Golden Retriver";
        petC.cor = "Amarela";
        petC.idade = 4;

        petD.id = 4;
        petD.nome = "Bolinha";
        petD.raca = "Pintcher";
        petD.cor = "Preta";
        petD.idade = 12;

        tutorA.imprimirDados();
        tutorB.imprimirDados();
        petA.imprimirDadosPet();
        petB.imprimirDadosPet();
        petC.imprimirDadosPet();
        petD.imprimirDadosPet();
    }
}