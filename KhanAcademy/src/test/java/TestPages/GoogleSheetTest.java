package TestPages;

import HomePackage.GoogleSheetPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleSheetTest extends GoogleSheetPage {
    @BeforeMethod

    public void init() {GoogleSheetPage  googleSheetPage  = PageFactory.initElements(webDriver,GoogleSheetPage.class); }
    @Test
    public void loginByGoogleSheets() throws IOException, InterruptedException {
        testLogInByInvalidIdPassUsingGoogleSheet();
    }
}
