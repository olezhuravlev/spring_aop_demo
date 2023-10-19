package org.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

    @Before("@annotation(org.example.aspect.Loggable)")
    public void myAdvice() {
        System.out.println("Executing myAdvice!!");
    }
}
