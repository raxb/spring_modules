package learn.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Aspect
public class OnlineReview {

    @Pointcut("execution(** learn.spring.aop.Restaurant.feast(..))")
    public void feastAdvice() {
    }

    @Before("feastAdvice()")
    public void before() {
        System.out.println("Waiting for feast evaluation...");
    }

    @AfterReturning("feastAdvice()")
    public void after() {
        System.out.println("Fantabolous Feast...");
    }

    @AfterThrowing("feastAdvice()")
    public void afterError() {
        System.out.println("Throw up on the feast...");
    }

    @Around("execution(** *.around(int)) and bean(restaurant) and args(no_of_rounds)")
    public void orderRound(ProceedingJoinPoint pjp, int no_of_rounds) {
        try {
            System.out.println("Order 1-1-1...");
            System.out.println("Order 2-2-2...");
            pjp.proceed(new Object[]{no_of_rounds});
            System.out.println("Order 3-3-3...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
