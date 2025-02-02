package exercicios;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        double a, b, c, tri, circ, quad, trap, ret;
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        a = ent.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = ent.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = ent.nextDouble();

        tri = (a*c)/2;
        circ = 3.14159 * Math.pow(c,2);
        trap = (a+b)*c / 2;
        quad = b*b;
        ret = a*b;

        System.out.printf("Triangulo: %.3f %n",tri);
        System.out.printf("Circulo: %.3f %n",circ);
        System.out.printf("Trapezio: %.3f %n",trap);
        System.out.printf("Quadrado: %.3f %n",quad);
        System.out.printf("Retangulo: %.3f %n",ret);

    }
}
