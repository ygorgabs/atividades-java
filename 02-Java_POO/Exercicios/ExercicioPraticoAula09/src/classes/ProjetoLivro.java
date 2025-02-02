package classes;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Ygor",24,"M");
        p[1] = new Pessoa("Bruno", 23, "M");

        l[0] = new Livro("Aprendendo Java","Jose AA", 500,p[0]);
        l[1] = new Livro("POO Java", "Ana CB", 600, p[1]);
        l[2] = new Livro("Algoritmos","Luis F", 200, p[1]);

        l[0].abrir();
        l[0].folhear(501);
        System.out.println(l[0].detalhes());
    }
}
