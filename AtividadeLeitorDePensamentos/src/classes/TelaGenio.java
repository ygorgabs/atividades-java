package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaGenio {
    private JPanel panelMain;
    private JSpinner spnNum;
    private JButton btnPalpite;
    private JLabel lblPensamento;

    public TelaGenio() {
        btnPalpite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ale = Math.random(); //classe para gerar numero aleatorio
                int num = (int) (1 + ale *(6-1)); //gerando um número aleatório entre 1 e 5
                int user = Integer.parseInt(spnNum.getValue().toString());

                lblPensamento.setText((num==user)?"Você acertou. Eu pensei em " + num : "Você errou. Eu pensei em "+ num);

            }
        });
    }

    public static void main(String[] args) {
        TelaGenio tela = new TelaGenio();
        tela.iniciarTela();
    }
    public void iniciarTela(){
        JFrame tela = new JFrame("Adivinhe o número");
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
        tela.setResizable(false);
        lblPensamento.setText("<html>Estou pensando em um <br> número entre 1 e 5. Tente <br> adivinhar qual o valor.</html>"); //É possivel usar html dentro das strings no java para personalizar as saidas, conforme essa linha
    }

}
