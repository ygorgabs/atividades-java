package aula11;

public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();

        /*
        Visitante v1 = new Visitante();
        v1.setNome("Ygor");
        v1.setIdade(24);
        v1.setSexo("M");
        System.out.println(v1.toString());
        */

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatr(1111);
        a1.setCurso("Informatica");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatr(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}