import framework.browser.Browser;
import framework.parsers.TestingDataObjectParser;
import framework.parsers.objects.User;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import project.pages.MainPage;
import project.pages.MenuPage;
import project.pages.WebTablesPage;
import project.pages.forms.RegistrationForm;

public class TestCase3_Tables extends BaseTest{
    @Test(dataProvider = "dp")
    public void tables(User user) throws Exception {
        MainPage main = new MainPage();
        Browser browser = new Browser();
        MenuPage menuPage = new MenuPage();
        WebTablesPage webTablesPage = new WebTablesPage();
        RegistrationForm registrationForm = new RegistrationForm();
        int countWebElements;

        browser.getURL();

        Assert.assertTrue(main.isOpened(),"Main page is not opened");

        browser.scrollPage();
        main.clickElementsButton();

        Assert.assertTrue(menuPage.isOpened(),"Menu page is not opened");

        browser.scrollPage();
        menuPage.clickWebTablesButton();

        Assert.assertTrue(webTablesPage.isOpened(), "Web tables page is not opened");

        webTablesPage.clickAddButton();
        registrationForm.waitForm();

        Assert.assertTrue(registrationForm.isOpened(), "Registration form is not opened");

        registrationForm.inputData(user);
        registrationForm.clickSubmit();
        registrationForm.waitFormClosed();

        Assert.assertTrue(registrationForm.isClosed(), "Registration form is not closed");
        Assert.assertTrue(webTablesPage.checkDataAppearance(user),"Data did not appear in the table");

        countWebElements = webTablesPage.deleteButtonsCount();

        webTablesPage.deleteButtonClick();

        Assert.assertNotEquals(webTablesPage.deleteButtonsCount(), countWebElements, "Quantity of data did not change");
        Assert.assertFalse(webTablesPage.checkDataAppearance(user),"Data did not delete from the table");

    }

    @DataProvider(name = "dp")
    public Object[][] dp() throws Exception {
        User[] users = TestingDataObjectParser.getUsers();
        return new Object[][] { {users[0]}, { users[1] } };
    }

}
