package com.kodilla.stream.optional.homework;

import java.util.Objects;
import java.util.Optional;

public class Student {
    String name;
    Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getStudentName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(teacher, student.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teacher);
    }

    @Override
    public String toString() {
        return "Student - "
                + name +  ",      "  + teacher;
    }
}
