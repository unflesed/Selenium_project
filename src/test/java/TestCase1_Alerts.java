import framework.browser.Browser;
import framework.utils.Strings;
import framework.webElements.alerts.Alerts;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.AlertsPage;
import project.pages.MainPage;
import project.pages.MenuPage;

public class TestCase1_Alerts extends BaseTest{
    @Test
    public void alerts() throws Exception {
        MainPage main = new MainPage();
        Browser browser = new Browser();
        MenuPage menuPage = new MenuPage();
        AlertsPage alertsPage = new AlertsPage();
        Alerts alert = new Alerts();
        String text = Strings.randomString();

        browser.getURL();

        Assert.assertTrue(main.isOpened(),"Main page is not opened");

        browser.scrollPage();
        main.clickAlertsButton();

        Assert.assertTrue(menuPage.isOpened(),"Menu page is not opened");

        menuPage.clickAlertsMenuButton();

        Assert.assertTrue(alertsPage.isOpened(),"Alerts form is not visible");

        alertsPage.clickButtonToSeeAlert();

        Assert.assertEquals(alert.getAlertText(), "You clicked a button", "Text is not the same");

        alert.alertAccept();
        Assert.assertFalse(alert.alertIsPresented(), "Alert is not closed");

        alertsPage.clickButtonToSeeAlertWithWaiting();
        alert.waitAlert();

        Assert.assertEquals(alert.getAlertText(), "This alert appeared after 5 seconds", "Text is not the same");
        alert.alertAccept();

        Assert.assertFalse(alert.alertIsPresented(), "Alert is not closed");

        alertsPage.clickButtonConfirmBoxAlert();
        alert.waitAlert();

        Assert.assertEquals(alert.getAlertText(), "Do you confirm action?", "Text is not the same");

        alert.alertAccept();

        Assert.assertFalse(alert.alertIsPresented(), "Alert is not closed");
        Assert.assertEquals(alertsPage.getConfirmResultText(),  "You selected Ok", "Result text is not the same");

        alertsPage.clickButtonToSeePromptAlert();
        alert.waitAlert();

        Assert.assertEquals(alert.getAlertText(), "Please enter your name", "Text is not the same");

        alert.alertSendText(text);
        alert.alertAccept();

        Assert.assertFalse(alert.alertIsPresented(), "Alert is not closed");
        Assert.assertEquals(alertsPage.getResultPromptText(),String.format("You entered %s", text), "Text is not the same");
    }
}
