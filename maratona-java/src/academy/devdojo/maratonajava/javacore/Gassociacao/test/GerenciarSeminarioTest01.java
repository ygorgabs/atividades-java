package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

import java.util.Scanner;

public class GerenciarSeminarioTest01 {
    public static void main(String[] args) {
        System.out.println("Sistema Gerenciador de Seminários");
        System.out.println("----------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um endereço para o local onde ocorrerá o seminário: ");
        String endereco = sc.nextLine();
        Local local = new Local(endereco);
        System.out.println("------------------------------------------------");

        System.out.println("Agora escolha o título do seminário: ");
        String titulo = sc.nextLine();
        Seminario seminario = new Seminario(titulo, local);
        System.out.println("------------------------------------------------");

        System.out.println("Informe o nome do professor que realizará o seminário: ");
        String nomeProfessor = sc.nextLine();
        System.out.println("Informe a especialidade do professor: ");
        String especialidadeProf = sc.nextLine();
        Professor professor = new Professor(nomeProfessor, especialidadeProf, new Seminario[]{seminario});
        System.out.println("------------------------------------------------");

        Aluno[] alunos = new Aluno[3];
        System.out.println("Cadastre 3 alunos que irão participar do seminário: ");

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            Aluno aluno = new Aluno(nome, idade);
            alunos[i] = aluno;
        }

        seminario.setAlunos(alunos);
        System.out.println("------------------------------------------------");

        System.out.println("Resumo do cadastro: ");
        seminario.imprime();
        professor.imprime();
    }
}
