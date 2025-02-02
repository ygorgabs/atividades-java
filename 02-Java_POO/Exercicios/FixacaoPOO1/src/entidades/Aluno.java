package entidades;

public class Aluno {
	public String nome;
	public double nota1, nota2, nota3;
	
	public Double notaFinal() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public String resultado() {
		String resultado;
		if (this.notaFinal() >= 60) {
			resultado = "Passou";
		}else {
			resultado = "Reprovado\nFaltam " + (60 - this.notaFinal()) + " pontos";
		}
		
		return resultado;
	}
}
