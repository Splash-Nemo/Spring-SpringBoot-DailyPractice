package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityAspect {

    @Around("@annotation(annotations.ToLog)")
    public void secureComments(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("This is from the security aspect (Before Call)");
        proceedingJoinPoint.proceed();
        System.out.println("This is from the security aspect (After Call)");
    }
}
