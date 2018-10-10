package Page;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Page.HomePage.searchBox;
import static googleAPIs.GoogleSheetReader.getSheetsService;

public class GoogleSheetReader extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/nav[2]/ul/li[1]")
    public static WebElement Account;
    @FindBy(xpath = "//*[@id=\"account-menu-app\"]/div/div[2]/div/div/a")
    public static WebElement SignIn;
    @FindBy(xpath = "//*[@id=\"fld-e\"]")
    public static WebElement EmailAddress;
    @FindBy(xpath = "//*[@id=\"fld-p1\"]")
    public static WebElement Password;

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
    //T3HOM_GS_TC01 Search using Googlesheet data
    public List<String> searchProduct(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(searchBox, row.get(1).toString());
            sleepFor(2);
            actual.add(webDriver.getTitle());
            System.out.println(actual.add(webDriver.getTitle()));
            clearInputBox(searchBox);
            sleepFor(1);
        }
        return actual;
    }
}
