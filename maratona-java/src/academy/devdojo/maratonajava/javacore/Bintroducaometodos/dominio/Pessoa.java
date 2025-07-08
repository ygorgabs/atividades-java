package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){

        if(idade < 0){
            System.out.println("Idade incorreta");
            return;
        }

        this.idade = idade;
    }

    public String getNome(){
        return  this.nome;
    }

    public int getIdade(){
        return  this.idade;
    }
}
