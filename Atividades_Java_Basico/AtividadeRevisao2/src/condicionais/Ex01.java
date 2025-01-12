package condicionais;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int num;
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um número para saber se é negativo ou não");
        num = ent.nextInt();

        if(num < 0) System.out.println("Negativo");
        else System.out.println("Não negativo");

        ent.close();
    }
}
