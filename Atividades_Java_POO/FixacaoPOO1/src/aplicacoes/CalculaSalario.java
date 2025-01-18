package aplicacoes;

import java.util.Scanner;

import entidades.Empregado;

public class CalculaSalario {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Empregado empregado = new Empregado();
		
		System.out.println("Digite os dados do empregado: ");
		System.out.print("Nome: ");
		empregado.nome = ent.nextLine();
		System.out.print("Salario Bruto: ");
		empregado.salarioBruto = ent.nextDouble();
		System.out.print("Imposto: ");
		empregado.imposto = ent.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " + empregado.toString());
		
		System.out.println();
		System.out.print("Qual a porcentagem de aumento do salario? ");
		empregado.aumentarSalario(ent.nextDouble());
		
		System.out.println();
		System.out.println("Dados atualizados: " + empregado.toString());
		ent.close();
	}

}
