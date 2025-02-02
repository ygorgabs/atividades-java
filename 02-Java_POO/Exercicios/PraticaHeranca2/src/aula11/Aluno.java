package aula11;

public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    public int getMatr(){
        return this.matr;
    }

    public void setMatr(int matr){
        this.matr = matr;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void pagarMensalidade(){
        System.out.println("Pagar Mensalidade de " + this.getNome());
    }
} //Herança para diferença e generalização de bolsista