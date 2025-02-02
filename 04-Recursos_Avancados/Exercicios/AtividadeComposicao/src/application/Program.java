package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner ent = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o nome do departamento: ");
		String dept = ent.nextLine();
		System.out.println("Digite os dados do trabalhador: ");
		System.out.print("Nome: ");
		String workerName = ent.nextLine();
		System.out.print("Nivel: ");
		String workerLevel = ent.nextLine();
		System.out.print("Salario Base: ");
		double baseSalary = ent.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Department(dept));
		
		System.out.println("Quantos contratos o trabalhador vai ter? ");
		int n = ent.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Digite os dados do contrato " + i);
			System.out.print("Data (DD/MM/AAAA): ");
			Date contractDate = sdf.parse(ent.next());
			System.out.print("Valor por Hora: ");
			double valuePerHour = ent.nextDouble();
			System.out.print("Duração (Horas): ");
			int hours = ent.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println("Entre com mes e ano para calcular os recebimentos (MM/AAAA): ");
		String monthAndYear = ent.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println();
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Recebimentos de " + monthAndYear + ": R$" + String.format("%.2f", worker.income(year, month)));
		
		ent.close();
	}

}
