import javax.swing.*;
import java.awt.*;

public class JanelaSomarDoisValores {
    public static void main(String[] args) {

        //Criando a janela principal
        JFrame frame = new JFrame("Somando dois valores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);
        frame.setLocationRelativeTo(null);

        //Painel principal com boxLayout(vertical)
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        //Paineis de linha (Cada linha tem FlowLayout)
        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        //Criação dos elementos
        JLabel labelA = new JLabel("Valor A");
        JLabel labelB = new JLabel("Valor B");
        JLabel labelResultado = new JLabel("Resultado: ");

        JTextField campoA = new JTextField(6);
        JTextField campoB = new JTextField(6);
        JTextField resultado = new JTextField(6);
        resultado.setEditable(false);

        JButton botaoSomar = new JButton("Somar");
        JButton botaoLimpar = new JButton("Limpar");

        //Listener para o botão somar
        botaoSomar.addActionListener(evento-> {
            try{
                double valorA = Double.parseDouble(campoA.getText());
                double valorB = Double.parseDouble(campoB.getText());
                resultado.setText(String.valueOf(valorA + valorB));
            }catch (NumberFormatException exception){
                resultado.setText("Erro!");
                System.out.println(exception);
            }
        });

        //Listener para o botão limpar

        botaoLimpar.addActionListener(event0 -> {
            campoA.setText("");
            campoB.setText("");
            resultado.setText("");
        });

        //Montando os paineis
        linha1.add(labelA);
        linha1.add(campoA);
        linha1.add(labelB);
        linha1.add(campoB);
        linha1.add(botaoSomar);

        linha2.add(labelResultado);
        linha2.add(resultado);
        linha2.add(botaoLimpar);

        painelPrincipal.add(linha1);
        painelPrincipal.add(linha2);

        frame.add(painelPrincipal);


        //Exibindo janela
        frame.setVisible(true);
    }

}
