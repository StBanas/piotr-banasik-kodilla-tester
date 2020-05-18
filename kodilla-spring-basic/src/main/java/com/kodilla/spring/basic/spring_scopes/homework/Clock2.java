package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("singleton")
public class Clock2 {

    public Clock2() {
        LocalTime timeNow2 = LocalTime.now();
    }
}
