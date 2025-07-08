package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

//        funcionario.nome = "Ygor";
//        funcionario.idade = 24;
//        funcionario.salarios = new double[]{1500.00, 1600.00, 1800.00};

        funcionario.setNome("Ygor");
        funcionario.setIdade(24);
        funcionario.setSalarios(new double[]{1500.00, 1600.00, 1800.00});

        funcionario.imprime();
    }
}
