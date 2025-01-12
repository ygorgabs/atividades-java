package exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int valor1, valor2;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        valor1 = entrada.nextInt();
        System.out.print("Digite outro número: ");
        valor2 = entrada.nextInt();

        System.out.println("A soma dos valores foi: " + (valor1+valor2));
    }
}
