package com.kodilla.inheritance.homework;

public abstract class OperatingSystem {
    private int editionYear;

        public OperatingSystem(int editionYear)
            {
                this.editionYear = editionYear;
            }

    /*
        Metoda " getEditionYear nie zwraca mi wartości - nie mogę tego rozwiązać !!!
         */
    public abstract int getEditionYear(int editionYear);

    public abstract void getEditionYear();
}