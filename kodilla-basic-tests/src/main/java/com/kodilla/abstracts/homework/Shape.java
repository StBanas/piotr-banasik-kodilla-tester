package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int wymiar1;
    private int wymiar2;

        public Shape(int wymiar1, int wymiar2){

            this.wymiar1 = wymiar1;
            this.wymiar2 = wymiar2;
            }

//    public int area(int wymiar1, int wymiar2){
//            return area(getWymiar1(),getWymiar2());
//    }
//
//    public int perimiter(int wymiar1, int wymiar2){
//            return perimiter(getWymiar1(),getWymiar2());
//    }

    public int getWymiar1() {
        return wymiar1;
    }

    public int getWymiar2() {
        return wymiar2;
    }

    public abstract int area();

    public abstract int perimiter();
}
