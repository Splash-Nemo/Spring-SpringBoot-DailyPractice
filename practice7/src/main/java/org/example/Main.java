package org.example;

import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DbCommentRepository;
import services.Comment;
import services.CommentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var commentRepo= new DbCommentRepository();
        var commentProxy= new EmailCommentNotificationProxy();

        var comment= new Comment();
        comment.setText("for storing- repositories, for establishing communication- proxies, for use cases- services");

        comment.setAuthor("Aditya");

        new CommentService(commentRepo, commentProxy).publishComment(comment);
    }
}