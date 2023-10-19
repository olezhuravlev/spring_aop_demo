package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {

    // Advice.
    @After("args(name)")
    public void logStringArguments(String name) {
        System.out.println("Running After Advice. String argument passed=" + name);
    }

    // Advice.
    @AfterThrowing("within(org.example.model.Employee)")
    public void logExceptions(JoinPoint joinPoint) {
        System.out.println("Exception thrown in Employee Method=" + joinPoint.toString());
    }

    // Advice.
    @AfterReturning(pointcut = "execution(* getName())", returning = "returnString")
    public void getNameReturningAdvice(String returnString) {
        System.out.println("getNameReturningAdvice executed. Returned String=" + returnString);
    }
}
