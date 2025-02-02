package entities;

public class Formulario {
	
	enum Genero{
		FEMININO('F'),
		MASCULINO('M');
		
		private char valor;
		
		Genero(char valor){
			this.valor = valor;
		}
	} // fim enum
	
	
	private String nome;
	private Genero genero;
	
	//	declarando o enum dentro da propripria classe
}
