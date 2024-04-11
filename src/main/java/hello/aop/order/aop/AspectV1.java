package hello.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class AspectV1 {

    @Around("execution(* hello.aop.order..*(..))") //pointcut, hello.aop.order 패키지와 하위 패키지
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable{ //advice
        log.info("[log] {}", joinPoint.getSignature());
        return joinPoint.proceed();
    }

}
