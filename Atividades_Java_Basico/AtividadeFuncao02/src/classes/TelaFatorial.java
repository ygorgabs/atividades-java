package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFatorial {
    private JPanel panelMain;
    private JSpinner txtNum;
    private JButton btnFatorial;
    private JLabel lblFormula;
    private JLabel lblResultado;

    public TelaFatorial() {
        btnFatorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtNum.getValue().toString());
                Fatorial f = new Fatorial(); // cria um objeto que tem os metodos da classe fatorial

                f.setValor(n); // envia num para o objeto

                lblFormula.setText(f.getFormula());
                lblResultado.setText(Integer.toString(f.getFatoria()));

            }
        });
    }

    public static void main(String[] args) {
        TelaFatorial tela = new TelaFatorial();

        tela.iniciarTela();
    }
    public void iniciarTela(){
        JFrame tela = new JFrame("Calcular Fatorial");
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
    }
}
