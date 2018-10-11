package TestPages;

import HomePackage.SignUpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SingUpPageTest extends SignUpPage {
    @BeforeMethod
    public void init(){ SignUpPage signUpPage = PageFactory.initElements(webDriver, SignUpPage.class);}

    @Test
    public void getTeacher(){clickTeacher();
    }
}
