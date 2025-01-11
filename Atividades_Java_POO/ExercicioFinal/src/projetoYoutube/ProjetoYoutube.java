package projetoYoutube;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 2 Java");
        v[2] = new Video("Aula 3 PHP");

        Gafanhoto[] g = new Gafanhoto[2];

        g[0] = new Gafanhoto("ygor",24,"M","ygs");
        g[1] = new Gafanhoto("Bruno", 23, "M", "bru");

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
