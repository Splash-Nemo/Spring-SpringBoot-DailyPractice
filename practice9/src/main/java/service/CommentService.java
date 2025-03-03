package service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Comment comment;
    private Logger logger= Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publishing Comment- "+comment.getComment());
        logger.info("By- "+ comment.getAuthor());
    }

    public void anotherComment(){
        logger.info("THIS ONE IS ANOTHER COMMENT");
    }
}
