package FeaturesTest;

import Home.HomeHelper;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import utility.DataReader;

import java.io.IOException;

public class Features extends CommonAPI {
    HomeHelper homeHelper;

    public void signInTest(){
       homeHelper.signIn();
    }
    public void clickSignIn() {
        homeHelper.clickOnSignIn();
    }
    public void selectAction(String featureName) throws InterruptedException {
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
        String[] keyword = getDataFromSignInKeyword("DataFile2.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}
