package TestPages;

import HomePackage.LoginPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LoginPageTest extends LoginPage {
    @BeforeMethod
            public void LogInTo () {
    LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
}
    @Test
    public void selectSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        loginpage();
    }
    @Test
    public void loginTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setLogin();
    }
    @Test
    public void validLoginTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        validLoginpage();}


    @Test
    public void validLoginSign() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        validSetLogin();
    }
}
