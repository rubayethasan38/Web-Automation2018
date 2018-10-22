package Page;
import LogIn.Account;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import reporting.TestLogger;
import utility.DataReader;
import java.io.IOException;
public class Keyword extends CommonAPI {
    Account account;
    @BeforeMethod
    public  void init() {
        account =PageFactory.initElements(webDriver, Account.class);}

    public void goToLoginpage()throws InterruptedException{
        account.clickAccount();
        sleepFor(3);
    }
    public void validSetLogin() throws InterruptedException {
        account.clickOnMyAccount();
    }

    public void selectAction(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "ClickLogin":
                goToLoginpage();
                sleepFor(1);
                break;
            case "Login":
                validSetLogin();
                sleepFor(1);
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    DataReader reader = new DataReader();
    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "/Users/RSH/Desktop/Web-Automation2018/BHPhoto/data/BHPhoto.xls" + fileName;
        String[] output = reader.colReader(path,2);
        return output;
    }
    public void loginByKeyword() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String[] keyword = getDataFromSignInKeyword("BHPhoto.xls");
        for (int i = 0; i < keyword.length; i++) {
            System.out.println(keyword[i]);
            selectAction(keyword[i]);

        }
    }
}
