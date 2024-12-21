package classes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTriangulo {
    private JSlider sliA;
    private JSlider sliB;
    private JSlider sliC;
    private JPanel panelMain;
    private JButton btnVerificar;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblC;
    private JPanel panResposta;
    private JLabel lblStatus;
    private JLabel lblTipo;

    public TelaTriangulo() {
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panResposta.setVisible(true);

                int a, b, c;
                a = sliA.getValue(); // pego o valor do slider e jogo na variavel. Slider nao precisa converte. Definir o range do slider é direto do form em minimum, maximum e value
                b = sliB.getValue();
                c = sliC.getValue();

                if (a < b + c && b < a + c && c < a + b) {
                    lblStatus.setText("Os segmentos formam um triângulo.");

                    if (a != b && b != c && c != a) {
                        lblTipo.setText("Triângulo Escaleno");
                    } else if (a == b && b == c) {
                        lblTipo.setText("Triângulo Equilátero");
                    } else {
                        lblTipo.setText("Triângulo Isóceles");
                    }

                } else {
                    lblStatus.setText("Os seguimentos não formam um triângulo.");
                    lblTipo.setText("----");
                } // estrutura de decisão que define se forma um triangulo e qual o tipo de triangulo


            }
        });
        sliA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblA.setText(Integer.toString(sliA.getValue())); // coloca o valor do slider na label
            }
        });
        sliB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblB.setText(Integer.toString(sliB.getValue()));
            }
        });
        sliC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblC.setText(Integer.toString(sliC.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        TelaTriangulo tela = new TelaTriangulo();
        tela.iniciarTela();
    }

    public void iniciarTela() {
        JFrame tela = new JFrame("Tipo de Triângulo");
        tela.setContentPane(this.panelMain);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        tela.pack();

        panResposta.setVisible(false);
    }
}
