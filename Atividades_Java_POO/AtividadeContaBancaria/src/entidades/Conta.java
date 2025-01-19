package entidades;

public class Conta {
	
	private String nome;
	private int numConta;
	private double saldoBanc;
	
	public Conta(String nome, int numConta, double saldoBanc) {
		this.nome = nome;
		this.numConta = numConta;
		this.saldoBanc = saldoBanc;
	}
	
	public Conta(String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;
		this.saldoBanc = 0.00;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public double getSaldoBanc() {
		return this.saldoBanc;
	}
	
	public void deposito(double deposito) {
		this.saldoBanc += deposito;
	}
	
	public void saque(double saque) {
		
		double taxa = 5.00;
		
		this.saldoBanc -= saque + taxa;
	}
	
	public String toString() {
		return "Conta "
				+ this.getNumConta()
				+ ", Beneficiário: "
				+ this.getNome()
				+ ", Saldo: R$ "
				+ String.format("%.2f", this.getSaldoBanc());	
	}
	
}
