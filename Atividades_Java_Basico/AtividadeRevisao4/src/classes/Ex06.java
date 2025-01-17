package classes;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = ent.nextInt();

        for(int i = 1; i <= num; i++){

            if(num%i == 0){
                System.out.println(i);
            }
        }

        ent.close();
    }
}
