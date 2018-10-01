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
    @Test
    public void searchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setSearchBoxFunction();
    }
    @Test
    public void usernameInputT(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        usernameInput();
    }
    @Test
    public void enrollButtonT(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        enrollButtonF();
    }
    @Test
    public void careersB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.careersButtonF();
    }
    @Test
    public void userPasswordF(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        userPasswordInput();
    }
    @Test
    public void costumerServiceF(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        costumerService();
    }
    @Test
    public void moveSlideToRightB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.moveSlidesToRight();
    }
    @Test
    public void moveSlideToLeftB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.moveSlideToLeft();
    }
}
