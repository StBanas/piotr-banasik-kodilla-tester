package com.kodilla.stream.optional.homework;

import java.util.Optional;


public class Teacher {
    String name;
    public Teacher(String name) {
        this.name= name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  " Teacher  - " +
                 name  ;
    }
}
