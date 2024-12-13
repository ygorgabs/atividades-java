package TiposPrimitivos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SomaSwing {
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton btnSoma;
    private JLabel lblResultado;
    private JPanel PanelMain;

    public SomaSwing() {
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int s = n1 + n2;
                lblResultado.setText(Integer.toString(s));
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SomaSwing"); //Cria uma nova janela
        frame.setContentPane(new SomaSwing().PanelMain); //Define o painel principal da janela como um painel chamado PanelMain, que faz parte de uma instância da classe SomaSwing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Configura a operação padrão para fechar a janela.
        frame.pack();
        frame.setVisible(true); //Torna a janela visível na tela.

        /*
        Sem fazer isso não é possivel fazer o app rodar. É necessario criar uma classe principal e construir o form aqui.
         */
    }

}
