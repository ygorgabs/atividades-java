package telaequacao;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaEquacao {
    private JPanel panelMain;
    private JSpinner txtA;
    private JSpinner txtB;
    private JSpinner txtC;
    private JLabel lblDelta;
    private JLabel lblB;
    private JLabel lblA;
    private JLabel lblC;
    private JButton btnCalcular;
    private JPanel panelResultado;
    private JLabel lblResDelta;
    private JLabel lblRaiz;

    public telaEquacao() {
        txtA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblA.setText(txtA.getValue().toString());
            }
        });
        txtB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblB.setText(txtB.getValue().toString());
            }
        });
        txtC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblC.setText(txtC.getValue().toString());
            }
        });
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelResultado.setVisible(true);
                int a = Integer.parseInt(txtA.getValue().toString());
                int b = Integer.parseInt(txtB.getValue().toString());
                int c = Integer.parseInt(txtC.getValue().toString());

                double delta = (Math.pow(b,2))-4*a*c;
                lblResDelta.setText(String.format("%.2f",delta));

                if (delta < 0){
                    lblRaiz.setText("Não existem Raízes reais.");
                } else {
                    lblRaiz.setText("Existem Raizes reais.");
                }
            }
        });
    }

    public static void main(String[] args) {
        telaEquacao tela = new telaEquacao();
        tela.iniciarTela();
    }
    public void iniciarTela(){
        JFrame tela = new JFrame("Formula de Bhaskara");
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
        lblDelta.setText("<html>&#916; = </html>");
        btnCalcular.setText("<html>Calcular &#916;</html>");
        panelResultado.setVisible(false);
    }
}
