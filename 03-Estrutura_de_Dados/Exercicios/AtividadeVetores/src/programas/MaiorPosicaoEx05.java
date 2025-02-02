package programas;

import java.util.Scanner;

public class MaiorPosicaoEx05 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int num = ent.nextInt();
		double[] vetor = new double[num];
		double maior = 0;
		int pos = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = ent.nextDouble();
			
			if (vetor[i] > maior) {
				maior = vetor[i];
				pos = i;
			}
		}
		
		System.out.printf("%nMaior valor = %.1f %n",maior);
		System.out.printf("Posição do maior valor = %d",pos);
		
		ent.close();
	}

}
