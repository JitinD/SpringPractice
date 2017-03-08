package org.personal.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    //@Around("@annotation(org.personal.aop.Loggable)")
    @Around("allGetterMethods()")
    public void basicLogging(ProceedingJoinPoint proceedingJoinPoint){

        Object returnedValue;

        try {
            System.out.println("Logger : Going to call the getter Method");
            returnedValue = proceedingJoinPoint.proceed();
            System.out.println("Logger : After calling the getter Method");
        }
        catch (Throwable throwable){
            System.out.println("Caught throwable");
        }
    }

    @Pointcut("execution(* get*())")
    public void allGetterMethods(){}
}
