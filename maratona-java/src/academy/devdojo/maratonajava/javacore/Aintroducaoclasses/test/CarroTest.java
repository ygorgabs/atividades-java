package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Volkswagen";
        carro1.modelo = "Gol";
        carro1.ano = 2020;

        carro2.nome = "Fiat";
        carro2.modelo = "Uno";
        carro2.ano = 2023;

        System.out.println("Nome: "+carro1.nome+" Modelo: "+carro1.modelo+" Ano: "+carro1.ano);
        System.out.println("Nome: "+carro2.nome+" Modelo: "+carro2.modelo+" Ano: "+carro2.ano);
    }
}
