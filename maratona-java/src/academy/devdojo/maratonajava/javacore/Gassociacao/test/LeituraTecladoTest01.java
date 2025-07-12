package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite M ou F para seu genero: ");
        char genero = Character.toUpperCase(sc.next().charAt(0));
        System.out.println("---------------------");
        System.out.println("Nome " + nome + "\nIdade: " + idade + "\nGenero: " + genero);

        sc.close();
    }
}
