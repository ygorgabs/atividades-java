package classes;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Quantos números deseja verificar? ");
        int num = ent.nextInt();
        int valores, in = 0, out = 0;

        for(int i = 1; i <= num; i++){
            valores = ent.nextInt();

            if(valores >= 10 && valores <= 20){
                in++;
            }else{
                out++;
            }
        }

        System.out.printf("%d in%n%d out",in,out);
    }
}
