package condicionais;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite dois valores para saber se são multiplos: ");
        int a = ent.nextInt();
        int b = ent.nextInt();

        if (a % b == 0 || b % a == 0) System.out.println("São múltiplos");
        else System.out.println("Não são múltiplos");

        ent.close();
    }
}
