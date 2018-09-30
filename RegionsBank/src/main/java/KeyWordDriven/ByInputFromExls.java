package KeyWordDriven;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.DataReader;
import java.io.IOException;
import static org.openqa.selenium.support.How.CSS;
import static org.openqa.selenium.support.How.XPATH;

public class ByInputFromExls extends CommonAPI {
    @FindBy(how = XPATH, using = "//*[@id=\"OnlineID\"]")
    public static WebElement account;
    @FindBy(how = CSS, using = "#Password")
    public static WebElement password;
    @FindBy(className = "alert-message")
    public static WebElement signInErrorMesage;

    DataReader dtr = new DataReader();
    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "../RegionsBank/data" + fileName;
        String[] output = dtr.colReader(path, 2); //col 2 = email
        return output;
    }
}
