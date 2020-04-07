package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.Grades;
import com.kodilla.collections.adv.maps.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> setOfSchools = new HashMap<>();

        School stAlban = new School(23, 23, 24, 27, 30, 21);
        School stMartin = new School(20, 21, 25, 17, 19);
        School stPaul = new School(33, 31, 21);

        Principal sean = new Principal("St.Alban", "Sean", "Connery", stAlban.getSchoolPopulation());
        Principal stan = new Principal("St.Martin", "Stan", "Laurel", stMartin.getSchoolPopulation());
        Principal olivier = new Principal("St.Paul", "Olivier", "Hardy",stPaul.getSchoolPopulation() );

        setOfSchools.put(sean, stAlban);
        setOfSchools.put(stan, stMartin);
        setOfSchools.put(olivier, stPaul);

        for(Map.Entry<Principal, School> principalSchoolEntry: setOfSchools.entrySet()) {
            System.out.println(principalSchoolEntry.getKey().getPrincipalFirstName() + "  "+  principalSchoolEntry.getKey().getPrincipalLastName() +", school population  " +
                    principalSchoolEntry.getValue().getSchoolPopulation());
        }

    }
}
