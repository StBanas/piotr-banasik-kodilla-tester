package com.kodilla.abstracts.homework;

public class Job_at_Work {
    public static void main(String[] args) {

        Job coding = new Job(6800, "writing codes, foults fixing") {
            @Override
            public int age() {
                return 0;
            }

            @Override
            public String firstName() {
                return null;
            }

            @Override
            public String job() {
                return null;
            }
        };
        System.out.println(coding.getSalary());
        System.out.println(coding.getResponsibilities());

        Job managing = new Job(12000, "Cost controling, eveluation of resources required, deploying works to be done.") {
            @Override
            public int age() {
                return 0;
            }

            @Override
            public String firstName() {
                return null;
            }

            @Override
            public String job() {
                return null;
            }
        };
        System.out.println(managing.getSalary());
        System.out.println(managing.getResponsibilities());

        Job testing = new Job(8000, "code testing, foults reporting") {
            @Override
            public int age() {
                return 0;
            }

            @Override
            public String firstName() {
                return null;
            }

            @Override
            public String job() {
                return null;
            }
        };
        System.out.println(testing.getSalary());
        System.out.println(testing.getResponsibilities());

    }
}
