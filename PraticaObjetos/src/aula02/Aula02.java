package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // primeira instancia da classe caneta

        c1.cor="Azul";
        c1.ponta = (float)0.5;
        c1.tampar();


        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta(); //segunda instancia da classe caneta
        c2.modelo = "Curso";
        c2.cor = "Preta";
        c2.destampar();

        c2.status();
        c2.rabiscar();
    }
}
