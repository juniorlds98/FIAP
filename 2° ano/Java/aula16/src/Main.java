import java.awt.*;
//Focada em fazer interface grafica

public class Main {
    //Criando Janela

    //Criando as bordas da janela
    static Frame frame;
    //Criar caixa de texto
    static Label label;

    //Utilizando o construtor para injetar as dependência do Frame e Label
    public Main(Frame frame, Label label) {
        this.frame = frame;
        this.label = label;
    }

    public static void main(String[] args) {

        frame = new Frame();
        label = new Label("Ola, AWT");

        //Atribuir tamanho para a janela
        frame.setSize(300,300);

        //Alinhamento do texto
        label.setAlignment(Label.CENTER);

        //Adicionar o texto a janela
        frame.add(label);

        //Apresentando a janela
        frame.setVisible(true);

        Calculos
    }
}