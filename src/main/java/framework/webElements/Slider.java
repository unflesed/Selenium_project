package framework.webElements;

import framework.driver.Driver;
import framework.utils.Strings;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Slider extends BaseElement{
    public Slider(By locator, String name) {
        super(locator, name);
    }

    public void setSliderValue(int value) throws Exception {
        Double min = Strings.stringToDouble(findElement().getAttribute("min"));
        Double max = Strings.stringToDouble(findElement().getAttribute("max"));
        int width = findElement().getSize().width;
        int height = findElement().getSize().height;
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(findElement(),(int)(-50 * width / (max - min)),height / 2 - 1);
        action.clickAndHold();
        action.build().perform();
        for (int i = 0; i < value; i++) {
            pushRightArrow();
        }
    }

    public void pushRightArrow() throws Exception {
        findElement().sendKeys(Keys.ARROW_RIGHT);
    }
}
