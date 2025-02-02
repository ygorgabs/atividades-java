package aula11;

public final class Professor {
    private String especialidade;
    private float salario;

    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setEspecialidade(String Especialidade){
        this.especialidade = especialidade;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public void receberAum(float n){
        this.setSalario(this.getSalario()+n);
    }
} // classe final. que nao pode ter filhos
