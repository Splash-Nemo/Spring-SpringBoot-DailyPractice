package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.Comment;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment= new Comment();
        comment.setText("This is a text");

        CommentService commentService= context.getBean(CommentService.class);
        commentService.alteringComment(comment);
    }
}