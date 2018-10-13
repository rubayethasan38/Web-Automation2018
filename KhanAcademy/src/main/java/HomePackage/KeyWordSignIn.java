package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;


public class KeyWordSignIn extends CommonAPI {
    HomePage homePage;
    LoginPage loginPage;
    @BeforeMethod
    public  void init() {
    homePage = PageFactory.initElements(webDriver, HomePage.class);
    loginPage =PageFactory.initElements(webDriver, LoginPage.class);}

    public void goToLoginpage()throws InterruptedException{
        homePage.goToLoginpage();
        sleepFor(3);
    }
    public void validSetLogin() throws InterruptedException {
        loginPage.validSetLogin();
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
        String path = "/Users/saleemkhan/IdeaProjects/WebAutomation/KhanAcademy/data/" + fileName;
         String[] output = reader.colReader(path,2);
        return output;
    }
    public void loginByKeyword() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String[] keyword = getDataFromSignInKeyword("keyword.xls");
        for (int i = 0; i < keyword.length; i++) {
            System.out.println(keyword[i]);
            selectAction(keyword[i]);

        }
    }
}
