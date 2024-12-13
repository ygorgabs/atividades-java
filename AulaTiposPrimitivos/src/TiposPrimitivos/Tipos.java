package TiposPrimitivos;

import java.util.Scanner;

public class Tipos {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = usuario.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = usuario.nextFloat();

        // System.out.println("Sua nota é "+ nota);
        //System.out.printf("A nota de %s é %.2f", nome, nota); // print formatado
        System.out.format("A nota de %s é %.2f \n", nome, nota); // outro comando para o mesmo uso
    }
}
