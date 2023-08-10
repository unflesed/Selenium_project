package project.pages;

import framework.webElements.Header;
import org.openqa.selenium.By;

public class SampleTabPage extends BaseForm{
    private static Header newTabHeader = new Header(By.xpath("//h1[contains(text(),'sample page')]"), "Sample page");

    public SampleTabPage(){
        super(newTabHeader);
    }

    public void waitHeader() throws Exception {
        newTabHeader.waitUntilElementIsVisible();
    }
}
