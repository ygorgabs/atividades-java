package classes;

import javax.swing.*;

public class ExercicioRepita {

    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas vindas", JOptionPane.INFORMATION_MESSAGE); - Metodo com janelas ja prontas para uso. Essa é a janela de Mensagem
        int n, s = 0, par = 0, cem = 0, impar = 0, cont = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br> <em>(O valor 0 interrompe)<em></html>"));

            s += n;
            cont++;

            if (n%2==0){
                par++;
            }else{
                impar++;
            }

            if (n > 100){
                cem++;
            }

        }while (n != 0);

        double media = (double) s/cont; // usando typecast para ele forçar o resultado como double
        JOptionPane.showMessageDialog(null,
                "<html>Resultado final <br><hr>" + "<br>Total dos valores: "+ s + "<br>Total de Pares: "+ par + "<br>Total de Ímpares: "+ impar +
                        "<br>Acima de 100: "+ cem + "<br>Média de valores: "+ media + "</html>"); //Usando html para personalizar o texto
    }
}
