package condicionais;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um valor para saber se é par ou impar: ");
        int num = ent.nextInt();

        if(num % 2 == 0) System.out.println("É par");
        else System.out.println("É impar");

        ent.close();
    }
}
