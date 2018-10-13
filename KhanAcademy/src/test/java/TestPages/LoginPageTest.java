package TestPages;

import HomePackage.LoginPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LoginPageTest extends LoginPage {
    LoginPage loginPage;
    @BeforeMethod
            public void LogInTo () { loginPage = PageFactory.initElements(webDriver, LoginPage.class);
}
    @Test
    public void selectSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        loginPage.loginpage();
    }
    @Test
    public void loginTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        loginPage.setLogin();
    }
    @Test
    public void validLoginTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        loginPage.validLoginpage();
    }
    @Test
    public void validLoginSign() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        loginPage.validSetLogin();
    }
}
