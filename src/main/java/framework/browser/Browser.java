package framework.browser;

import framework.driver.Driver;
import framework.parsers.ConfigParser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {
    private static final int EXPECTED_NUMBER_OF_WINDOWS = 2;
    private final String ORIGINAL_WINDOW = Driver.getDriver().getWindowHandle();

    public Browser() throws Exception {
    }

    public static WebDriver getDriver() throws Exception {
        return Driver.getDriver();
    }

    public void getURL() throws Exception {
        getDriver().get(ConfigParser.getUrlName());
    }

    public static void setBrowserConfig() throws Exception {
        getDriver().manage().window().maximize();
    }

    public void scrollPage() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
    }

    public void switchToIframeByID(String id) throws Exception {
        getDriver().switchTo().frame(getDriver().findElement(By.id(id)));
    }

    public void switchToIframeByWebElement(By locator) throws Exception {
        WebElement element = getDriver().findElement(locator);
        getDriver().switchTo().frame(element);
    }

    public void switchFromIframe() throws Exception {
        getDriver().switchTo().defaultContent();
    }

    public String getOriginalWindow() {
        return ORIGINAL_WINDOW;
    }

    public String getCurrentWindow() throws Exception {
        return getDriver().getWindowHandle();
    }

    public void switchToNewTab() throws Exception {
        for (String wh : getDriver().getWindowHandles()) {
            if(!ORIGINAL_WINDOW.contentEquals(wh)) {
                getDriver().switchTo().window(wh);
                break;
            }
        }
    }

    public void switchToOriginalTab() throws Exception {
        getDriver().switchTo().window(ORIGINAL_WINDOW);
    }

    public void closeTab() throws Exception {
        getDriver().close();
    }

    public static void waitUntilTabIsOpened() throws Exception {
        waitInit().until(ExpectedConditions.numberOfWindowsToBe(EXPECTED_NUMBER_OF_WINDOWS));
    }

    public static WebDriverWait waitInit() throws Exception {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigParser.getTimeout()));
    }
}
