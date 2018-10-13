package HomePageTest;

import HomePage.HomePageInterfaces;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageInterfacesTest extends HomePageInterfaces {

    HomePageInterfaces homePageInterfaces;
    @BeforeMethod
    public void initElements(){
        homePageInterfaces = PageFactory.initElements(webDriver, HomePageInterfaces.class);
    }
    @Test
    public void checkingTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setCheking();
    }
    @Test
    public void savingsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setSavigns();
    }
    @Test
    public void creditCardsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setCreditCards();
    }
    @Test
    public void compareCheckingAccountTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        compareChekingAccounts();
    }
    @Test
    public void shopCreditCardsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        shopCreditCards();
    }
}
