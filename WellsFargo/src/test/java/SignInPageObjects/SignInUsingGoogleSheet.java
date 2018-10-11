package SignInPageObjects;

import Home.GoogleSheetsPage;
import Home.HomeHelper;
import Home.SignInHelper;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;


public class SignInUsingGoogleSheet extends GoogleSheetsPage {
    GoogleSheetsPage googleSheetsPage;
    @BeforeMethod
    public void initialization(){
        googleSheetsPage = PageFactory.initElements(webDriver, GoogleSheetsPage.class);
    }
    @Test(priority = 1, enabled = true)
    public void testLogInByGoogleSheet()throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        googleSheetsPage.testLogInByInvalidIdPassUsingGoogleSheet();
    }
}
