package classes;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		int senha = ent.nextInt();
		
		while(senha != 2002){
			System.out.println("Senha Invalida");
			senha = ent.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		ent.close();

	}

}
