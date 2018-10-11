package HomePackage;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googleAPIs.GoogleSheetReader.getSheetsService;

public class GoogleSheetPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"uid-dialog-1-children\"]/div/section[2]/div/div/div[2]/div[1]/label/form/input")
    public static WebElement account;
    @FindBy(xpath = "//*[@id=\"uid-dialog-0-children\"]/div/section[2]/div/div/div[2]/div[1]/label/form/input")
    public static WebElement password;
    @FindBy(xpath = "//*[@id=\"uid-dialog-0-children\"]/div/section[2]/div/div/div[2]/div[2]/label/form/input")
    public static WebElement signInErrorMesage;
    @FindBy(id="login-or-signup")public static WebElement logIn;
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
      click();
       sleepFor(2);
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(account, row.get(2).toString());
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
    public void click(){
        webDriver.findElement(By.xpath("//*[@id=\"login-or-signup\"]")).click();
    }


}
