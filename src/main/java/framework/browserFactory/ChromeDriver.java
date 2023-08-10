package framework.browserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriver implements IWebDriver{
    @Override
    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        return new org.openqa.selenium.chrome.ChromeDriver();
    }
}
