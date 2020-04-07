package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {

    private String schoolName;
    private String principalFirstName;
    private String principalLastName;
    private int numberOfStudents;


    public Principal(String schoolName, String principalFirstName, String principalLastName, int numberOfStudents) {
        this.schoolName = schoolName;
        this.principalFirstName = principalFirstName;
        this.principalLastName = principalLastName;
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return numberOfStudents == principal.numberOfStudents &&
                schoolName.equals(principal.schoolName) &&
                principalFirstName.equals(principal.principalFirstName) &&
                principalLastName.equals(principal.principalLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, principalFirstName, principalLastName, numberOfStudents);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "schoolName='" + schoolName + '\'' +
                ", principalFirstName='" + principalFirstName + '\'' +
                ", principalLastName='" + principalLastName + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getPrincipalFirstName() {
        return principalFirstName;
    }

    public String getPrincipalLastName() {
        return principalLastName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
