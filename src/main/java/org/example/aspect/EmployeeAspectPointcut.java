package org.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointcut {

    @Before("getNamePointcut()")
    public void loggingAdvice() {
        System.out.println("Executing loggingAdvice on getName()");
    }

    @Before("getNamePointcut()")
    public void secondAdvice() {
        System.out.println("Executing secondAdvice on getName()");
    }

    @Pointcut("execution(* org.example.model.Employee.getName())")
    public void getNamePointcut() {
        System.out.println("getNamePointcut()"); // Not invoked!
    }

    @Before("allMethodsPointcut()")
    public void allServiceMethodsAdvice() {
        System.out.println("Before executing service method");
    }

    //Pointcut to execute on all the methods of classes in a package
    @Pointcut("within(org.example.service.*)")
    public void allMethodsPointcut() {
        System.out.println("allMethodsPointcut()"); // Not invoked!
    }
}
