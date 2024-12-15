package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;



public class telaIdade {
    private JSpinner txtAN;
    private JButton btnCalc;
    private JLabel lblIdade;
    private JPanel panelMain;
    private JLabel lblAno;


    public static void main(String[] args) {

        telaIdade form = new telaIdade();
        form.iniciarTela();
    }

    public telaIdade() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDate data = LocalDate.now();
                int an = Integer.parseInt(txtAN.getValue().toString());
                int anoat = data.getYear();
                int id = anoat - an;
                lblIdade.setText(Integer.toString(id));
            }
        });
    }

    /*
        A classe LocalDate pega as informações de data da máquina do usuário e armazena no objeto(neste caso data)
        Usei o metodo getYear para extrair o ano desse objeto e calcular a idade do usuário no ano vigente.
        Neste caso, se o usuário modificar manualmente o horário do pc quando abrir de novo a data será igual a data modificada.
     */

    public  void iniciarTela(){
        JFrame tela = new JFrame("Calcula idade");
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);

        tela.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                LocalDate data = LocalDate.now();
                int ano = data.getYear();
                lblAno.setText(Integer.toString(ano));
            }
        });
    }

    /*
        Criei o metodo iniciartela para construir o form fora do main, pois havia um conflito com os itens do formulário que nao são static.
        Esse metodo também tem um evento de janela open. O evento da janela é sempre ligado ao JFrame e nao ao form.
        Usei o this.panelMain para usar sempre a instância atual para inserir o ano desejado e nao criar um novo objeto quando for chamado.

     */

}