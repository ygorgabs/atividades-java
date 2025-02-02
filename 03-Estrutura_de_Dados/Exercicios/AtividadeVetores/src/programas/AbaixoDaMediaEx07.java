package programas;

import java.util.Scanner;

public class AbaixoDaMediaEx07 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int num = ent.nextInt();
		double soma = 0, media = 0;
		double[] vetor = new double[num];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = ent.nextDouble();
			
			soma += vetor[i];
		}
		
		media = soma/vetor.length;
		System.out.printf("%nMedia do vetor = %.3f %n",media);
		
		System.out.println("Elementos abaixo da média: ");
		for (double d : vetor) {
			if (d < media)
				System.out.println(d);
		}
		
		ent.close();
	}

}
