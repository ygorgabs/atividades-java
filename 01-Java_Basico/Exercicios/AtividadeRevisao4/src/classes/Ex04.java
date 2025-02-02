package classes;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Quantos vezes deseja verificar o resultado? ");
        int num = ent.nextInt();

        double n1, n2, res;

        for(int i = 1; i <= num; i++){
            n1 = ent.nextDouble();
            n2 = ent.nextDouble();

            if(n2 != 0){
                res = n1/n2;
                System.out.printf("Resposta: %.2f%n",res);
            }else{
                System.out.println("Divisão impossivel");
            }
        }

        ent.close();
    }
}
