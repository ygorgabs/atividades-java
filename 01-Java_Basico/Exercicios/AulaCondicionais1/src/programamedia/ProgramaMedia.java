package programamedia;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi: "+m);
        if(m>9){
            System.out.println("Parabéns!!!");
        } //Fechamento do if
    }//Fechamento do metodo main
}
