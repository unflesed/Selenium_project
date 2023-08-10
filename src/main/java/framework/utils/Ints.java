package framework.utils;

import java.util.Random;

public class Ints {
    private static final int UPPER_BOUND = 100;
     public static String intToString(int value){
         return String.valueOf(value);
     }

     public static int getRandomValue(){
         Random random = new Random();

         return random.nextInt(UPPER_BOUND);
     }
}
