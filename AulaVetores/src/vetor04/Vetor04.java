package vetor04;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vet[]={3,7,6,1,9,4,2};
        for(int valor:vet){
            System.out.print(valor + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet,1); // metodo para buscar valores dentro de um arry. Retorna a posição do valor
        System.out.println("Encontrei o valor na posição: "+ p);
    }
}
