package util;

public class Calculadora {
	
	public static final double PI = 3.14159;
	
	public static double circunferencia(double raio) {
		return 2 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3;
	}
}
