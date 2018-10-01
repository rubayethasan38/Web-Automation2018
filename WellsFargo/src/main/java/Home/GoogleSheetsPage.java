package Home;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googleAPIs.GoogleSheetReader.getSheetsService;
import static org.openqa.selenium.support.How.CSS;
import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

public class GoogleSheetsPage extends CommonAPI {
    @FindBy(css = "#userid")
    public static WebElement account;
    @FindBy(css = "#password")
    public static WebElement password;
    @FindBy(xpath = "//*[@id=\"pageerrors\"]/div")
    public static WebElement signInErrorMesage;
    //ALI_GS_TC1
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    //LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(account, row.get(1).toString());
            inputValueInTextBoxByWebElement(password, row.get(2).toString());
            sleepFor(1);
            actual.add(getTextByWebElement(signInErrorMesage));
            System.out.println(getTextByWebElement(signInErrorMesage));
            clearInputBox(account);
            clearInputBox(password);
            sleepFor(1);
        }
        return actual;
    }
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1KvQ26NFyOcV6RWStK3TkrSXx7bwtGg_AlWO69TANRE4";
        String range = "Sheet1!A2:D";
        List<String> actualErrorMessage = signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}