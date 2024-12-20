package ParImparSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParImparSwing {
    private JTextField txtValor;
    private JButton btnVerificar;
    private JLabel lblResultado;
    private JPanel panelMain;

    public ParImparSwing() {
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(txtValor.getText());

                if(valor%2==0){
                    lblResultado.setText("O número "+ valor + " é par!");
                } else {
                    lblResultado.setText("O número "+ valor + " é impar!");
                }
            }
        });
    }

    public static void main(String[] args) {
        ParImparSwing tela = new ParImparSwing();
        tela.IniciarTela();
    }


    public void IniciarTela(){
        JFrame tela = new JFrame("Número Par ou Impar");
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setResizable(false);
        tela.setVisible(true);
    }
}
