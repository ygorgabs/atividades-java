package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

    /*
    Ordem de exceução:

    0 - Bloco de Inicializção estático da superclasse é executado quando a JVM carregar a classe pai
    1 - Bloco de Inicializção estático da subclasse é executado quando a JVM carregar a classe filha
    2 - Alocado espaço em memória para o objeto da superclasse
    3 - Cada atributo de superclasse é criado e inicializado com valores default ou valores inseridos na criação da classe
    4 - Os blocos de inicialização da superclasse são executados na ordem em que aparecem
    5 - Construtor da superclasse é executado
    6 - Alocado espaço em memória para o objeto da subclasse
    7 - Cada atributo de subclasse é criado e inicializado com valores default ou valores inseridos na definição
    8 - Os blocos de inicialização da subclasse são executados na ordem em que aparecem
    9 - Construtor da subclasse é executado

     */


    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");

    }
}
