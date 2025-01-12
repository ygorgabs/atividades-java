package exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int numFunc, horas;
        double salarioTot, salarioHora;
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite o número do funcionário: ");
        numFunc = ent.nextInt();
        System.out.println("Quantas horas foram trabalhadas? ");
        horas = ent.nextInt();
        System.out.println("Qual é o valor da hora? ");
        salarioHora = ent.nextDouble();

        salarioTot = salarioHora * horas;

        System.out.printf("Funcionario: %d %n",numFunc);
        System.out.printf("Salario: R$ %.2f", salarioTot);
    }
}
