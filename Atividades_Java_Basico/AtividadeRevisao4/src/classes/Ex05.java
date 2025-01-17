package classes;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Qual numero deseja calcular? ");
        int num = ent.nextInt();
        int fat = 1;

        for(int i = num; i >= 1; i--){
            fat *= i;
        }

        System.out.println(fat);
        ent.close();

    }
}
