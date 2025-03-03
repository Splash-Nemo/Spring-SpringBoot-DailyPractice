package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import service.Comment;

@Component
@Aspect
public class LoggingAspect {

    @Around("@annotation(newAnnotations.ToLog)")
    public void loggingAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("\nLogging Aspect (Before Call)");
        joinPoint.proceed();
        System.out.println(("Logging Aspect (After Call)"));
    }

    @Around("@annotation(newAnnotations.ToAlter)")
    public void alteringAspect(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("Altering Aspect Begins");
        Object[] args= joinPoint.getArgs();
        Comment comment= new Comment();
        comment.setText("Altered Comment");
        Object[] newArgs= {comment};
        joinPoint.proceed(newArgs);
        System.out.println("Altering Aspect Ends");
    }
}
