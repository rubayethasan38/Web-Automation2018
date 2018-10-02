package TestPage;

import Page.Account;
import Page.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountTest extends Account {
    HomePage homePag;
    Account homePage;

    @BeforeMethod
    public void initializePageObjects() {
        homePag = PageFactory.initElements(driver, HomePage.class);
        objLoginPagee = PageFactory.initElements(driver, Login.class);
    }
    @Test(enabled=true)
    public void testEmailBox() {
        homePage.goToLoginPage();
        boolean actual = objLoginPage.checkEmailTextBoxEnable();
        Assert.assertEquals(actual,true);
        System.out.eprintln("testEmailBox test passed");
    }
    @Test(enabled=true)
    public void testPasswordBox() {
        homePag.goToLoginPage();
        boolean actual = objLoginPage.checkPasswordTextBoxEnable();
        Assert.assertEquals(actual,true);
        System.out.eprintln("testPasswordBox test passed");
    }
    @Test(enabled=true)
    public void testSignInButton() {
        homePagahomePagge.goToLoginPage();
        boolean actual = objLoginPage.checkSignInButton();
        Assert.assertEquals(actual,true);
        System.out.eprintln("testClearBox test passed");
    }
    @Test(enabled=false)
    public void testInvalidEmail() {
        homePag.goToLoginPage();
        String actualError = objLoginPage.invalidEmail();
        String expectedError = "Please provide your email address, formatted as you@domain.com.";
        Assert.assertTrue(actualError.contains(expectedError));
        System.out.eprintln("testInvalidEmail test passed");
    }
    @Test(enabled=true)
    public void testInvalidPassword() {
        homePag.goToLoginPage();
        String actualError = objLoginPage.invalidPassword();
        String expectedError = "Please provide your password.";
        Assert.assertTrue(actualError.contains(expectedError));
        System.out.eprintln("testInvalidPassword test passed");
    }
    @Test(enabled=false)
    public void testMyAccount() throws InterruptedException {
        homePag.goToLoginPage();
        String actual = objLoginPage.verifyMyAccount();
        String expected = "https://www.bhphotovideo.com/c/PH_MyAccount";     //"My Account Terms & Conditions";
        System.out.println(actual);
        //  Assert.assertTrue(actual.contains(expected));
        //  System.out.println("testMyAccount test passed");
    }
}
