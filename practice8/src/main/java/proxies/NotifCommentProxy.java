package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import services.Comment;

@Component
@Qualifier("Notification")
public class NotifCommentProxy implements CommentProxies{

    @Override
    public void commentProxy(Comment comment) {
        System.out.println("Notification sent");
    }
}
