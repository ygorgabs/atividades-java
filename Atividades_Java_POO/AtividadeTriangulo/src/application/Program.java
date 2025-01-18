package application;

import entities.Triangulo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Insira as medidas do triangulo X: ");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();
        System.out.println("Insira as medidas do triangulo Y: ");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do triangulo X: %.4f%n",areaX);
        System.out.printf("Area do triangulo Y: %.4f%n",areaY);

        if(areaX > areaY){
            System.out.println("Maior area: X");
        }
        else{
            System.out.println("Maior area: Y");
        }


        sc.close();
    }
}
