package entidades;

public class Empregado {
	public String nome;
	public double salarioBruto, imposto;
	
	public double salarioLiquido() {
		return this.salarioBruto - this.imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		this.salarioBruto += this.salarioBruto * (porcentagem/100);
	}
	
	public String toString() {
		return this.nome + ", RS " + String.format("%.2f", this.salarioLiquido());
	}
}
