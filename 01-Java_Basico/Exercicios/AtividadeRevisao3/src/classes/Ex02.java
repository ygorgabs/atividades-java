package classes;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite os valores de X e Y para descobrir o quadrante");
		x = ent.nextInt();
		y = ent.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			}else if(x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			}else if(x > 0 && y < 0) {
				System.out.println("Quarto quadrante");
			}else {
				System.out.println("Terceiro quadrante");
			}
			
			x = ent.nextInt();
			y = ent.nextInt();
		}
		
		ent.close();
	}

}
