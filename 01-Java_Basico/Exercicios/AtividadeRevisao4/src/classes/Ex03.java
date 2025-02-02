package classes;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Quantos casos deseja testar? ");
        int qtd = ent.nextInt();

        double n1,n2,n3;
        double[] media = new double[qtd];

        System.out.println("Digite os valores: ");
        for(int i = 0; i < qtd; i++){

            n1 = ent.nextDouble();
            n2 = ent.nextDouble();
            n3 = ent.nextDouble();

            media[i] = (n1 * 2 + n2 * 3 + n3 * 5)/(2+3+5);
        }

        System.out.println("Resultado: ");
        for(int i = 0; i < qtd; i++){
            System.out.printf("%.1f%n",media[i]);
        }

        ent.close();
    }
}
