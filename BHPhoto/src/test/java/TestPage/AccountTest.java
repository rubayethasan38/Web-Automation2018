package TestPage;

import Page.Account;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class AccountTest extends Account {
    @BeforeMethod
    public void LogInTo () {
        Account account = PageFactory.initElements(webDriver, Account.class);
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

    @Test
    public void firstTest(){ TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnMyAccount();
}
}
