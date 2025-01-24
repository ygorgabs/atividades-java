package programas;

import java.util.Scanner;

import entidades.Pessoa;

public class AlturasEx03 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int num = ent.nextInt();
		Pessoa[] vetor = new Pessoa[num];
		double soma = 0, media = 0, porcent = 0, cont = 0;
		
		
		for (int i = 0; i < vetor.length; i++) {
			
			ent.nextLine();
			System.out.printf("Dados da %da pessoa:%n",i + 1);
			System.out.print("Nome: ");
			String nome = ent.nextLine();
			System.out.print("Idade: ");
			int idade = ent.nextInt();
			System.out.print("Altura: ");
			double altura = ent.nextDouble();
			
			soma += altura;
			
			if (idade < 16) cont++;
			
			vetor[i] = new Pessoa(nome,idade,altura);
			
		}
		
		media = soma/num;
		porcent = (cont/num) * 100;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%n", porcent);
		
		for (int i = 0; i < vetor.length; i++) {
			
			if (vetor[i].getIdade() < 16)
				System.out.println(vetor[i].getNome());
			
		}
		
		ent.close();
	}

}
