package KeywordDriven;

import Home.HomeHelper;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;

import java.io.IOException;

public class Features extends CommonAPI {
    HomeHelper ObjOfHomeHelper;

    public void signIn() throws InterruptedException {
        ObjOfHomeHelper.signIn();
    }

    public void clickSignIn() {
        ObjOfHomeHelper.clickOnSignIn();
    }
    public void selectAction(String feautureName) throws InterruptedException {
        switch (feautureName) {
            case "ClickOnSignIn":
                clickSignIn();
                break;
            case "SignIn":
                signIn();
                break;
                default:
                    throw new InvalidArgumentException("Invalid Choice");
        }
        }
    public void selectFeature() throws IOException, InterruptedException{

    }
}
