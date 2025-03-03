package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LoggingAspect {

    @Around("@annotation(annotations.ToLog)")
    public void loggingComments(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("\nThis is from the Logging Aspect (Before Call)");
        proceedingJoinPoint.proceed();
        System.out.println("This is from the Logging Aspect (After Call)");
    }
}
