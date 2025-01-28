package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de linhas e colunas da matriz: ");
		int line = sc.nextInt();
		int column = sc.nextInt();
		
		int[][] mat = new int [line][column];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nDigite o número para achar na matriz: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Posição: " + i + "," + j);
					
					if ((j-1) >= 0)
						System.out.println("Esquerda: " + mat[i][j-1]);
					
					if((j+1) < mat[i].length)
						System.out.println("Direita: " + mat[i][j+1]);
					
					if ((i-1)>= 0 )
						System.out.println("A cima: " + mat[i-1][j]);
					
					if ((i+1) < mat.length)
						System.out.println("Abaixo: " + mat[i+1][j]);
					
					System.out.println();
				}
			}
		}
		
		
		sc.close();
	}

}
