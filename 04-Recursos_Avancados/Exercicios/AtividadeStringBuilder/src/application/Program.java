package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    private static Comment c1;

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Tenha uma boa viagem!!");
        Comment c2 = new Comment("Uau! Que incrível!");
        Post p1 = new Post(sdf.parse("21/06/2024 13:05:44"), "Viagem para Nova Zelandia", "Vou visitar esse país maravilhoso", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Boa noite!");
        Comment c4 = new Comment("Qua força esteja com vc!");
        Post p2 = new Post(sdf.parse("28/07/2024 22:35:50"),"Boa noite pessoal","Vejo vocês amanhã",5);

        p2.addComment(c3);
        p2.addComment(c4);


        System.out.println(p1);
        System.out.println(p2);

    }
}
