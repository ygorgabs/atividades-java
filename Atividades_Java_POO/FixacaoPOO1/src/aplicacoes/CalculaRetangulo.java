package aplicacoes;

import java.util.Scanner;

import entidades.Retangulo;

public class CalculaRetangulo {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		System.out.println("Digite a altura e largura do retangulo: ");
		ret.altura = ent.nextDouble();
		ret.largura = ent.nextDouble();
		
		System.out.printf("Area = %.2f%nPerimetro = %.2f%nDiagonal = %.2f",ret.area(),ret.perimetro(),ret.diagonal());
	}

}
