package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static jdk.nashorn.internal.objects.Global.Infinity;

@SpringBootTest
public class RunnerTestSuite {

    @Test
    public void shouldReturnCorrectResult () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add (1.2, 2.6);
        Assertions.assertEquals(3.8, result);
    }
    @Test
    public void shouldReturnCorrectResultOfDivisionWhenDivisionByZero () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide (1.2, 0);
        Assertions.assertEquals(Infinity, result);
    }
    @Test
    public void shouldReturnCorrectResultOfDivision () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide (1.2, 1.2);
        Assertions.assertEquals(1, result);
    }
}
