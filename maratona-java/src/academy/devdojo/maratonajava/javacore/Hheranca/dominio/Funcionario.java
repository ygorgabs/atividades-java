package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;


    static{
        System.out.println("Dentro do bloco de inicializacao estatico funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicializacao funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicializacao funcionario 2");
    }


    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioDePagamento() {
        System.out.println("Eu " + this.nome + " recebi o valor de R$ " + this.salario);
    }
}
