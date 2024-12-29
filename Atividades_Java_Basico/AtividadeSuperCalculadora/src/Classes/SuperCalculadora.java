package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperCalculadora {
    private JSpinner spnNum;
    private JButton btnCalcular;
    private JLabel lblResto;
    private JLabel lblCubo;
    private JLabel lblQuadrado;
    private JLabel lblRaizCubo;
    private JLabel lblAbsoluto;
    private JPanel panelMain;
    private JPanel panelLbl;

    public SuperCalculadora() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(spnNum.getValue().toString());
                lblResto.setText(Integer.toString(num%2));
                lblCubo.setText(String.format("%.2f",Math.pow(num,3)));
                lblQuadrado.setText(String.format("%.2f",Math.sqrt(num))); // metodo String.format converte o valor para string e ao mesmo tempo limita as casas decimais
                lblRaizCubo.setText(String.format("%.2f",Math.cbrt(num)));
                lblAbsoluto.setText(Integer.toString(Math.abs(num)));
                panelLbl.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SuperCalculadora tela = new SuperCalculadora();
        tela.criarTela();
    }

    public void criarTela(){
        JFrame tela = new JFrame();
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
        tela.setResizable(false);//estou configurando para o programa não ser redimensionado
        panelLbl.setVisible(false);
    }
}


