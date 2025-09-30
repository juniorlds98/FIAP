import models.Livro;
import models.Troca;

//Caio Martinez Saes RM: 560753
//Estefany Caetano RM: 560181
//José Claudio da Silva Junior RM: 559680

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Hobbit", "J. R. R. Tolkien", 1930, "Fantasia", true);
        Livro livro2 = new Livro("O Senhor dos Aneis: A sociedade do Anel", "J. R. R. Tolkien", 1937, "Fantasia", true);

        livro1.imprimir();
        livro2.imprimir();

        Troca troca = ServiceTroca.solicitarTroca(livro1, livro2);
        troca.imprimir();

        ServiceTroca.aprovar(troca);
        ServiceTroca.concluido(troca);
    }
}
