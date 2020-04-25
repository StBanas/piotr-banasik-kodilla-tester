package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ForumStats {
    
    public static void main(String[] args) {
        double avgOverForty = UsersRepository.getUsersList()
                .stream()
                .filter(u -> (u.getAge() >=40))
                .map(u -> u.getNumberOfPosts())
                .mapToInt(u -> u)
                .average()
                .getAsDouble();

        System.out.println(avgOverForty);

        double avgBeloveForty = UsersRepository.getUsersList()
                .stream()
                .filter(u -> (u.getAge() < 40))
                .map(u -> u.getNumberOfPosts())
                .mapToInt(u -> u)
                .average()
                .getAsDouble();

        System.out.println(avgBeloveForty);

    }

}
