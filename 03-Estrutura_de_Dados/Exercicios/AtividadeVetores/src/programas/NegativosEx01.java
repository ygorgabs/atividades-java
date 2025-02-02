package programas;

import java.util.Scanner;

public class NegativosEx01 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int tamVet = ent.nextInt();
		int[] vetor = new int[tamVet];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = ent.nextInt();
		}
		
		System.out.println("Números Negativos: ");
		
		for (int i : vetor) {
			if (i < 0) System.out.println(i);
		}
		
		ent.close();

	}

}
