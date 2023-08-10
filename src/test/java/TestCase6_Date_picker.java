import framework.browser.Browser;
import framework.utils.Dates;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.DatePickerPage;
import project.pages.MainPage;
import project.pages.MenuPage;


public class TestCase6_Date_picker extends BaseTest{
    @Test
    public void datePicker() throws Exception {
        MainPage mainPage = new MainPage();
        Browser browser = new Browser();
        MenuPage menuPage = new MenuPage();
        DatePickerPage datePickerPage = new DatePickerPage();

        browser.getURL();

        Assert.assertTrue(mainPage.isOpened(),"Main page is not opened");

        browser.scrollPage();
        mainPage.clickWidgetsButton();

        Assert.assertTrue(menuPage.isOpened(),"Menu page is not opened");

        menuPage.clickDatePickerButton();

        Assert.assertTrue(datePickerPage.isOpened(),"Date picker page is not opened");

        Assert.assertEquals(datePickerPage.getDateValue(), Dates.getCurrentDate(), "Dates is not the same");
        Assert.assertEquals(DatePickerPage.getDateAndTimeValue(), Dates.getCurrentDateAndTime(), "Dates and times is not the same");

        datePickerPage.clickDateAndTime();
        datePickerPage.clickYearPicker();
        datePickerPage.clickLeapYear();
        datePickerPage.clickMonthPicker();
        datePickerPage.clickFebruary();
        datePickerPage.clickLeapDate();

        Assert.assertEquals(DatePickerPage.getDateAndTimeValue(), Dates.getLeapDate(), "THe Date in the field is different from leap date");
    }
}
