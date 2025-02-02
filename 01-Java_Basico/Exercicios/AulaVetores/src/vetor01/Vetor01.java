package vetor01;

public class Vetor01 {
    public static void main(String[] args) {
        // int n[] = new int[4]; - primeira forma de declarar vetor

        int n[] = {3,2,8,7,5,4}; // segunda forma de declarar vetor

        System.out.println("Total de casas de N: " + n.length); //usando um atributo do vetor

        for (int i = 0; i < n.length; i++){
            System.out.println("Na posição " + i + " temos o valor " + n[i]);
        }
    }
}
