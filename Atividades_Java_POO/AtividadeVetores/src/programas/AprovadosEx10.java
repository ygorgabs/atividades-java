package programas;

import java.util.Scanner;

import entidades.Aluno;

public class AprovadosEx10 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Quantos alunos serão digitados? ");
		int num = ent.nextInt();
		
		Aluno[] vetor = new Aluno[num];
		
		for (int i = 0; i < vetor.length; i++) {
			ent.nextLine();
			System.out.printf("Digite o nome, primeira e segunda nota do aluno %d:\n",i+1);
			String nome = ent.nextLine();
			double nota1 = ent.nextDouble();
			double nota2 = ent.nextDouble();
			
			vetor[i] = new Aluno(nome,nota1,nota2);
		}
		
		System.out.println("Alunos Aprovados: ");
		
		for (int i = 0; i < vetor.length; i++) {
			
			double media = (vetor[i].getNota1() + vetor[i].getNota2()) / 2;
			
			if(media >= 6) {
				System.out.println(vetor[i].getNome());
			}
		}
		
		ent.close();
	}

}
