package project.pages;

import framework.webElements.Button;
import framework.webElements.Form;
import framework.webElements.FramesBody;
import framework.webElements.Paragraph;
import org.openqa.selenium.By;

public class NestedFramesPage extends BaseForm {
    private static Button framesButton = new Button(By.xpath("//span[text()='Frames']"), "Nested Frames menu button");
    private static Form nestedFramesForm = new Form(By.xpath("//div[@id='framesWrapper']"), "Nested Frames form");
    private static FramesBody bodyParentFrame = new FramesBody(By.xpath("//body[text()='Parent frame']"), "Body text Parent frame");
    private static Paragraph p = new Paragraph(By.xpath("//p[text()='Child Iframe']"), "Paragraph Child Frame");
    private static String iFrameParentId = "frame1";
    private static By iFrameChildLocator = By.xpath("//iframe[contains(@srcdoc,'Child')]");

    public NestedFramesPage(){
        super(nestedFramesForm);
    }

    public void clickButtonFrames() throws Exception {
        framesButton.clickElement();
    }

    public String getTextParentFrame() throws Exception {
        return bodyParentFrame.getText();
    }

    public String getTextChildFrame() throws Exception {
        return p.getText();
    }

    public String getIframeID(){
        return iFrameParentId;
    }

    public By getIFrameChildLocator() {
        return iFrameChildLocator;
    }

    public void waitNestedForm() throws Exception {
        nestedFramesForm.waitUntilElementIsVisible();
    }

}
