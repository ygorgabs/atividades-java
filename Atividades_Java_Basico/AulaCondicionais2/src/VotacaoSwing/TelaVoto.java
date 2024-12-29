package VotacaoSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaVoto {
    private JTextField txtAno;
    private JButton btnVoto;
    private JLabel lblR;
    private JPanel panelMain;
    private JLabel lblIdade;

    public TelaVoto() {
        btnVoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtAno.getText());
                int i = 2024 - a;
                lblIdade.setText("Idade: "+ i);
                if (i < 16){
                    lblR.setText("Não vota!");
                }else if ((i >= 16 && i <18)||i>70){
                    lblR.setText("Voto Opcional");
                } else {
                    lblR.setText("Voto Obrigatório!");
                }
            }
        });

    }

    public static void main(String[] args) {
        TelaVoto tela = new TelaVoto();
        tela.iniciarTela();
    }

    public void iniciarTela(){
        JFrame tela = new JFrame("Posso votar?");
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        tela.pack();
    }
}
