package entidades;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produtos() {
    	
    }
    
    public Produtos(String nome, double preco, int quantidade) {
    	this.nome = nome;
    	this.preco = preco;
    	this.quantidade = quantidade;
    }
    
    public Produtos(String nome, double preco) {
    	this.nome = nome;
    	this.preco = preco;
    } // exemplo de sobrecarga - utilizando diferentes construtores na mesma classe

    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getNome() {
    	return this.nome;
    }
    
    public double getPreco() {
    	return this.preco;
    }
    
    public void setPreco(double preco) {
    	this.preco = preco;
    }
    
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
        return this.nome 
        		+ ", R$ " 
        		+  String.format("%.2f", this.preco) 
        		+ ", " 
        		+ this.quantidade 
        		+ " unidades, Total: R$ " 
        		+ String.format("%.2f", this.valorTotalNoEstoque());
    }
}
