package condicionais;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        double cquente = 4.0;
        double xsalada = 4.5;
        double xbacon = 5.0;
        double torrada = 2.0;
        double refri = 1.5;

        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o codigo do produto e a quantidade do item");
        int num = ent.nextInt();
        int qtd = ent.nextInt();

        double tot = 1;

        if(num == 1){
            tot = cquente * qtd;
        }else if(num == 2){
            tot = xsalada * qtd;
        }else if (num == 3) {
            tot = xbacon * qtd;
        }else if (num == 4) {
            tot = torrada * qtd;
        }else if(num == 5){
            tot = refri * qtd;
        }

        System.out.printf("Total: R$ %.2f",tot);
    }
}
