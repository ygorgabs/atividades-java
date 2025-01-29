package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //instanciando essa classe para poder usar outros formatos de data para criar objetos data-hora
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); // instanciando a data do pc
		LocalDateTime d02 = LocalDateTime.now(); // instanciando data e hora local
		Instant d03 = Instant.now(); // instanciando horario padrao GMT
		LocalDate d04 = LocalDate.parse("2025-01-25"); // convertendo texto em um objeto data
		LocalDateTime d05 = LocalDateTime.parse("2025-01-25T22:20:26"); // convertendo texto em um objeto data-hora
		Instant d06 = Instant.parse("2025-01-25T22:20:26Z"); // convertendo texto em um objeto data-hora padrao GMT
		Instant d07 = Instant.parse("2025-01-25T22:20:26-03:00"); // convertendo texto com horario local em um objeto data-hora padrao GMT
		
		LocalDate d08 = LocalDate.parse("28/01/2025",fmt1); // passando fmt1 como parametro para aceitar o formato de data br
		LocalDateTime d09 = LocalDateTime.parse("28/01/2025 23:00",fmt2);
		LocalDate d10 = LocalDate.of(2025, 01, 28); // instanciando data-hora a a patir de dados isolados
		LocalDateTime d11 = LocalDateTime.of(2025, 01, 28, 23, 02);
		
		System.out.println("d01: " + d01);
		System.out.println("d01: " + d02);
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09);
		System.out.println("d10: " + d10);
		System.out.println("d11: " + d11);

	}

}
