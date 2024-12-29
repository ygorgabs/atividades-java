package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperadoresSwing {
    private JPanel panelMain;
    private JTextField txtNum;
    private JTextField txtDen;
    private JButton btnDividir;
    private JLabel lblDiv;
    private JLabel lblRes;

    public OperadoresSwing() {
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numerador = Integer.parseInt(txtNum.getText());
                int denominador = Integer.parseInt(txtDen.getText());
                float divisao = numerador/denominador;
                float resto = (float) Math.sqrt(numerador);

                lblDiv.setText(Float.toString(divisao));
                lblRes.setText(Float.toString(resto));
            }
        });
    }

    public static void main(String[] args) {
        OperadoresSwing form = new OperadoresSwing();
        form.IniciarTela();
    }

    public void IniciarTela(){
        JFrame tela = new JFrame("Operador Divisão");
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack(); // controla o tamanho da tela
        tela.setVisible(true);
    }
}
