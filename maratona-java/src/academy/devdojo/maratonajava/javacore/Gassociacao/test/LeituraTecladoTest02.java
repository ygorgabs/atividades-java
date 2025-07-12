package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Random;
import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O grande programa de previsão do futuro!!!");
        System.out.println("---------------------------------------------");
        System.out.println("Digite sua pergunta que responderei sim ou não");

        char continua;

        do{
            String pergunta = scanner.nextLine();
            Random random = new Random();
            int valor = random.nextInt(2);
            String resposta = valor == 0 ? "Não" : "Sim";

            System.out.println(resposta);
            System.out.println("-----------------------");
            System.out.println("Deseja fazer uma nova pergunta? (S/N)");
            continua = Character.toUpperCase(scanner.next().charAt(0));
            scanner.nextLine(); // fiz isso para engolir o espaço em branco que ficará após o next();
        }while(continua == 'S');
        scanner.close();
    }
}
