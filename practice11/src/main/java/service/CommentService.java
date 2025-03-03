package service;

import annotations.ToLog;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    @ToLog
    public void publishComments(Comment comment){
        System.out.println("COMMENT TEXT FROM THE OG- "+comment.getText());
    }
}
