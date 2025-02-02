package application;

import entities.Data;
import entities.enums.DiaSemana;

public class Program2 {

	public static void main(String[] args) {
		
		// aplicando o uso do enum diretamente
		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia + " - " + dia.getValor());
		System.out.println();
		
		// aplicando o uso do enum através de outra classe
		
		Data data = new Data(31,01,2025,DiaSemana.SEXTA);
		
		// usando o metodo values
		
		DiaSemana[] dias = DiaSemana.values();
		
		for (DiaSemana diaSemana : dias) {
			System.out.println(diaSemana);
		}
		
		// uso do metodo valueOf
		
		System.out.println();
		dia = DiaSemana.valueOf("SABADO");
		System.out.println(dia);

	}

}
