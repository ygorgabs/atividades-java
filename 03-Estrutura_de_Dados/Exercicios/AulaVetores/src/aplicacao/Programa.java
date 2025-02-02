package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for(double i : vect) {
			soma += i;
		} //foreach em java
		
		double avg = soma/n;
		
		System.out.printf("Média da altura: %.2f", avg);
		
		sc.close();
	}

}
