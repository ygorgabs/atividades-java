package VerificadoIdadeSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class VerificadoIdadeSwing {
    private JPanel panelMain;
    private JTextField txtAno;
    private JButton btnCalc;
    private JLabel lblIdade;
    private JLabel lblSituacao;

    public VerificadoIdadeSwing() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int anoNasc = Integer.parseInt(txtAno.getText());
                LocalDate data = LocalDate.now(); // cria um objeto local date e armazena a data que esta na maquina do usuario
                int anoAtual = data.getYear(); // pega o ano do objeto data e armazena na variavel int
                int idade = anoAtual-anoNasc;
                lblIdade.setText(Integer.toString(idade));
                String sit = (idade<= 16 && idade <18 )|| (idade > 70) ? "É OPCIONAL" : "NÃO É OPCIONAL";
                lblSituacao.setText(sit);

            }
        });
    }

    public static void main(String[] args) {
        VerificadoIdadeSwing tela = new VerificadoIdadeSwing();
        tela.criarTela();
    }

    public void criarTela(){
        JFrame tela = new JFrame();
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
    }
}
