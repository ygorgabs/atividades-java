package util;

public class ConversorDeMoeda {
	
	public static double IOF = 0.06;
	
	public static double converterMoeda(double cotacao, double dolares) {
		double convert = cotacao * dolares;
		convert += convert * IOF;
		return convert;
	}

}
