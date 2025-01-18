package aplicacao;

import entidades.Produtos;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos produto = new Produtos();

        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Informações do produto: " + produto);

        System.out.println();
        System.out.print("Insira o numero de produtos a serem adicionados no estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.println();
        System.out.print("Insira o numero de produtos a serem removidos no estoque: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        sc.close();
    }
}
