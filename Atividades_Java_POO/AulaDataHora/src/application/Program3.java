package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2025-01-25");
		Instant d06 = Instant.parse("2025-01-25T22:20:26Z");
		LocalDateTime d05 = LocalDateTime.parse("2025-01-25T22:20:26");
		
		//convertendo data global em data local
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //parametro d06 e o fuso da maquina do usuario
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); //passando um fuso personalizado como parametro
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mes = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 hora = " + d05.getMinute());
		
		
	}

}
