package ent;

public class Medicamento {
    public String nome;
    public Integer quantidade;

    public Medicamento(String nome, Integer quantidade, boolean disponibilidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.disponibilidade = disponibilidade;
    }

    public boolean disponibilidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", disponibilidade=" + disponibilidade +
                '}';
    }
}
