package TestPages;

import HomePackage.KeyWordSignIn;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;


import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class KeyWordSignInTest extends KeyWordSignIn {
    KeyWordSignIn objKeyWordSignIn;
    @BeforeMethod
    public void init() { objKeyWordSignIn = PageFactory.initElements(webDriver, KeyWordSignIn.class);
    }
    @Test
    public void testLogIn () throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objKeyWordSignIn.loginByKeyword();
    }
}
