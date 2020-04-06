package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp(2.20, 3.10, true));
        stamps.add(new Stamp(3.40, 4.13, true));
        stamps.add(new Stamp(2.80, 3.90, false));
        stamps.add(new Stamp(1.80, 2.70, false));

        System.out.println(stamps.size());
        for ( Stamp stamp :stamps){
            System.out.println( "   " + stamp);
        }

//        stamps.add(new Stamp(1.80, 2.70, true));      // Test na boolean'a
//        stamps.add(new Stamp(2.20, 3.10, false));     // Test na boolean'a
        stamps.add(new Stamp(3.4, 4.13, true));
        stamps.add(new Stamp(1.80, 2.70, false));

        System.out.println(stamps.size());
        for ( Stamp stamp :stamps){
            System.out.println( "   " + stamp);
        }
    }
}
