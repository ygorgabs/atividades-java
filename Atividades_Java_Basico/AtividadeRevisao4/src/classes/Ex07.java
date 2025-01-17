package classes;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = ent.nextInt();

        for(int i = 1; i <= num; i++){
            double quad = Math.pow(i,2);
            double cubo = Math.pow(i,3);

            System.out.printf("%d %.0f %.0f %n",i,quad,cubo);
        }

        ent.close();
    }
}
