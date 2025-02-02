package entities.enums;

public enum DiaSemana {
	SEGUNDA(1),
	TERCA(2),
	QUARTA(3),
	QUINTA(4),
	SEXTA(5),
	SABADO(6),
	DOMINGO(7);
	
	private int valor;
	
	DiaSemana(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	// declarando o enum com métodos e contrutor proprio
	// cada enum valor do enum é uma instancia, por esse motivo quando definimos um contrutor, cada enum deve passar os respectivos parametros
}
