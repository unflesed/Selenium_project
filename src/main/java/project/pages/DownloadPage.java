package project.pages;

import framework.webElements.Button;
import framework.webElements.Input;
import framework.webElements.Paragraph;
import org.openqa.selenium.By;

public class DownloadPage extends BaseForm {
    private static Button downloadButton = new Button(By.xpath("//a[text()='Download']"), "Download button");
    private static Input fileUpload = new Input(By.xpath("//input[@id='uploadFile']"), "Upload input");
    private static Paragraph p = new Paragraph(By.xpath("//p[@id='uploadedFilePath']"), "Uploaded file path");

    public DownloadPage(){
        super(downloadButton);
    }

    public void clickDownloadButton() throws Exception {
        downloadButton.clickElement();
    }

    public void sendUploadFile(String path) throws Exception {
        fileUpload.sendText(path);
    }

    public boolean isPathDisplayed() throws Exception {
        return p.isDisplayed();
    }

    public String getPath() throws Exception {
        return p.getText();
    }
}
