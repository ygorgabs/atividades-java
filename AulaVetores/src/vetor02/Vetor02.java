package vetor02;

import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args) {
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};

        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        Scanner ent = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = ent.nextInt();
        System.out.println("No ano de " + ano + ":");

        for(int c = 0; c < mes.length; c++){

            if(ano%4==0 && ano % 100 != 0 && c == 1){
                System.out.println("O mês de " + mes[c] + " tem " + (tot[c]+1) + " dias.");
            }else{
                System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias.");
            }
        }
    }
}
