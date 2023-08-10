import framework.browser.Browser;
import framework.utils.FilesUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.DownloadPage;
import project.pages.MainPage;
import project.pages.MenuPage;

public class TestCase7_Files extends BaseTest{
    private static final String PATH_TO_DOWNLOADS = "C:\\Users\\*****\\Downloads";
    private static final String PATH_TO_FILE = "C:\\Users\\*****\\Downloads\\sampleFile.jpeg";
    private static final String NAME_OF_FILE = "sampleFile.jpeg";
    @Test
    public void files() throws Exception {
        MainPage mainPage = new MainPage();
        Browser browser = new Browser();
        MenuPage menuPage = new MenuPage();
        DownloadPage downloadPage = new DownloadPage();

        browser.getURL();

        Assert.assertTrue(mainPage.isOpened(),"Main page is not opened");

        browser.scrollPage();
        mainPage.clickElementsButton();

        Assert.assertTrue(menuPage.isOpened(),"Menu page is not opened");

        browser.scrollPage();

        menuPage.clickUploadDownloadButton();

        Assert.assertTrue(downloadPage.isOpened(),"Upload Download form is not opened");

        downloadPage.clickDownloadButton();
        FilesUtil.waitUntilFileDownloaded(PATH_TO_DOWNLOADS);
        downloadPage.sendUploadFile(PATH_TO_FILE);

        Assert.assertTrue(downloadPage.isPathDisplayed(),"Path is not displayed");
        Assert.assertTrue(downloadPage.getPath().contains(NAME_OF_FILE),"Path doesn't contain file name");

        FilesUtil.deleteFile(PATH_TO_FILE);
    }
}
