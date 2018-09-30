package SignInPageObjects;

import Home.GoogleSheetsPage;
import Home.HomeHelper;
import Home.SignInHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

public class TestGoogleSheetsPage extends GoogleSheetsPage {
    HomeHelper objOfHomeHelper;
    SignInHelper objOfSignInHelper;
    GoogleSheetsPage objGoogleSheetsPage;
    @BeforeMethod
    public void initialization(){
        objOfHomeHelper = PageFactory.initElements(webDriver, HomeHelper.class);
        objOfSignInHelper = PageFactory.initElements(webDriver, SignInHelper.class);
       objGoogleSheetsPage = PageFactory.initElements(webDriver, GoogleSheetsPage.class);
    }
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1KvQ26NFyOcV6RWStK3TkrSXx7bwtGg_AlWO69TANRE4";
        String range = "Sheet1!A2:D";
        List<String> actualErrorMessage = objGoogleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = objGoogleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
