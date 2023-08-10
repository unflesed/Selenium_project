package project.pages;

import framework.browser.Browser;
import framework.webElements.Form;
import framework.webElements.Link;
import org.openqa.selenium.By;

public class LinksPage extends BaseForm{
    private static Form linksForm = new Form(By.xpath("//div[@id='linkWrapper']"), "Links form");
    private static Link homeLink = new Link(By.xpath("//a[@id='simpleLink']"), "Home Link");

    public LinksPage(){
        super(linksForm);
    }

    public void clickHomeLink() throws Exception {
        homeLink.clickElement();
    }

    public void waitSecondTab() throws Exception {
        Browser.waitUntilTabIsOpened();
    }
}
