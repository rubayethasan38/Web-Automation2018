package KeyWordDriven;

import Home.HomeHelper;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import java.io.IOException;

public class Features extends CommonAPI {
    HomeHelper homeHelper;
    ByInputFromExls byInputFromExls;

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
    public void selectFeature() throws IOException, InterruptedException {
        String[] keyword = byInputFromExls.getDataFromSignInKeyword("DataFile2.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}
