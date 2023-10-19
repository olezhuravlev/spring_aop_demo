package org.example.config;

import org.example.aspect.EmployeeAfterAspect;
import org.example.aspect.EmployeeAnnotationAspect;
import org.example.aspect.EmployeeAroundAspect;
import org.example.aspect.EmployeeAspect;
import org.example.aspect.EmployeeAspectJoinPoint;
import org.example.aspect.EmployeeAspectPointcut;
import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@org.springframework.context.annotation.Configuration
@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Configuration {

    @Bean
    public Employee employee() {
        Employee bean = new Employee();
        bean.setName("Dummy Name");
        return bean;
    }

    @Bean
    public EmployeeService employeeService() {
        EmployeeService bean = new EmployeeService();
        bean.setEmployee(employee());
        return bean;
    }

    @Bean
    public EmployeeAspect employeeAspect() {
        EmployeeAspect bean = new EmployeeAspect();
        return bean;
    }

    @Bean
    public EmployeeAspectPointcut employeeAspectPointcut() {
        EmployeeAspectPointcut bean = new EmployeeAspectPointcut();
        return bean;
    }

    @Bean
    public EmployeeAspectJoinPoint employeeAspectJoinPoint() {
        EmployeeAspectJoinPoint bean = new EmployeeAspectJoinPoint();
        return bean;
    }

    @Bean
    public EmployeeAfterAspect employeeAfterAspect() {
        EmployeeAfterAspect bean = new EmployeeAfterAspect();
        return bean;
    }

    @Bean
    public EmployeeAroundAspect employeeAroundAspect() {
        EmployeeAroundAspect bean = new EmployeeAroundAspect();
        return bean;
    }

    @Bean
    public EmployeeAnnotationAspect employeeAnnotationAspect() {
        EmployeeAnnotationAspect bean = new EmployeeAnnotationAspect();
        return bean;
    }
}
