package ent;

public class Paciente {
    public String nome;
    public String prontuario;
    public String email;
    public String prescricao;

    public Paciente(String nome, String prontuario, String email, String prescricao){
        this.nome = nome;
        this.prontuario = prontuario;
        this.email = email;
        this.prescricao = prescricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", prontuario='" + prontuario + '\'' +
                ", email='" + email + '\'' +
                ", prescricao='" + prescricao + '\'' +
                '}';
    }
}
