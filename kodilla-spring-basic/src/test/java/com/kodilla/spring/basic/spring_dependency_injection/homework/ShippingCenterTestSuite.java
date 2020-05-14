package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldGetDelivery() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean deliverPackage = bean.deliverPackage("7 The Pines, Woodford", 18.2);
        Assertions.assertTrue(deliverPackage);
    }

    @Test
    public void shouldNotGetDeliveryAsPackageToHeavy() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean deliverPackage = bean.deliverPackage("7 The Pines, Woodford", 48.2);
        Assertions.assertFalse(deliverPackage);
    }

    @Test
    public void shouldGetPositiveNotification() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.success("7 The Pines, Woodford");
        Assertions.assertNotNull(address);
    }

    @Test
    public void shouldGetNegativeNotification() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.fail("7 The Pines, Woodford");
        Assertions.assertNotNull(address);
    }
}
