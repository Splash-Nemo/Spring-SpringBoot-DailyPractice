package services;

import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

public class CommentService {

    private final CommentNotificationProxy commentNotification;
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy){
        this.commentNotification= commentNotificationProxy;
        this.commentRepository= commentRepository;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotification.sendComment(comment);
    }
}
