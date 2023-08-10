import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.FramesPage;
import project.pages.MainPage;
import project.pages.MenuPage;
import project.pages.NestedFramesPage;

public class TestCase2_Iframe extends BaseTest{
    @Test
    public void iFrame() throws Exception {
        MainPage main = new MainPage();
        Browser browser = new Browser();
        MenuPage menuPage = new MenuPage();
        NestedFramesPage nestedFramesPage = new NestedFramesPage();
        FramesPage framesPage = new FramesPage();
        String temp = "";

        browser.getURL();

        Assert.assertTrue(main.isOpened(),"Main page is not opened");

        browser.scrollPage();
        main.clickAlertsButton();

        Assert.assertTrue(menuPage.isOpened(),"Menu page is not opened");

        browser.scrollPage();
        menuPage.clickButtonNestedFrames();
        nestedFramesPage.waitNestedForm();

        Assert.assertTrue(nestedFramesPage.isOpened(), "Nested Frames form is not visible");

        browser.switchToIframeByID(nestedFramesPage.getIframeID());

        Assert.assertEquals(nestedFramesPage.getTextParentFrame(), "Parent frame", "Text is not the same");

        browser.switchToIframeByWebElement(nestedFramesPage.getIFrameChildLocator());

        Assert.assertEquals(nestedFramesPage.getTextChildFrame(), "Child Iframe", "Text is not the same");

        browser.switchFromIframe();
        browser.scrollPage();
        nestedFramesPage.clickButtonFrames();

        Assert.assertTrue(framesPage.isOpened(), "Frames form is not visible");

        browser.switchToIframeByID(framesPage.getTopIframeID());
        framesPage.waitHeader();

        temp = framesPage.getTextTopFrame();

        browser.switchFromIframe();
        browser.switchToIframeByID(framesPage.getBottomIframeID());

        Assert.assertEquals(temp, framesPage.getTextBottomFrame(),"The text is not match");
    }
}
