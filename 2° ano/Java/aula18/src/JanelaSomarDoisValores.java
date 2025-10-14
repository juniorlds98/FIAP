import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaSomarDoisValores {

    public static void main(String[] args) {
        //DONE: Criar janela
        //Elemento frame - A janela
        Frame frame = new Frame("Soma de dois valores");
        frame.setSize(600, 300); //Definindo tamanho da janela

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

        //Definindo que a janela terá  um layout com subdivisões
        frame.setLayout(new GridBagLayout());

        //Criando um painel para centralizar os componentes
        Panel painelCentralizado = new Panel(new FlowLayout(FlowLayout.CENTER));

        //TODO: Criação dos componentes

        Label labelValorA = new Label("Valor A: ");
        Label labelValorB = new Label("Valor B: ");
        Label labelResultado = new Label("Resultado: ");

        TextField campoValorA = new TextField(5);
        TextField campoValorB = new TextField(5);
        TextField resultado = new TextField(5);
        resultado.setEditable(false);

        Button botaoSomar = new Button("Somar");
        Button botaoLimpar = new Button("Limpar");

        //Adicionando componentes
        frame.add(painelCentralizado);

        painelCentralizado.add(labelValorA);
        painelCentralizado.add(campoValorA);
        painelCentralizado.add(labelValorB);
        painelCentralizado.add(campoValorB);
        painelCentralizado.add(botaoSomar);
        painelCentralizado.add(labelResultado);
        painelCentralizado.add(resultado);
        painelCentralizado.add(botaoLimpar);

        //Listener para o botão somar
        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valorA = Double.parseDouble(campoValorA.getText());
                    double valorB = Double.parseDouble(campoValorB.getText());
                    double soma = valorA + valorB;
                    resultado.setText(String.valueOf(soma));
                }
                catch (NumberFormatException exception){
                    System.out.println(exception);
                    resultado.setText("Erro, o valor é um texto!");
                }
            }
        });

        //Listener do botão limpar
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoValorA.setText("");
                campoValorB.setText("");
                resultado.setText("");
            }
        });

        //Exibindo janela
        frame.setVisible(true);
    }
}
