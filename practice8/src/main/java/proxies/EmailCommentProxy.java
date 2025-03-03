package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import services.Comment;

@Component
@Qualifier("Email")
public class EmailCommentProxy implements CommentProxies{

    @Override
    public void commentProxy(Comment comment) {
        System.out.println("Emailed comment");
    }
}
