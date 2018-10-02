package HomePageTest;

import Home.HomeHelper;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class HomePageFeatures extends HomeHelper {

    HomeHelper homeHelper;
    @BeforeMethod
    public void init(){
        homeHelper = PageFactory.initElements(webDriver, HomeHelper.class);
    }
    @Test(priority = 1, enabled = true)
    public void searchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setSearchBoxFunction();
    }
    @Test(priority = 2, enabled = true)
    public void usernameInputT(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        usernameInput();
    }
    @Test(priority = 3, enabled = true)
    public void enrollButtonT(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        enrollButtonF();
    }
    @Test(priority = 4, enabled = true)
    public void careersB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.careersButtonF();
    }
    @Test(priority = 5, enabled = true)
    public void userPasswordF(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        userPasswordInput();
    }
    @Test(priority = 6, enabled = true)
    public void costumerServiceF(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        costumerService();
    }
    @Test(priority = 7, enabled = true)
    public void moveSlideToRightB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.moveSlidesToRight();
    }
    @Test(priority = 8, enabled = true)
    public void moveSlideToLeftB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.moveSlideToLeft();
    }
}
