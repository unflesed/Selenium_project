package project.pages;

import framework.webElements.Button;
import framework.webElements.Form;
import framework.webElements.ProgressBar;
import org.openqa.selenium.By;

public class ProgressBarPage extends BaseForm{
    private static Form progressBarForm = new Form(By.xpath("//div[@id='progressBarContainer']"), "Progress Bar form");
    private static Button startButton = new Button(By.xpath("//button[@id='startStopButton']"), "Start Stop button");
    private static ProgressBar progressBar = new ProgressBar(By.xpath("//div[contains(@class,'progress-bar')]"), "Progress Bar");
    private static final String ATTRIBUTE = "aria-valuenow";

    public ProgressBarPage(){
        super(progressBarForm);
    }

    public void clickStartStopButton() throws Exception {
        startButton.clickElement();
    }

    public String getAttributeValue() throws Exception {
        return progressBar.getElementAttributeValue(ATTRIBUTE);
    }
}
