import framework.browser.Browser;
import framework.parsers.TestingDataParser;
import framework.utils.Equals;
import framework.utils.Ints;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.MainPage;
import project.pages.MenuPage;
import project.pages.ProgressBarPage;
import project.pages.SliderPage;


public class TestCase5_Slider_Progress_bar extends BaseTest{
    private static final String PROGRESS_BAR_MAX_VALUE = "100";
    @Test
    public void widgets() throws Exception {
        MainPage mainPage = new MainPage();
        Browser browser = new Browser();
        MenuPage menuPage = new MenuPage();
        SliderPage sliderPage = new SliderPage();
        int random = Ints.getRandomValue();
        ProgressBarPage progressBarPage = new ProgressBarPage();
        String value = "";

        browser.getURL();

        Assert.assertTrue(mainPage.isOpened(),"Main page is not opened");

        browser.scrollPage();
        mainPage.clickWidgetsButton();

        Assert.assertTrue(menuPage.isOpened(),"Menu page is not opened");

        menuPage.clickSliderButton();

        Assert.assertTrue(sliderPage.isOpened(),"Slider form is not opened");

        sliderPage.setSliderValue(random);

        Assert.assertEquals(sliderPage.getSliderValue(), Ints.intToString(random), "Values are different");

        browser.scrollPage();
        sliderPage.clickProgressBarButton();

        Assert.assertTrue(progressBarPage.isOpened(),"Progress Bar form is not opened" );

        progressBarPage.clickStartStopButton();

        while(!value.equals(PROGRESS_BAR_MAX_VALUE) ){
           value =  progressBarPage.getAttributeValue();
            if (value.equals(Ints.intToString(TestingDataParser.getAge()))) {
                progressBarPage.clickStartStopButton();
                break;
            }
        }
        Assert.assertTrue(Equals.errorRate(progressBarPage.getAttributeValue(), TestingDataParser.getAge()), "Value outside the error rate of 2%");

    }
}
