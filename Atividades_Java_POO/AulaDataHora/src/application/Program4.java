package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2025-01-25");
		Instant d06 = Instant.parse("2025-01-25T22:20:26Z");
		LocalDateTime d05 = LocalDateTime.parse("2025-01-25T22:20:26");
		
		// realizando contas com as datas
		
		LocalDate pastWeek = d04.minusDays(7); // criando data tirando 7 dias de d04
		LocalDate nextWeek = d04.plusDays(7); // criando data adicionando 7 dias de d04
		
		System.out.println("pastWeek = " + pastWeek);
		System.out.println("nextWeek = " + nextWeek);
		
		LocalDateTime pastWeekLDT = d05.minusDays(7);
		LocalDateTime nextWeekLDT = d05.plusDays(7);
		
		System.out.println("pastWeekLDT = " + pastWeekLDT);
		System.out.println("nextWeekLDT = " + nextWeekLDT);
		
		Instant pastWeekInstant = d06.minus(7,ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		//Calculando distancia entre datas
		
		// Duration t1 = Duration.between(pastWeek.atTime(0,0), d04.atTime(0,0));duration nao calcula LocalDate, entao tem que passar as horas quando for usar o LocalDate
		Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay()); //segunda forma de converter para date time
		Duration t2 = Duration.between(pastWeekLDT, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		
		System.out.println("t1 dias: " + t1.toDays());
		System.out.println("t2 dias: " + t2.toDays());
		System.out.println("t3 dias: " + t3.toDays());
		

	}

}
