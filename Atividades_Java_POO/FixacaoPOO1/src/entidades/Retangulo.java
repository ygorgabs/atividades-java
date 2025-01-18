package entidades;

public class Retangulo {
	public double altura, largura;
	
	public double area(){
		return this.altura * this.largura;
	}
	
	public double perimetro() {
		return 2 * (this.altura + this.largura);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.largura, 2));
	}
}
