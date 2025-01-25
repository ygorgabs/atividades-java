package programas;

import java.util.Scanner;

import entidades.Pessoa;

public class DadosPessoasEx11 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int num = ent.nextInt();
		
		double somaF = 0, mediaF = 0, maior = 0, menor = 0;
		int contM = 0, contF = 0;
		
		Pessoa[] vetor = new Pessoa[num];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Altura da %da pessoa: ",i+1);
			double altura = ent.nextDouble();
			ent.nextLine();
			System.out.printf("Genero da %da pessoa: ",i+1);
			char genero = ent.nextLine().charAt(0);
			
			vetor[i] = new Pessoa(altura,genero);
			
			if(i == 0) {
				menor = vetor[i].getAltura();
			}else if (i > 0 && vetor[i].getAltura() < menor) {
				menor = vetor[i].getAltura();
			}
			
			
			if (vetor[i].getAltura() > maior) {
				maior = vetor[i].getAltura();
			}
			
			
			if (vetor[i].getGenero() == 'f' || vetor[i].getGenero() == 'F')	{
				contF++;
				somaF += vetor[i].getAltura();
			}
			
			if (vetor[i].getGenero() == 'm' || vetor[i].getGenero() == 'M')	{
				contM++;
			}
			
		}
		
		mediaF = somaF/contF;
		
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Media de altura das mulheres = %.2f%n", mediaF);
		System.out.printf("Numero de homens = %d", contM);
		
		ent.close();
	}

}
