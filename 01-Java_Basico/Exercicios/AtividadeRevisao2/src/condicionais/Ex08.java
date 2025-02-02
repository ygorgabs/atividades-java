package condicionais;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite seu salario para calcular o imposto de renda");
        double salario = ent.nextDouble();
        double imposto = 0;

        if(salario <= 2000){
            imposto = 0;
        }else if(salario <= 3000){
            imposto = (salario - 2000) * 0.08;
        }else if(salario <= 4500){
            imposto = (salario - 3000)* 0.18 + 1000 * 0.08;
        }else{
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if(imposto == 0){
            System.out.println("Isento");
        }else{
            System.out.printf("R$ %.2f",imposto);
        }

        ent.close();
    }
}
