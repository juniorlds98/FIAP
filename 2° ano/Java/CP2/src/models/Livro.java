package models;

public class Livro {

    private String nome;
    private String autor;
    private int anoCriacao;
    private String tema;
    private boolean disponivel;

    public Livro(String nome, String autor, int anoCriacao, String tema, boolean disponivel) {
        this.nome = nome;
        this.autor = autor;
        this.anoCriacao = anoCriacao;
        this.tema = tema;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void imprimir(){
        System.out.println(
                this.getNome() + " "
                + this.getAnoCriacao() + " - "
                + this.getAutor() + " - "
                + this.getTema()
        );
    }
}
