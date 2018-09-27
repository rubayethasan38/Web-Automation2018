package TestPage;

import Page.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends LogIn{
    @BeforeMethod
    public void setLogIn() {
        LogIn logIn = PageFactory.initElements(webDriver, LogIn.class);
}
    @Test
    public void login() {
        login1();
    }
}