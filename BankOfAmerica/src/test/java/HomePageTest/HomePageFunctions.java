package HomePageTest;

import HomePage.HomePageHelper;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageFunctions extends HomePageHelper {

    HomePageHelper homePageHelper;
    @BeforeMethod
    public void init(){
        homePageHelper = PageFactory.initElements(webDriver, HomePageHelper.class);
    }
    @Test(priority = 0, enabled = true)
    public void searchBoxTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.searchBox();
    }
    @Test(priority = 1, enabled = false)
    public void spanishSiteTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.changeLenguage();
    }
    @Test(priority = 2, enabled = false)
    public void contactUsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.contactUs();
    }
    @Test(priority = 3, enabled = false)
    public void helpTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.help();
    }
    @Test(priority = 4, enabled = false)
    public void smallBussinessTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.smallBussiness();
    }
    @Test(priority = 5, enabled = false)
    public void wealthManagementTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.wealthManagement();
    }
    @Test(priority = 6, enabled = false)
    public void bussinessTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.bussinessAI();
    }
    @Test(priority = 7, enabled = false)
    public void aboutUsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.aboutUs();
    }
    @Test(priority = 8, enabled = false)
    public void signInTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.signIn();
    }
}
