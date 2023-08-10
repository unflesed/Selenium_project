package framework.utils;

import java.security.SecureRandom;

public class Strings {

    private static final String SYMBOLS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int LENGTH_OF_RANDOM_STRING = 10;
    private static SecureRandom random = new SecureRandom();

    public static String randomString(){
        StringBuilder sb = new StringBuilder(LENGTH_OF_RANDOM_STRING);

        for(int i = 0; i < LENGTH_OF_RANDOM_STRING; i++)
            sb.append(SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));

        return sb.toString();
    }

    public static Double stringToDouble(String str){
        return Double.parseDouble(str);
    }
    public static int stringToInt(String str){
        return Integer.parseInt(str);
    }

}
