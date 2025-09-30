import models.Livro;
import models.Troca;

public interface IServiceTroca {

    static Troca solicitarTroca(Livro pedido, Livro oferecido) {
        return null;
    }

    static void aprovar(Troca troca) {

    }

    static void negar(Troca troca) {

    }

    static void concluido(Troca troca) {

    }
}
