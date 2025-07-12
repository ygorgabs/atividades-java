package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 32");
        endereco.setCep("05783-171");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luffy");
        pessoa.setCpf("12345678900");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("-------------------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ichigo Kurosaki");
        funcionario.setCpf("111111111111111");
        funcionario.setSalario(10000);
        funcionario.setEndereco(endereco);

        funcionario.imprime();
    }
}
