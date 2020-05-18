package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldGenerateCurrentTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock timeNow = context.getBean(Clock.class);
        Clock timeLater = context.getBean(Clock.class);
        Assertions.assertNotEquals(timeNow, timeLater);

    }
    @Test
    public void shouldGenerateCurrentTime2() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock2 timeNow = context.getBean(Clock2.class);
        Clock2 timeLater = context.getBean(Clock2.class);
        Assertions.assertEquals(timeNow, timeLater);

    }
}
