package project.pages;

import framework.parsers.objects.User;
import framework.utils.Strings;
import framework.webElements.Button;
import framework.webElements.Form;
import framework.webElements.TableCell;
import org.openqa.selenium.By;

public class WebTablesPage extends  BaseForm{
    private static Button webTablesButton = new Button(By.xpath("//span[text()='Web Tables']"), "Web Tables menu button");
    private static Form webTablesForm = new Form(By.xpath("//div[@class='web-tables-wrapper']"), "Web Tables form");
    private static Button addButton = new Button(By.xpath("//button[@id='addNewRecordButton']"), "Add button on web Tables form");
    private static Button deleteButtons = new Button(By.xpath("//span[contains(@id,'delete')]"), "Quantity of delete buttons");
    private static Button deleteButton = new Button(By.xpath("(//span[contains(@id,'delete')])[last()]"), "Last delete button");
    private final String EMAIL_XPATH = "//div[text()='%s']";

    public WebTablesPage(){
        super(webTablesForm);
    }

    public void clickAddButton() throws Exception {
        addButton.clickElement();
    }

    public boolean checkDataAppearance(User user) throws Exception {
        TableCell tableCell = new TableCell(By.xpath(String.format(EMAIL_XPATH, user.getEmail())),"Table cell for checking email");
        return tableCell.isDisplayed();
    }

    public int deleteButtonsCount() throws Exception {
        return deleteButtons.findElementsSize();
    }

    public void deleteButtonClick() throws Exception {
        deleteButton.clickElement();
    }
}
