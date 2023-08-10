package project.pages;

import framework.webElements.Button;
import framework.webElements.Form;
import framework.webElements.Label;
import org.openqa.selenium.By;

public class AlertsPage extends BaseForm{
    private static Button clickButtonToSeeAlert = new Button(By.xpath("//button[@id='alertButton']"), "Button to see alert");
    private static Button clickButtonToSeeAlertWithWaiting = new Button(By.xpath("//button[@id='timerAlertButton']"), "Button to see alert with waiting");
    private static Button clickBtnToSeePromptAlert = new Button(By.xpath("//button[@id='promtButton']"), "Button to see prompt alert");
    private static Button clickConfirmButton = new Button(By.xpath("//button[@id='confirmButton']"), "Button of alert with confirmation");
    private static Form alertsForm = new Form(By.xpath("//div[@id='javascriptAlertsWrapper']"), "Alerts form");
    private static Label resultTextConfirm = new Label(By.xpath("//span[@id='confirmResult']"), "Result after clicking confirmation");
    private static Label resultTextPrompt = new Label(By.xpath("//span[@id='promptResult']"), "Result after sending random text");

    public AlertsPage(){
        super(alertsForm);
    }

    public void clickButtonToSeeAlert() throws Exception {
        clickButtonToSeeAlert.clickElement();
    }

    public void clickButtonToSeeAlertWithWaiting() throws Exception {
        clickButtonToSeeAlertWithWaiting.clickElement();
    }

    public void clickButtonToSeePromptAlert() throws Exception {
        clickBtnToSeePromptAlert.clickElement();
    }

    public void clickButtonConfirmBoxAlert() throws Exception {
        clickConfirmButton.clickElement();
    }

    public String getConfirmResultText() throws Exception {
        return resultTextConfirm.getText();
    }

    public String getResultPromptText() throws Exception {
        return resultTextPrompt.getText();
    }
}
