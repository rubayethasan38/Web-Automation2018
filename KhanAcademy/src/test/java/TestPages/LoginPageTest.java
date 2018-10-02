package TestPages;

import HomePackage.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends LoginPage {
    @BeforeMethod
            public void LogInTo () {
    LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
}
 @Test
    public void selectAmount() { loginpage();
    }
}
