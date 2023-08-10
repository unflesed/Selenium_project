import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.*;


public class TestCase4_Handles extends BaseTest{
    @Test
    public void handles() throws Exception {
        MainPage mainPage = new MainPage();
        Browser browser = new Browser();
        MenuPage menuPage = new MenuPage();
        BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage();
        SampleTabPage sampleTabPage = new SampleTabPage();
        LinksPage linksPage = new LinksPage();

        browser.getURL();

        Assert.assertTrue(mainPage.isOpened(),"Main page is not opened");

        browser.scrollPage();
        mainPage.clickAlertsButton();

        Assert.assertTrue(menuPage.isOpened(),"Menu page is not opened");

        menuPage.clickBrowserWindowsMenuButton();

        Assert.assertTrue(browserWindowsPage.isOpened(),"Browser Windows form is not opened");

        browserWindowsPage.clickNewTabButton();
        browserWindowsPage.waitSecondTab();
        browser.switchToNewTab();
        sampleTabPage.waitHeader();

        Assert.assertTrue(sampleTabPage.isOpened(),"Tab sample page is not opened");

        browser.closeTab();
        browser.switchToOriginalTab();

        Assert.assertTrue(browserWindowsPage.isOpened(),"Browser Windows form is not opened");

        browserWindowsPage.clickElementsButton();
        browserWindowsPage.waitLinksButton();
        browser.scrollPage();
        browserWindowsPage.clickLinksButton();

        Assert.assertTrue(linksPage.isOpened(),"Links form is not opened");

        linksPage.clickHomeLink();
        linksPage.waitSecondTab();
        browser.switchToNewTab();
        mainPage.waitImage();

        Assert.assertNotEquals(browser.getCurrentWindow(), browser.getOriginalWindow(), "Tabs id is the same");
        Assert.assertTrue(mainPage.isOpened(),"Main page is not opened");

        browser.switchToOriginalTab();

        Assert.assertTrue(linksPage.isOpened(),"Links form is not opened");
    }
}
