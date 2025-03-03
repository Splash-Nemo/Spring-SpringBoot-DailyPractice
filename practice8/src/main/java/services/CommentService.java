package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import proxies.CommentProxies;
import repositories.CommentRepositories;


@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {

    private CommentProxies commentProxies;
    private CommentRepositories commentRepositories;

    public CommentService(CommentRepositories commentRepositories, @Qualifier("Notification") CommentProxies commentProxies){
        this.commentProxies= commentProxies;
        this.commentRepositories= commentRepositories;
    }

    public void service(Comment comment){
        commentRepositories.storeComment(comment);
        commentProxies.commentProxy(comment);
    }
}
