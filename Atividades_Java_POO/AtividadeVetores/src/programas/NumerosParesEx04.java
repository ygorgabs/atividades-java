package programas;

import java.util.Scanner;

public class NumerosParesEx04 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Quantos número você vai digitar? ");
		int num = ent.nextInt();
		int qtd = 0;
		int[] vetor = new int[num];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = ent.nextInt();
			
			if(vetor[i] % 2 == 0) qtd++;
		}
		
		System.out.println();
		System.out.print("Numeros Pares: ");
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0)
				System.out.printf("%d ",vetor[i]);
		}
		
		System.out.println();
		System.out.printf("Quantidade de pares = %d", qtd);
		ent.close();
	}

}
