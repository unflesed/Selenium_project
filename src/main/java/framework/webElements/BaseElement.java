package framework.webElements;

import framework.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static framework.browser.Browser.waitInit;


public abstract class BaseElement {
    protected By locator;
    protected String name;

    public BaseElement() {
    }

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    protected WebElement findElement() throws Exception {
        return Driver.getDriver().findElement(locator);
    }

    public int findElementsSize() throws Exception {
        return Driver.getDriver().findElements(locator).size();
    }
    
    public boolean isDisplayed() throws Exception {
        if (findElementsSize() > 0) {
            return true;
        }
        return false;
    }

    public boolean isClosed() throws Exception {
        if (findElementsSize() == 0) {
            return true;
        }
        return false;
    }

    public String getText() throws Exception {
        return findElement().getText();
    }

    public void clickElement() throws Exception {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", findElement());
    }

    public void sendText(String text) throws Exception {
        findElement().sendKeys(text);
    }

    public String getElementAttributeValue(String attribute) throws Exception {
        return findElement().getAttribute(attribute);
    }

    public void waitUntilElementIsVisible() throws Exception {
        waitInit().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitUntilElementIsNotVisible() throws Exception {
        waitInit().until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(locator)));
    }

    public void waitUntilElementIsClickable() throws Exception {
        waitInit().until(ExpectedConditions.elementToBeClickable(locator));
    }
}
