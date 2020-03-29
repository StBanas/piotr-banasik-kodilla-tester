public class User {

    String name;
    int age;

    public User (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){

        User[] user = new User[5];

        String[] name  = {"Ala", "Ela", "Ola", "Ula", "C'la"};
        int[] age = {21, 23, 12, 31, 18};
        int i;

        for (i = 0; i<user.length; i++)
        {
            user[i] = new User(name[i], age[i]);
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
        for (int value : age) {
            sumaWieku += value;
        }
        return sumaWieku / age.length;
    }
}

