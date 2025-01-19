package entidades;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;
    
   
    
    public Produtos() {
		super();
	}


	public Produtos(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
    

	public Produtos(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	} // utilizando sobrecarga nos construtores
	
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
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
