package framework.utils;

import project.pages.DatePickerPage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

public class Dates {
    private static final int DAYS_IN_ORDINARY_YEAR = 365;
    private static final int INTERVAL_FOR_SEARCHING_LEAP_YEAR = 5;
    private static final String DATE_PATTERN = "MM/dd/yyyy";
    private static final String DATE_TIME_PATTERN = "MMMM dd, yyyy h:mm a";
    private static final String YEAR_PATTERN = "yyyy";
    private static final String LANGUAGE = "en";

    public static String getCurrentDate(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);

        return date.format(formatter);
    }

    public static String getCurrentDateAndTime(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_PATTERN, new Locale(LANGUAGE));

        return dateTime.format(formatter);
    }

    public static String getLeapDate() throws Exception {

        return DatePickerPage.getDateAndTimeValue().replace(getCurrentYear(), Objects.requireNonNull(getClosestLeapYear()));
    }

    public static String getClosestLeapYear(){
        Calendar calendar = Calendar.getInstance();
        int currentYear = Strings.stringToInt(getCurrentYear());
        for (int i = 0; i < INTERVAL_FOR_SEARCHING_LEAP_YEAR; i++) {
            calendar.set(Calendar.YEAR, currentYear + i);
            if (calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > DAYS_IN_ORDINARY_YEAR ) {

                return Ints.intToString(currentYear + i);
            }
        }

        return null;
    }

    public static String getCurrentYear(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(YEAR_PATTERN);

        return date.format(formatter);
    }
}
