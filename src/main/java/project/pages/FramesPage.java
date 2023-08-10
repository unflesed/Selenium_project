package project.pages;

import framework.webElements.Form;
import framework.webElements.Header;
import org.openqa.selenium.By;

public class FramesPage extends BaseForm {
    private static Form framesForm = new Form(By.xpath("//div[@id='framesWrapper']"), "Frames form");
    private static String iFrameIdTop = "frame1";
    private static String iFrameIdBottom = "frame2";
    private static Header headerFromTopFrame = new Header(By.xpath("//h1[@id='sampleHeading']"), "Header h1 from Top frame");
    private static Header headerFromBottomFrame = new Header(By.xpath("//h1[@id='sampleHeading']"), "Header h1 from Bottom frame");

    public FramesPage(){
        super(framesForm);
    }

    public String getTextTopFrame() throws Exception {
        return headerFromTopFrame.getText();
    }

    public String getTextBottomFrame() throws Exception {
        return headerFromBottomFrame.getText();
    }

    public String getTopIframeID(){
        return iFrameIdTop;
    }

    public String getBottomIframeID(){
        return iFrameIdBottom;
    }

    public void waitHeader() throws Exception {
        headerFromTopFrame.waitUntilElementIsVisible();
    }
}
