package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    int MAX_DATA_SIZE = 10;

    void load();

    default void checkData(){
        System.out.println("Checando os dados...");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
