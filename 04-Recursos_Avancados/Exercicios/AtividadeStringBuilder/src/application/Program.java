package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Tenha uma boa viagem!!");
        Comment c2 = new Comment("Uau! Que incrível!");
        Post p1 = new Post(sdf.parse("21/06/2024 13:05:44"), "Viagem para Nova Zelandia,", "Vou visitar esse país maravilhoso", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

    }
}
