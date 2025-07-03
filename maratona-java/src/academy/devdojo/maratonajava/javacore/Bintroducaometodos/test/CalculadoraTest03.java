package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double res = calculadora.divideDoisNumeros(20,2);
        System.out.println(res);
        System.out.println("----------------");
        calculadora.imprimeDivisao(86, 5);
    }
}
