package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos empregados serão registrados? ");
		int num = sc.nextInt();
		
		List <Employee> list = new ArrayList<>();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Funcionario #" + (i+1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id,name,salary));
			System.out.println();
		}
		
		System.out.print("Digite o ID do funcionário que deseja realizar um aumento: ");
		 
		int findID = sc.nextInt();
		
		Employee indice = list.stream().filter(x -> x.getId() == findID).findFirst().orElse(null);
		//Integer indice = position(list,findID);		
		
		if (indice != null) {
			System.out.print("Digite a porcentagem: ");
			double percent = sc.nextDouble();
			//list.get(indice).increaseSalary(percent);
			indice.increaseSalary(percent);
		}else {
			System.out.println("Esse ID não existe!");
		}
		
		System.out.println();
		System.out.println("Lista de funcionários: ");
		
		for (Employee x : list) {
			System.out.println(x);
		}

		sc.close();
	} // fim metodo principal
	
	public static Integer position(List<Employee> list, int id) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getId() == id) {
				return i;	
			}
		}
		
		return null;
	}// fim metodo auxiliar

}
