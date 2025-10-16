import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JanelaAlerta {
    public static void main(String[] args) {

        //Criando a janela principal

        JFrame frame = new JFrame("Trabalhando com JFrame e JLabel");
        frame.setSize(600,300); //Determinando tamanho
        frame.setLocationRelativeTo(null); //Se for nulo o valor a janela ficará centralizada
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        //Criando elemento Label
        JLabel label = new JLabel("Olá Swing");
        frame.add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //Adicionando comportamento ao botão fechar
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                //Exibindo caixa de alerta
                int resposta = JOptionPane.showConfirmDialog(
                        frame, //Local de exibição
                        "Tem certeza que deseja fechar a janela", //Mensagem
                        "Confirmar saída", //Titulo
                        JOptionPane.YES_NO_OPTION, //Tipos de botões
                        JOptionPane.QUESTION_MESSAGE, //Tipo de caixa
                        new ImageIcon(JanelaAlerta.class.getResource("alerta.png"))
                );
                //Verificar se o botão SIM foi utilizado
                if(resposta == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });


        //Exibindo janela
        frame.setVisible(true);
    }
}