package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;


public class KeyWordSignIn extends CommonAPI {
    HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
    LoginPage loginPage =PageFactory.initElements(webDriver, LoginPage.class);

    public void goToLoginpage(){
    }
    public void validSetLogin(){
    }
    public void login(){
    }
    public void selectAction(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "ClickLogin":
                goToLoginpage();
                break;
            case "Login":
                validSetLogin();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    DataReader reader = new DataReader();
    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "../KhanAcademy/data/" + fileName;
        String[] output = reader.colReader(path, 2);
        return output;
    }
    public void loginByKeyword() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String[] keyword = getDataFromSignInKeyword("keyword.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}
