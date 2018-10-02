package HomePageTest;

import Home.HomeHelper;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomeTest extends HomeHelper {

    HomeHelper homeHelper;
    @BeforeMethod
    public void init(){
        homeHelper = PageFactory.initElements(webDriver, HomeHelper.class);
    }
    @Test(priority = 2, enabled = true)
    public void locationsF(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        locations();
    }
    @Test(priority = 3, enabled = true)
    public void smallBussinessBankingF(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        smallBussinessBanking();
    }
    @Test(priority = 1, enabled = true)
    public void commercialFunctions(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        commercial();
    }
    @Test(priority = 4, enabled = true)
    public void seachBoxF(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox();
    }
    @Test(priority = 6, enabled = true)
    public void signInF(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn();
    }
    @Test(priority = 5, enabled = true)
    public void forgotPasswordF(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        forgotPassword();
    }
    @Test(priority = 7, enabled = true)
    public void openAccountF(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        openAnAccount();
    }
}
