package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		// Instanciando um objeto de data personalizado, passando qual é o fuso horario pelos metodos withZone e ZoneId.systemDefault
		//Para formatar objetos Instant é necessário passar sempre o fuso horario
		
		LocalDate d04 = LocalDate.parse("2025-01-25");
		Instant d06 = Instant.parse("2025-01-25T22:20:26Z");
		
		System.out.println("d04: " + d04.format(fmt1)); // passando um objeto data-hora para formato personalizado de data
		System.out.println("d04: " + fmt1.format(d04)); // formatando atraves do um objeto de formato personalizado de data com parametro data-hora iso
		System.out.println("d05: " + fmt3.format(d06)); //Classe Instant não tem o metodo format, entao tem que ser usado atraves do da classe DateTimeFormat
		
		
	}

}
