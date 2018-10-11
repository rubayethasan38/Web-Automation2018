package TestPages;

import HomePackage.GoogleSheetPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class GoogleSheetTest extends GoogleSheetPage {


    GoogleSheetPage  googleSheetPage  = PageFactory.initElements(webDriver,GoogleSheetPage.class);
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1DorFJB1q0bRrnM9HSBsACdz3VN8GmrvkujZdCUnTX0w";
        String range = "Sheet1!B2:C";
        List<String> actualErrorMessage = googleSheetPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
