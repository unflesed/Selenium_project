package project.pages;

import framework.webElements.Button;
import framework.webElements.Form;
import framework.webElements.Input;
import framework.webElements.Slider;
import org.openqa.selenium.By;

public class SliderPage extends BaseForm{
    private static Button sliderButton = new Button(By.xpath("//span[text()='Slider']"), "Slider menu button");
    private static Button progressBarButton = new Button(By.xpath("//span[text()='Progress Bar']"), "Progress Bar button");
    private static Form sliderForm = new Form(By.xpath("//div[@id='sliderContainer']"), "Slider form");
    private static Slider slider = new Slider(By.xpath("//input[contains(@class,'range-slider')]"), "Slider");
    private static Input sliderValue = new Input(By.xpath("//input[@id='sliderValue']"), "Slider value");
    private static final String ATTRIBUTE = "value";

    public SliderPage(){
        super(sliderForm);
    }

    public void clickProgressBarButton() throws Exception {
        progressBarButton.clickElement();
    }

    public void setSliderValue(int value) throws Exception {
        slider.setSliderValue(value);
    }

    public String getSliderValue() throws Exception {
        return sliderValue.getElementAttributeValue(ATTRIBUTE);
    }
}
