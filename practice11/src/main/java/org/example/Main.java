package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.Comment;
import service.CommentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        var comment= new Comment();
        comment.setText("THIS IS A DEMO TEXT..................");

        var commentService= context.getBean(CommentService.class);
        commentService.publishComments(comment);
    }
}