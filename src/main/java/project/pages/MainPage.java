package project.pages;

import framework.webElements.BaseElement;
import framework.webElements.Button;
import framework.webElements.Image;
import org.openqa.selenium.By;

public class MainPage extends BaseForm {
    private static Image mainImage = new Image(By.xpath("//img[@class='banner-image']"), "Banner");
    private static Button alertsButton = new Button(By.xpath("//div[@class='card-body']//h5[contains(text(),'Alerts')]"),"Alerts button");
    private static Button elementsButton = new Button(By.xpath("//div[@class='card-body']//h5[contains(text(),'Elements')]"), "Elements button");
    private static Button widgetsButton = new Button(By.xpath("//div[@class='card-body']//h5[contains(text(),'Widgets')]"), "Widgets button");
    public MainPage(){
        super(mainImage);
    }

    public void clickAlertsButton() throws Exception {
        alertsButton.clickElement();
    }

    public void clickElementsButton() throws Exception {
        elementsButton.clickElement();
    }

    public void clickWidgetsButton() throws Exception {
        widgetsButton.clickElement();
    }

    public void waitImage() throws Exception {
        mainImage.waitUntilElementIsVisible();
    }
}
