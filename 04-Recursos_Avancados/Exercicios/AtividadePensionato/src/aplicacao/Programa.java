package aplicacao;

import java.util.Scanner;

import entidades.Inquilino;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quatros deseja alugar? ");
		int qtd = sc.nextInt();
		
		Inquilino[] vetor = new Inquilino[10];
		
		for (int i = 0; i < qtd; i++) {
			sc.nextLine();
			System.out.printf("Aluguel #%d\n",i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vetor[quarto] = new Inquilino(nome, email);
			System.out.println();
		}
		
		System.out.println("Quartos ocupados: ");
		
		for (int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] != null) {
				System.out.printf("%d: %s, %s %n",i,vetor[i].getNome(),vetor[i].getEmail());
			}
		}
		sc.close();
	}

}
