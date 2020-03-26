package com.kodilla.abstracts.homework;

public class Job_at_Work {
    public static void main(String[] args) {

        Manager manager = new Manager( 56000, "zarządzanie");
        Tester tester = new Tester(45000, "testowanie");
        Developer developer = new Developer( 56000, "programowanie");

        Person smith = new Person("John", tester, 34);
        Person taylor = new Person("Frank", manager, 67);
        Person munro = new Person("Duncan", developer, 46);

        System.out.println( "Tester John  ma " + smith.getAge() +" lata.");
        System.out.print("Manager ma na imię " +  taylor.getfirstName() + ".");
        System.out.println("Jego obowiązkiem jest " + manager.getResponsibilities() + ".");
        System.out.print("Developer ma " + munro.getAge() + "lat. " );
        System.out.println("Jego zarobki to: " + munro.job.getSalary()+ " US$.");
        System.out.println("Natomiast do  Johna Smith'a obowiązków należy " + smith.job.getResponsibilities()+ ".");
        /* A co, jeśli chciałbym, żeby "munro.getSalary()" dawało mi bezpośrednio wynik? */

    }
}
