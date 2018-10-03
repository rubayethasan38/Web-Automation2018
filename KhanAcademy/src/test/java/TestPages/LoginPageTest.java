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
    public void selectAmount() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        loginpage();
    }
    @Test
    public void loginTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setLogin();}
}
