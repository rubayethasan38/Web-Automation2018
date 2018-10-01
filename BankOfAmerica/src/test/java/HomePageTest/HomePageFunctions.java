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
    @Test
    public void searchBoxTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.searchBox();
    }
    @Test
    public void spanishSiteTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.changeLenguage();
    }
    @Test
    public void contactUsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.contactUs();
    }
    @Test
    public void helpTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.help();
    }
    @Test
    public void smallBussinessTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.smallBussiness();
    }
    @Test
    public void wealthManagementTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.wealthManagement();
    }
    @Test
    public void bussinessTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.bussinessAI();
    }
    @Test
    public void aboutUsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.aboutUs();
    }
    @Test
    public void signInTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.signIn();
    }
}
