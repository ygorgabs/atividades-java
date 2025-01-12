package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        double raio, area;
        Scanner ent = new Scanner(System.in);
        System.out.print("Insira o valor do raio de um circulo: ");
        raio = ent.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Area do circulo: %.2f",area);
    }
}
