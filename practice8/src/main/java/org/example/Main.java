package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.Comment;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        var comment1= new Comment();

        comment1.setAuthor("Aditya");
        comment1.setText("Trial Text");

        CommentService commentService1= context.getBean(CommentService.class);
        commentService1.service(comment1);

        var comment2= new Comment();

        comment2.setText("ABCD");
        comment2.setAuthor("RANDOM");

        CommentService commentService2= context.getBean(CommentService.class);
        commentService2.service(comment2);;

        System.out.println(commentService1==commentService2);
    }
}