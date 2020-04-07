package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
       private List<Integer> population = new ArrayList<>();

        public School(int... population) {
            for (int groupClass : population) {
                this.population.add(groupClass);
            };
        }

    public List<Integer> getPopulation() {
        return population;
    }
    public int getSchoolPopulation() {
            int sum = 0;
            for (int student: population){
                sum += student;}
        return sum;
    }

    @Override
    public String toString() {
        return "School no of students =" + population +
                '}';
    }
}
