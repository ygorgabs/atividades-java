package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class TelaVetor {
    private JPanel panelMain;
    private JSpinner spnNum;
    private JButton btnAdicionar;
    private JButton btnRemover;
    private JButton btnOrdenar;
    private JList lstVetor;
    private JLabel lblSelecionado;

    int vetor [] = new int[5]; // cria um vetor global que pode ser usado em todos os metodos
    int selecionado = 0; // cria uma variavel global
    DefaultListModel lista = new DefaultListModel(); // cria um objeto de lista default



    public TelaVetor() {
        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado] = Integer.parseInt(spnNum.getValue().toString());
                lista.removeAllElements(); // metodo que limpa a lista
                for(int c = 0; c < vetor.length; c++){
                    lista.addElement(vetor[c]);
                } // ira colocar novamente os valores na lista após a modificação
            }
        });
        lstVetor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                selecionado = lstVetor.getSelectedIndex(); // guarda na var selecionado o valor do index do vetor
                lblSelecionado.setText("[" + selecionado + "]"); // coloca o valor do index na label

            }
        });
        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado] = 0; // troca o valor da posição do vetor para 0

                lista.removeAllElements();
                for(int c = 0; c < vetor.length; c++){
                    lista.addElement(vetor[c]);
                }
            }
        });
        btnOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Arrays.sort(vetor); // metodo que ordena o vetor em ordem crescente

                lista.removeAllElements();
                for(int c = 0; c < vetor.length; c++){
                    lista.addElement(vetor[c]);
                }
            }
        });
    }

    public static void main(String[] args) {
        TelaVetor tela = new TelaVetor();
        tela.iniciarTela();
    }
    public void iniciarTela(){
        JFrame tela = new JFrame("Incluir no Vetor");
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);

        lstVetor.setModel(lista); // define que o modelo da lista do nosso Jframe é o objeto lista

        for(int c = 0; c < vetor.length; c++){
            lista.addElement(vetor[c]);
        } // inicia a lista assim que abre o programa adicionado os valores do vetor na lista
    }
}
