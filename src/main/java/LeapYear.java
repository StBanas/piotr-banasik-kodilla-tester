public class LeapYear {

    int year;
    public LeapYear(int year){
        this.year = year;
    }
    public boolean checkYear(){
        return (year % 4 == 0) && (year % 400 == 0 || year % 100 != 0);
    }
//    public boolean checkYear(){
//        boolean isLeapYear;
//
//        if ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)){
//            isLeapYear = true;
//        }
//        else{
//            isLeapYear = false;
//        }
//        return isLeapYear;
//        }


}
