package exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int A,B,C,D,Diferenca;
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite 4 números inteiros: ");
        A = ent.nextInt();
        B = ent.nextInt();
        C = ent.nextInt();
        D = ent.nextInt();

        Diferenca = (A*B-C*D);

        System.out.printf("Diferença = %d", Diferenca);
    }
}
