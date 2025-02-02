package classes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TelaFatorial {
    private JSpinner spnNum;
    private JLabel lblFat;
    private JPanel panelMain;
    private JLabel lblConta;

    public TelaFatorial() {
        spnNum.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int num = Integer.parseInt(spnNum.getValue().toString());
                int res = 1;
                int c = num;
                String conta = "";
                while (c >= 1){

                    if (res == 1){
                        conta = Integer.toString(c);
                    } else {
                        conta += " * " + c;
                    }
                    res *= c;
                    c--;
                }
                lblFat.setText(Integer.toString(res));
                lblConta.setText(conta);
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
