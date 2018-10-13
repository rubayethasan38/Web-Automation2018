package TestPages;

import HomePackage.SignUpPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SingUpPageTest extends SignUpPage {
    SignUpPage signUpPage;
    @BeforeMethod
    public void init(){  signUpPage = PageFactory.initElements(webDriver, SignUpPage.class);}

    @Test
    public void getTeacher(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signUpPage.clickTeacher();
    }
}
