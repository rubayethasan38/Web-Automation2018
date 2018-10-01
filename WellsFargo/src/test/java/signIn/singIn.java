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
    @Test
    public void signInT(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn();
    }
    @Test
    public void signInB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInButton();
    }
    @Test
    public void forgotPasswordB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        forgotPasswordButton();
    }
    @Test
    public void saveUsernameCheckBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        saveUserName();
    }
}
