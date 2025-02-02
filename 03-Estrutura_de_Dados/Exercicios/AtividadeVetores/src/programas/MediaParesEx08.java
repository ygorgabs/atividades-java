package programas;

import java.util.Scanner;

public class MediaParesEx08 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int num = ent.nextInt();
		int soma = 0, contador = 0;
		double media = 0;
		int[] vetor = new int[num];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = ent.nextInt();
			
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				contador++;
			}
				
		}
		
		if (contador > 0) {
			media = soma/contador;
			System.out.printf("Media dos pares = %.1f",media);
		} else {
			System.out.println("Nenhum número par");
		}
		
		ent.close();
	}

}
