package project.pages.forms;

import framework.parsers.objects.User;
import framework.webElements.Button;
import framework.webElements.Form;
import framework.webElements.Input;
import org.openqa.selenium.By;
import project.pages.BaseForm;

public class RegistrationForm extends BaseForm {
    private static Form registrationForm = new Form(By.xpath("//div[@class='modal-content']"), "Registration form");
    private Input firstName = new Input(By.xpath("//input[@id='firstName']"), "First Name input");
    private Input lastName = new Input(By.xpath("//input[@id='lastName']"), "Last Name input");
    private Input email = new Input(By.xpath("//input[@id='userEmail']"), "Email input");
    private Input age = new Input(By.xpath("//input[@id='age']"), "Age input");
    private Input salary = new Input(By.xpath("//input[@id='salary']"), "Salary input");
    private Input department = new Input(By.xpath("//input[@id='department']"), "Department input");
    private Button submit = new Button(By.xpath("//button[@id='submit']"), "Submit button");


    public RegistrationForm() {
        super(registrationForm);
    }

    public void waitForm() throws Exception {
        registrationForm.waitUntilElementIsVisible();
    }

    public void waitFormClosed() throws Exception {
        registrationForm.waitUntilElementIsNotVisible();
    }

    public void inputData(User user) throws Exception {
        firstName.sendText(user.getFirstName());
        lastName.sendText(user.getLastName());
        email.sendText(user.getEmail());
        age.sendText(user.getAge());
        salary.sendText(user.getSalary());
        department.sendText(user.getDepartment());
    }

    public void clickSubmit() throws Exception {
        submit.clickElement();
    }

    public boolean isClosed() throws Exception {
        return registrationForm.isClosed();
    }
}
