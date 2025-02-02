package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class CriarConta {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		int numConta = ent.nextInt();
		ent.nextLine(); // sempre fazer isso depois de um nextInt seguido de um nextLine, pois senao o next line seguinte ira comer o espaço em pranco do next int
		System.out.print("Digite o beneficiario da conta: ");
		String nome = ent.nextLine();
		
		
		double valorOperacao;
		Conta conta;
		
		System.out.print("Deseja realizar um depósito inicial (s/n)? ");
		char op = ent.nextLine().charAt(0);
		
		if(op == 's') {
			System.out.print("Digite o valor do deposito inicial: ");
			valorOperacao = ent.nextDouble();
			conta = new Conta(nome,numConta,valorOperacao);
		}else {
			conta = new Conta(nome,numConta);
		}
		System.out.println();
		System.out.printf("Informações da conta: %n%s%n",conta);
		
		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		valorOperacao = ent.nextDouble();
		conta.deposito(valorOperacao);
		System.out.printf("Atualização da conta: %n%s%n",conta);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		valorOperacao = ent.nextDouble();
		conta.saque(valorOperacao);
		System.out.printf("Atualização da conta: %n%s%n",conta);
		
		ent.close();

	}

}
