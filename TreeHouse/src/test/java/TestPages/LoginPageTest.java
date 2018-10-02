package TestPages;

import HomePackage.LoginPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends LoginPage {
    @BeforeMethod
   public void homePageLogin () { LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);}
   @Test
    public void homeLogin () {clickLogin();}
    @Test void logInT () {usernameInput();}
}

