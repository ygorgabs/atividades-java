package entidades;

public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalNoEstoque(){
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return this.nome + ", R$ " +  String.format("%.2f", this.preco) + ", " + this.quantidade + " unidades, Total: R$ " + String.format("%.2f", this.valorTotalNoEstoque());
    }
}
