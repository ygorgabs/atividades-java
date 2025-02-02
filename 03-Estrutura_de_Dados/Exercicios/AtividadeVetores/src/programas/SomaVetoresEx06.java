package programas;

import java.util.Scanner;

public class SomaVetoresEx06 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor: ");
		int num = ent.nextInt();
		int[] vetorA = new int[num];
		int[] vetorB = new int[num];
		int[] vetorC = new int[num];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = ent.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = ent.nextInt();
		}
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("Vetor resultante: ");
		for (int i : vetorC) {
			System.out.println(i);
		}
		
		ent.close();
	}

}
