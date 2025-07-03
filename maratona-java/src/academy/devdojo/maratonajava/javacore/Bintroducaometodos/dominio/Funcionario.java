package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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

        double media = soma/this.salarios.length;

        System.out.println("A média dos salários é: " + media);
    }
}
