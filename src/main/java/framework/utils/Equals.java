package framework.utils;

public class Equals {
    private static final int ERROR_RATE = 2;
    public static boolean errorRate(String value, int age){
        int valueToInt = Strings.stringToInt(value);
        if (age <= valueToInt + ERROR_RATE && age >= valueToInt - ERROR_RATE) {

            return true;
        }

        return false;
    }
}
