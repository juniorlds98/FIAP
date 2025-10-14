import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaHello {
    public static void main(String[] args) {

        //DONE: Criar janela
        //Elemento frame - A janela
        Frame frame = new Frame("Trabalhando Frames e Labels");
        frame.setSize(800, 600); //Definindo tamanho da janela

        //Calcular a posição centralizada
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamanhoTela.width - frame.getWidth())/2;
        int y = (tamanhoTela.height - frame.getHeight())/2;
        frame.setLocation(x, y);

        //Indicando função para o botão fechar
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //DONE: Criar elementos de interface
        Label label = new Label("Bem-vindo(a) ao AWT!");
        frame.add(label);
        label.setAlignment(Label.CENTER);
        //Mudar o texto (continua tendo getter e setters normalmente)
        //label.setText("Texto novo");
        //Exibindo janela
        frame.setVisible(true);
    }
}