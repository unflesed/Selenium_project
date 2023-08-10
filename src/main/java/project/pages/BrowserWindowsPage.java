package project.pages;

import framework.browser.Browser;
import framework.webElements.Button;
import framework.webElements.Form;
import org.openqa.selenium.By;

public class BrowserWindowsPage extends BaseForm{
    private static Button newTabButton = new Button(By.xpath("//button[@id='tabButton']"), "New tab button");
    private static Button elementsButton = new Button(By.xpath("//div[text()='Elements']"), "Elements button");
    private static Button linksButton = new Button(By.xpath("//span[text()='Links']"), "Links button");
    private static Form browserWindowsForm = new Form(By.xpath("//div[@id='browserWindows']"), "Browser Windows form");

    public BrowserWindowsPage() {
        super(browserWindowsForm);
    }

    public void clickNewTabButton() throws Exception {
        newTabButton.clickElement();
    }

    public void waitSecondTab() throws Exception {
        Browser.waitUntilTabIsOpened();
    }

    public void clickElementsButton() throws Exception {
        elementsButton.clickElement();
    }

    public void clickLinksButton() throws Exception {
        linksButton.clickElement();
    }

    public void waitLinksButton() throws Exception {
        linksButton.waitUntilElementIsClickable();
    }
}
