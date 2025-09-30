package models;

public class Troca {
    public Livro livroPedido;
    public Livro livroOferecido;
    public Status status;

    public Troca(Livro livroPedido, Livro livroOferecido) {
        this.livroPedido = livroPedido;
        this.livroOferecido = livroOferecido;
        this.status = Status.PENDENTE;
    }

    public Livro getLivroPedido() {
        return livroPedido;
    }

    public void setLivroPedido(Livro livroOrigem) {
        this.livroPedido = livroOrigem;
    }

    public Livro getLivroSolicitado() {
        return livroOferecido;
    }

    public void setLivroSolicitado(Livro livroTrocado) {
        this.livroOferecido = livroTrocado;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void imprimir(){
        System.out.println(
                 this.livroPedido.getNome() + " "
                + this.livroPedido.getAnoCriacao() + " - "
                + this.livroPedido.getAutor() + " - "
                + this.livroPedido.getTema()
                + " ⇌ " +
                  this.livroOferecido.getNome() + " "
                + this.livroOferecido.getAnoCriacao() + " - "
                + this.livroOferecido.getAutor() + " - "
                + this.livroOferecido.getTema() +
                "Status: " + this.status);
    }
}
