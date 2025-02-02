package programas;

import java.util.Scanner;

public class SomaVetorEx02 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Quantos número você vai digitar? ");
		int num = ent.nextInt();
		double[] vetor = new double[num];
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o número: ");
			vetor[i] = ent.nextDouble();
			soma += vetor[i];
		}
		
		System.out.println();
		System.out.print("Valores = ");
		for (double d : vetor) {
			System.out.print(d + " ");
		}
		System.out.printf("%nSoma = %.2f",soma);
		System.out.printf("%nMedia = %.2f", (soma/num));
		ent.close();
	}

}
