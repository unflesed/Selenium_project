package framework.webElements;

import org.openqa.selenium.By;

public class Header extends BaseElement{
    public Header(By locator, String name){
        super(locator, name);
        this.locator = locator;
    }
}
