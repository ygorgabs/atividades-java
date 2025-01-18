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



        System.out.println(produto);
        sc.close();
    }
}
