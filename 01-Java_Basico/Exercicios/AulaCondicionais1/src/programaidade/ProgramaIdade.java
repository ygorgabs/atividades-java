package programaidade;
import java.util.Scanner;
public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int nasc = t.nextInt();
        int idade = 2024 - nasc;
        System.out.println("Sua idade é: "+idade);
        if (idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
