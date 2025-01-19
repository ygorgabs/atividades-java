package aplicacao;

import java.util.Scanner;
import util.ConversorDeMoeda;

public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Qual o valor do dólar hoje? ");
		double cotacao = ent.nextDouble();
		System.out.print("Quanto dolares deseja comprar? ");
		double dolar = ent.nextDouble();
		double convertido = ConversorDeMoeda.converterMoeda(cotacao, dolar);
		System.out.println("O montante a pagar em reais = " + convertido);
		ent.close();

	}

}
