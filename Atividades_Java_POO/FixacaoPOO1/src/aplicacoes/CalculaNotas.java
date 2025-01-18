package aplicacoes;

import java.util.Scanner;

import entidades.Aluno;

public class CalculaNotas {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome e as notas do aluno: ");
		aluno.nome = ent.nextLine();
		aluno.nota1 = ent.nextDouble();
		aluno.nota2 = ent.nextDouble();
		aluno.nota3 = ent.nextDouble();
		
		
		System.out.println("Nota final: " + aluno.notaFinal() + "\n" + aluno.resultado());
		ent.close();

	}

}
