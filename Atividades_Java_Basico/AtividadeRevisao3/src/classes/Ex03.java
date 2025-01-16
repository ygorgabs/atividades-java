package classes;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		int alc = 0, gas = 0, dis = 0, opc;
		System.out.println("Digite 1 para alcool, 2 para gasolina, 3 para diesel e 4 para finalizar");
		opc = ent.nextInt();
		
		while(opc != 4) {
			switch(opc) {
			case 1:
				alc ++;
				opc = ent.nextInt();
				break;
			case 2:
				gas ++;
				opc = ent.nextInt();
				break;
			case 3:
				dis ++;
				opc = ent.nextInt();
				break;
			default:
				opc = ent.nextInt();
				break;
				
			}
		}
		
		System.out.printf("Muito obrigado!%nAlcool: %d%nGasolina: %d%nDiesel: %d",alc,gas,dis);
		ent.close();
	}

}
