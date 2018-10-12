package PageTest;

import Page.LogIn;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class LogInTest extends LogIn {
    @BeforeMethod
    public void initialization() { LogIn account = PageFactory.initElements(webDriver, LogIn.class);
    }
    @Test
    public void Account() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setAccount();
    }
    @Test
    public void SignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setSignIn();
    }
    @Test
    public void EmailAddress(){ TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        enterUserName();
    }
    @Test
    public void Password(){ TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        enterPassword();
    }
}
