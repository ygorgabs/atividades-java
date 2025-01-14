package condicionais;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite os valores de x e y");
        double x = ent.nextDouble();
        double y = ent.nextDouble();
        String res = "";

        if(x > 0 && y > 0){
            res = "Q1";
        }else if(x < 0 && y > 0){
            res = "Q2";
        }else if(x < 0 && y < 0){
            res = "Q3";
        }else if(x > 0 && y < 0){
            res = "Q4";
        }else if(x == 0 && y != 0){
            res = "Eixo Y";
        }else if(x != 0 && y == 0){
            res = "Eixo X";
        }else{
            res = "Origem";
        }

        System.out.println(res);
        ent.close();
    }
}
