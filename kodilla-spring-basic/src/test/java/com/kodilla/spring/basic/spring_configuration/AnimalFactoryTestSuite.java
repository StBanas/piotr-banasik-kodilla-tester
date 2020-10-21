package com.kodilla.spring.basic.spring_configuration;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
    public class AnimalFactoryTestSuite {

        @Test
        public void testDogCreated() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Dog dog = context.getBean(Dog.class);
            //When
            String voice = dog.getVoice();
            //Then
            Assertions.assertEquals("Bark bark", voice);
        }
    @Test
    public void testCatCreated() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Cat cat = context.getBean(Cat.class);
        //When
        String voice = cat.getVoice();
        //Then
        Assertions.assertEquals("Meow meow", voice);
    }
    @Test
    public void testDuckCreated() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Duck duck = context.getBean(Duck.class);
        //When
        String voice = duck.getVoice();
        //Then
        Assertions.assertEquals("Quack quack", voice);
    }
        @Test
        public void shouldCreateDogBeanAndFetchByBeanName() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Dog dog = (Dog) context.getBean("createDog");
            //When
            String voice = dog.getVoice();
            //Then
            Assertions.assertEquals("Bark bark", voice);
        }

        @Test
        public void shouldCreateRandomAnimal() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Animal animal = (Animal) context.getBean("randomAnimal");
            //When
            String voice = animal.getVoice();
            System.out.println(voice);
            //Then
            List<String> possibleVoices = Arrays.asList("Bark bark", "Meow meow", "Quack quack");
            Assertions.assertTrue(possibleVoices.contains(voice));
        }
}