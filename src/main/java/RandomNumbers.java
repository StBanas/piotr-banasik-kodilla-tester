import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        int result;
        result = getCountOfRandomNumber(5000);
        System.out.println(" Ilość losowań =  " + result);

    }

    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int tempMax = 0;
        int tempMin = 30;
        while (sum < max) {
            int temp = random.nextInt(31);
            if (temp > tempMax) {tempMax = temp;}
            if (temp < tempMin) {tempMin = temp;}

//            System.out.println(tempMax + " "+ temp + " "+ sum + " " + tempMin );
            sum = sum + temp;
            result++;


            }
        System.out.println(" Najmniejsza wylosowana wartość = " + tempMin);
        System.out.println(" Największajsza wylosowana wartość = " + tempMax);
        return result;
        }


}

