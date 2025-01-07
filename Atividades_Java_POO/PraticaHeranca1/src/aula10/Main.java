package aula10;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Funcionario p3 = new Funcionario();
        Professor p4 = new Professor();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("DS");
        p3.setSetor("Estoque");
        p4.setSalario(2500.75f);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


        //p1.receberAum(550.20f);
        //p2.mudarTrabalho();
        //p4.cancelarMatr();
    }
}