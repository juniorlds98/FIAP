import models.Livro;
import models.Status;
import models.Troca;

public class ServiceTroca implements IServiceTroca{
    public static void aprovar(Troca troca){
        troca.setStatus(Status.APROVADO);
        troca.imprimir();
    }

    public static void negar(Troca troca) {
        troca.setStatus(Status.NEGADO);
        troca.imprimir();
    }

    public static void concluido(Troca troca){
        troca.livroOferecido.setDisponivel(false);
        troca.livroPedido.setDisponivel(false);
        troca.setStatus(Status.CONCLUIDO);
        troca.imprimir();
    }

    public static Troca solicitarTroca(Livro pedido, Livro oferecido){
        Troca troca = new Troca(pedido,oferecido);
        return troca;
    }


}
