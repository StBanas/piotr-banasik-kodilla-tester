public class User {

    String name;
    int age;

    public User (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){

        User[] user = new User[6]; // nie wiem po co mi tu [6] ale inaczej nie dziiała?

        String[] name  = {"Ala", "Ela", "Ola", "Ula", "C'la"};
        int[] age = {21, 23, 12, 31, 18};
        int i;

        for (i = 1; i<6; i++)
        {
            user[i] = new User(name[i-1], age[i-1]);
            System.out.println(  " Imię : " + user[i].name + " ,  lat  :  " + user[i].age );
        }
        System.out.println("Srednia wieku wynosi :   " + sredniaWieku(age) );

        for(i = 1; i <user.length ; i++)
            if (user[i].age < sredniaWieku(age)) {
                System.out.println(" Użytkownik o wieku poniżej średniej; " + user[i].name);
            }

    }
    public static int sredniaWieku(int[] age) {
        int sumaWieku = 0;
        for (int i=0; i < age.length; i++){
            sumaWieku += age[i];
        }
        int sredniaWieku = sumaWieku / age.length;

        return sredniaWieku;
    }




}

