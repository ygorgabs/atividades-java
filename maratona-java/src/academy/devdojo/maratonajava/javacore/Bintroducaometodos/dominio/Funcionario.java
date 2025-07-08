package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime(){
        System.out.println("-----------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if(this.salarios == null || this.salarios.length == 0) return;

        for(int i = 0; i < salarios.length; i++){
            System.out.println("Salario " + (i+1) + " = " +  this.salarios[i]);
        }

        mediaSalario();
    }

    public void mediaSalario(){

        if(this.salarios == null || this.salarios.length == 0) return;

        double soma = 0;

        for(double salario : salarios){
            soma += salario;
        }

        media = soma/this.salarios.length;

        System.out.println("A média dos salários é: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
