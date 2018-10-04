package TestPage;

import Page.AllCategories;
import Page.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends LogInPage {
    AllCategories objAllCategories;
    LogInPage objLoginPage;

    @BeforeMethod
    public void initializePageObjects() {
        objAllCategories = PageFactory.initElements(WebDriver, AllCategories.class);
        objLoginPage = PageFactory.initElements(WebDriver, LogInPage.class);
    }
    //T3HOM_LP_TC01 verify Email address box status
    @Test(enabled=true)
    public void testEmailBox() {
        objAllCategories.goToLoginPage();
        boolean actual = objLoginPage.checkEmailTextBoxEnable();
        Assert.assertEquals(actual,true);
        System.out.println("testEmailBox test passed");
    }
    //T3HOM_LP_TC02 verify Password box status
    @Test(enabled=true)
    public void testPasswordBox() {
        objAllCategories.goToLoginPage();
        boolean actual = objLoginPage.checkPasswordTextBoxEnable();
        Assert.assertEquals(actual,true);
        System.out.println("testPasswordBox test passed");
    }
    //T3HOM_LP_TC03 Verify SignIn button as with wrong credentials, Signin button is disabled
    @Test(enabled=true)
    public void testSignInButton() {
        objAllCategories.goToLoginPage();
        boolean actual = objLoginPage.checkSignInButton();
        Assert.assertEquals(actual,true);
        System.out.println("testClearBox test passed");
    }
    //T3HOM_LP_TC04 Invalid email id throw error message
    @Test(enabled=false)
    public void testInvalidEmail() {
        objAllCategories.goToLoginPage();
        String actualError = objLoginPage.invalidEmail();
        String expectedError = "Please provide your email address, formatted as you@domain.com.";
        Assert.assertTrue(actualError.contains(expectedError));
        System.out.println("testInvalidEmail test passed");
    }

    @Test(enabled=true)
    public void testInvalidPassword() {
        objAllCategories.goToLoginPage();
        String actualError = objLoginPage.invalidPassword();
        String expectedError = "Please provide your password.";
        Assert.assertTrue(actualError.contains(expectedError));
        System.out.println("testInvalidPassword test passed");
    }
    @Test(enabled=false)
    public void testMyAccount() throws InterruptedException {
        objAllCategories.goToLoginPage();
        String actual = objLoginPage.verifyMyAccount();
        String expected = "https://www.bestbuy.com/c/PH_MyAccount";     //"My Account Terms & Conditions";
        System.out.println(actual);
        //  Assert.assertTrue(actual.contains(expected));
        //  System.out.println("testMyAccount test passed");
    }
}
