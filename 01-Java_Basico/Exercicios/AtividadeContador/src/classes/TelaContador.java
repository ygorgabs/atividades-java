package classes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador {
    private JSlider sliInicio;
    private JSlider sliFim;
    private JSlider sliPasso;
    private JButton btnCont;
    private JList lstCont;
    private JLabel lblInicio;
    private JLabel lblFim;
    private JLabel lblPasso;
    private JPanel panelMain;

    public TelaContador() {
        sliInicio.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblInicio.setText(Integer.toString(sliInicio.getValue()));
            }
        });
        sliFim.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblFim.setText(Integer.toString(sliFim.getValue()));
            }
        });
        sliPasso.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblPasso.setText(Integer.toString(sliPasso.getValue()));
            }
        });
        btnCont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = sliInicio.getValue();
                int f = sliFim.getValue();
                int p = sliPasso.getValue();

                DefaultListModel lista = new DefaultListModel(); // cria um objeto do tipo lista default

                for (int c = i; c <= f; c += p){
                    lista.addElement(c);
                } // usa as variaveis como parametro do for e adiciona a contagem no objeto lista

                lstCont.setModel(lista); // define como modelo do lstCont do Jframe o objeto lista que foi criado
            }
        });
    }

    public static void main(String[] args) {
        TelaContador tela = new TelaContador();
        tela.iniciarTela();
    }

    public void iniciarTela(){
        JFrame tela = new JFrame("Contador");
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        tela.pack();
    }
}
