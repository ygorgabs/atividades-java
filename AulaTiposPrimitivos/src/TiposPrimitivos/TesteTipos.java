package TiposPrimitivos;

public class TesteTipos {

    public static void main(String[] args) {
        /*
         int idade = 30;
        String valor = idade;
        Jeito errado de tentar converter um valor de um tipo para outro tipo
        */
        int idade = 30;
        String valor = Integer.toString(idade); //jeito correto de converter - int para string
        System.out.println("Variavel valor: " + valor);

        String valor2 = "40";
        int idade2 = Integer.parseInt(valor2); // converter string para int
        System.out.println("Variavel idade2: " + idade2);

        String valor3 = "35.5";
        float num = Float.parseFloat(valor3); //converter string para float
        System.out.println("Variavel num: "+ num);
    }


}
