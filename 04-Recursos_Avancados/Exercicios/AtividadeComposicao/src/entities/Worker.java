package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department; //Composição 1
	private List <HourContract> contracts = new ArrayList<>(); // composição 2 - listas devem ser instanciadas
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}


	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = this.baseSalary;
		Calendar cal = Calendar.getInstance(); // instancia um objeto calendario
		 
		for (HourContract c : contracts) {
			cal.setTime(c.getDate()); // pega a data do contrato define como a data do obj calendario
			int c_year = cal.get(Calendar.YEAR); // guarda o ano do contrato na variavel
			int c_month = 1 + cal.get(Calendar.MONTH);// guarda o mes do contrato na variavel
			
			if (year == c_year && month == c_month ) {
				sum += c.totalValue(); // compara se o mes e o ano são os mesmos e realiza a soma
			}
		}
		
		return sum;
	}
	
}
