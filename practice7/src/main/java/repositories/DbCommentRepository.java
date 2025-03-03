package repositories;

import services.Comment;

public class DbCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: "+comment.getText());
        System.out.println("By: "+comment.getAuthor());
    }
}
