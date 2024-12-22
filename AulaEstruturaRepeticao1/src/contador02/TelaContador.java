package contador02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador {
    private JLabel lblContagem;
    private JButton btnContar;
    private JPanel panelMain;

    public TelaContador() {
        btnContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cc = 0;
                String contagem = "";
                while(cc < 5){
                    contagem += cc + " ";
                    cc++;
                }
                lblContagem.setText(contagem);
            }
        });
    }

    public static void main(String[] args) {
        TelaContador tela = new TelaContador();
        tela.iniciarTela();
    }

    public void iniciarTela(){
        JFrame tela = new JFrame();
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        tela.pack();
    }
}
