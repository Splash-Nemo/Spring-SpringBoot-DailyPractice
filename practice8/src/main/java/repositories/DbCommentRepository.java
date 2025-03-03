package repositories;

import org.springframework.stereotype.Component;
import services.Comment;

@Component
public class DbCommentRepository implements CommentRepositories{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment- "+comment.getText());
        System.out.println("By: "+comment.getAuthor());
    }
}
