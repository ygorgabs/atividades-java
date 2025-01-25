package programas;

import java.util.Scanner;

import entidades.Pessoa;

public class MaisVelhoEx09 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int num = ent.nextInt();
		String nomeVelho = "";
		int idadeVelho = 0;
		
		Pessoa[] vetor = new Pessoa[num];
		
		for (int i = 0; i < vetor.length; i++) {
			ent.nextLine();
			System.out.printf("Dados da %da pessoa: %n",i+1);
			System.out.print("Nome: ");
			String nome = ent.nextLine();
			System.out.print("Idade: ");
			int idade = ent.nextInt();
			
			vetor[i] = new Pessoa(nome,idade);
			
			if (vetor[i].getIdade() > idadeVelho) {
				nomeVelho = vetor[i].getNome();
				idadeVelho = vetor[i].getIdade();
			}
			
		}
		
		System.out.printf("Pessoa mais velha: %s",nomeVelho);
		ent.close();
	}

}
