package project.pages;

import framework.utils.Dates;
import framework.utils.Strings;
import framework.webElements.Button;
import framework.webElements.Form;
import framework.webElements.Input;
import org.openqa.selenium.By;

public class DatePickerPage extends BaseForm{
    private static Button yearPickerButton = new Button(By.xpath("//div[contains(@class,'react-datepicker__year-read')]"), "Year picker menu button");
    private static Button monthPickerButton = new Button(By.xpath("//div[contains(@class,'react-datepicker__month-read')]"), "Month picker menu button");
    private static Button februaryPickerButton = new Button(By.xpath("//div[text()='February']"), "February picker menu button");
    private static Button leapDatePickerButton = new Button(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--029']"), "29 picker menu button");
    private static Form datePickerForm = new Form(By.xpath("//div[@id='datePickerContainer']"), "Date Picker form");
    private static Input dateValue = new Input(By.xpath("//input[@id='datePickerMonthYearInput']"), "Date value");
    private static Input dateAndTimeValue = new Input(By.xpath("//input[@id='dateAndTimePickerInput']"), "Date and Time value");
    private static final String  ATTRIBUTE_SELECTED_DATE = "value";
    private static final String  ATTRIBUTE_DATE_AND_TIME = "value";
    private String yearXPATH = "//div[text()='%s']";

    public DatePickerPage(){
        super(datePickerForm);
    }

    public String getDateValue() throws Exception {
        return dateValue.getElementAttributeValue(ATTRIBUTE_SELECTED_DATE);
    }

    public static String getDateAndTimeValue() throws Exception {
        return dateAndTimeValue.getElementAttributeValue(ATTRIBUTE_DATE_AND_TIME);
    }

    public void clickDateAndTime() throws Exception {
        dateAndTimeValue.clickElement();
    }

    public void clickYearPicker() throws Exception {
        yearPickerButton.clickElement();
    }

    public void clickLeapYear() throws Exception {
        Button yearButton = new Button(By.xpath(String.format(yearXPATH, Dates.getClosestLeapYear()))
                , "Closest leap year button");
        yearButton.clickElement();
    }

    public void clickMonthPicker() throws Exception {
        monthPickerButton.clickElement();
    }

    public void clickFebruary() throws Exception {
        februaryPickerButton.clickElement();
    }

    public void clickLeapDate() throws Exception {
        leapDatePickerButton.clickElement();
    }
}
