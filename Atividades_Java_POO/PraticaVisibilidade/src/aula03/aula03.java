package aula03;

public class aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC crystal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;
        c1.destampar(); // metodo publico que esta dentro da classe caneta e que pode modificar o atributo tampada que é private
        c1.status();
        c1.rabiscar();
    }
}
