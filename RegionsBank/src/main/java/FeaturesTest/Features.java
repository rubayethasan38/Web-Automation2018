package FeaturesTest;

import Home.HomeHelper;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

public class Features extends CommonAPI {
    HomeHelper homeHelper = PageFactory.initElements(webDriver,HomeHelper.class);
    ExcelSheet excelSheet = PageFactory.initElements(webDriver, ExcelSheet.class);

    public void signInTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.signIn();
    }
    public void clickSignIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.clickOnSignIn();
    }
    public void selectAction(String featureName) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        switch (featureName) {
            case "ClickSignIn":
                clickSignIn();
                break;
            case "SignInTest":
                signInTest();
                break;
            default:
                throw new InvalidArgumentException("Invalid Choice");
        }
    }
    public void selectFeature() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String[] keyword = excelSheet.getDataFromSignInKeyword("KeyWord.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}
