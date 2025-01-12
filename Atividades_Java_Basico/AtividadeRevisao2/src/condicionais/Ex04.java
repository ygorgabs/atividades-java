package condicionais;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite a hora inicial do jogo: ");
        int inicio = ent.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        int fim = ent.nextInt();

        int jogo;

        if (inicio > fim){
            jogo = 24 - (inicio - fim);
            System.out.println(jogo);
        } else if (inicio < fim){
            jogo = fim - inicio;
            System.out.println(jogo);
        } else {
            jogo = 24;
            System.out.println(jogo);
        }

        System.out.printf("O jogo durou %d hora(s)",jogo);
        ent.close();
    }
}
