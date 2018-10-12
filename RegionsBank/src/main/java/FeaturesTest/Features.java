package FeaturesTest;

import Home.HomeHelper;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

public class Features extends CommonAPI {
    HomeHelper homeHelper;

    public void signInTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.signIn();
    }
    public void clickSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.clickOnSignIn();
    }
    public void selectAction(String featureName) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        switch (featureName) {
            case "ClickOnSignIn":
                clickSignIn();
                break;
            case "SignIn":
                signInTest();
                break;
            default:
                throw new InvalidArgumentException("Invalid Choice");
        }
    }
    DataReader dtr = new DataReader();
    public String[] getDataFromSignInKeyword(String fileName) throws IOException {
        String path = "../RegionsBank/data/" + fileName;
        String[] output = dtr.colReader(path, 2);
        return output;
    }
    public void selectFeature() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String[] keyword = getDataFromSignInKeyword("Key.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}
