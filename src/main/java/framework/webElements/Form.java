package framework.webElements;

import org.openqa.selenium.By;

public class Form extends BaseElement{
    public Form(By locator, String name){
        super(locator, name);
        this.locator = locator;
    }
}
