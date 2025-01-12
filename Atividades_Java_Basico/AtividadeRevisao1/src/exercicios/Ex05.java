package exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int cod1, cod2, uni1, uni2;
        double valor1, valor2, totValor;
        Scanner ent = new Scanner(System.in);

        System.out.println("Contabilizando peça 1\n----------------------");
        System.out.println("Digite o código: ");
        cod1 = ent.nextInt();
        System.out.println("Quantas unidades? ");
        uni1 = ent.nextInt();
        System.out.println("Qual o valor unitário? ");
        valor1 = ent.nextDouble();

        System.out.println("Contabilizando peça 2\n----------------------");
        System.out.println("Digite o código: ");
        cod2 = ent.nextInt();
        System.out.println("Quantas unidades? ");
        uni2 = ent.nextInt();
        System.out.println("Qual o valor unitário? ");
        valor2 = ent.nextDouble();

        totValor = valor1*uni1 + valor2*uni2;
        System.out.printf("----------------------%nValor a pagar: %.2f",totValor);

    }
}
