package HomePageTest;

import Home.HomeHelper;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class InterfacesTest extends HomeHelper {

    HomeHelper ObjOfHomeHelper;
    @BeforeMethod
    public void init(){
        ObjOfHomeHelper = PageFactory.initElements(webDriver, HomeHelper.class);
    }
    @Test
    public void careersT(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        careers();
    }
    @Test
    public void contactUsB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        contactUs();
    }
    @Test
    public void changeToSpanishTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfHomeHelper.changeToSpanish();
    }
    @Test
    public void recoverPasswordTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        recoverPassword();
    }
}
