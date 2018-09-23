package signIn;

import Home.SignInHelper;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class singIn  extends SignInHelper {

    SignInHelper ObjOfSignInHelper;

    @BeforeMethod
    public void init (){
        ObjOfSignInHelper = PageFactory.initElements(webDriver, SignInHelper.class);
    }
    @Test
    public void signInT(){
        signIn();
    }
    @Test
    public void signInB(){
        signInButton();
    }
    @Test
    public void forgotPasswordB(){
        forgotPasswordButton();
    }
    @Test
    public void saveUsernameCheckBox(){
        saveUserName();
    }
}
