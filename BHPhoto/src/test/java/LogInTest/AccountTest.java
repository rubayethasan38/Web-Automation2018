package LogInTest;
import LogIn.Account;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class AccountTest extends Account {
    @BeforeMethod
    public void LogInTo() {
        Account account = PageFactory.initElements(webDriver, Account.class);
    }
    @Test
    public void login() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    loginpage();
    }
    @Test
    public void setLogin() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    setLogIn();
    }
    @Test
    public void LogIn(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    LogIn();

    }
}
