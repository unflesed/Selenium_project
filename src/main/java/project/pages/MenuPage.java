package project.pages;

import framework.webElements.Button;
import framework.webElements.DivWithText;
import org.openqa.selenium.By;

public class MenuPage extends BaseForm{
    private static Button alertsMenuButton = new Button(By.xpath("//span[text()='Alerts']"), "Alerts menu button");
    private static DivWithText text = new DivWithText(By.xpath("//div[contains(text(),'select an item')]"), "Select an item text");
    private static Button nestedFramesButton = new Button(By.xpath("//span[text()='Nested Frames']"), "Nested Frames menu button");
    private static Button webTablesButton = new Button(By.xpath("//span[text()='Web Tables']"), "Web Tables menu button");
    private static Button browserWindowsMenuButton = new Button(By.xpath("//span[text()='Browser Windows']"), "Browser Windows menu button");
    private static Button sliderButton = new Button(By.xpath("//span[text()='Slider']"), "Slider menu button");
    private static Button datePickerButton = new Button(By.xpath("//span[text()='Date Picker']"), "Date Picker menu button");
    private static Button uploadDownloadButton = new Button(By.xpath("//span[text()='Upload and Download']"), "Upload and Download menu button");

    public MenuPage() {
        super(text);
    }

    public void clickAlertsMenuButton() throws Exception {
        alertsMenuButton.clickElement();
    }

    public void clickButtonNestedFrames() throws Exception {
        nestedFramesButton.clickElement();
    }

    public void clickWebTablesButton() throws Exception {
        webTablesButton.clickElement();
    }

    public void clickBrowserWindowsMenuButton() throws Exception {
        browserWindowsMenuButton.clickElement();
    }

    public void clickSliderButton() throws Exception {
        sliderButton.clickElement();
    }

    public void clickDatePickerButton() throws Exception {
        datePickerButton.clickElement();
    }

    public void clickUploadDownloadButton() throws Exception {
        uploadDownloadButton.clickElement();
    }
}
