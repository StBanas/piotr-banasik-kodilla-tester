package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
//        Teacher nullteacher = new Teacher("undefined");

        Application.getStudentsList()
                .stream()
                .map(Application::formatStudentData)
                .forEach(s -> System.out.println(s));
    }

    public static String formatStudentData(Student student) {
        String studentName = student.getStudentName();
//        Teacher teacher = student.getTeacher();
        Teacher teacher = Optional.ofNullable(student.getTeacher())
                .orElse(new Teacher("   undefined"));
        return student.getStudentName() + teacher.getName();
    }


    public static List<Student> getStudentsList() {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Jan z Kolna      ", new Teacher("   John Monaghan")));
        studentsList.add(new Student("Janko Muzykant   ", new Teacher("   Duncan Munro")));
        studentsList.add(new Student("John Bravo       ", null));
        studentsList.add(new Student("Butch Cassidy    ", new Teacher("   Sundance Kid")));
        studentsList.add(new Student("Janina Porazińska", new Teacher("   Frank Taylor")));
        studentsList.add(new Student("Leonardo da Vinci", null));

        return studentsList;
    }
}
