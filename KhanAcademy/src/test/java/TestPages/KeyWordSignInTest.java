package TestPages;

import HomePackage.KeyWordSignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;


import org.testng.annotations.Test;

public class KeyWordSignInTest extends KeyWordSignIn {
    @BeforeMethod
    public void init() {KeyWordSignIn keyWordSignIn = PageFactory.initElements(webDriver, KeyWordSignIn.class);
    }
    @Test
    public void testLogIn () {login();}
}
