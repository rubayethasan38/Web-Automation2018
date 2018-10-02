package signIn;

import Home.SignInHelper;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class singIn  extends SignInHelper {

    SignInHelper signInHelper;

    @BeforeMethod
    public void init (){
        signInHelper = PageFactory.initElements(webDriver, SignInHelper.class);
    }
    @Test(priority = 2, enabled = true)
    public void signInT(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn();
    }
    @Test(priority = 1, enabled = true)
    public void signInB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInButton();
    }
    @Test(priority = 4, enabled = true)
    public void forgotPasswordB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        forgotPasswordButton();
    }
    @Test(priority = 3, enabled = true)
    public void saveUsernameCheckBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        saveUserName();
    }
}
