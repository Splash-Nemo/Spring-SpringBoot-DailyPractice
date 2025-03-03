package service;

import newAnnotations.ToAlter;
import newAnnotations.ToLog;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    @ToLog
    public void publishComment(Comment comment){
        System.out.println("\nCommentService (Actual Method)");
        System.out.println("Comment Text- "+ comment.getText());
    }

    @ToAlter
    public void alteringComment(Comment comment){
        System.out.println("Printing- "+comment.getText());
    }
}
