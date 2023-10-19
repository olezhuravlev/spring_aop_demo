package org.example;

import org.example.config.Configuration;
import org.example.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Configuration.class);
        ctx.refresh();
        EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

        System.out.println(employeeService.getEmployee().getName());

        String name = employeeService.getEmployee().getName();

        employeeService.getEmployee().setName("New " + name);

        employeeService.getEmployee().throwException();

        ctx.close();
    }
}
