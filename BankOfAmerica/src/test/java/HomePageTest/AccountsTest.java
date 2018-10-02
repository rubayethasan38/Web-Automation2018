package HomePageTest;

import HomePage.HomePageHelper;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AccountsTest extends HomePageHelper {

    HomePageHelper homePageHelper;
    @BeforeMethod
    public void init (){
        homePageHelper = PageFactory.initElements(webDriver,HomePageHelper.class);
    }
    @Test(priority = 1, enabled = true)
    public void recoverPasswordTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.forgotPassword();
    }
    @Test(priority = 2, enabled = true)
    public void enrollBankOfAmericaTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.enroll();
    }
    @Test(priority = 3, enabled = true)
    public void openAnAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.openAccount();
    }
    @Test(priority = 4, enabled = true)
    public void openCreditCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.openCreditCard();
    }
    @Test(priority = 5, enabled = true)
    public void applyHomeLoan(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.homeLoan();
    }
    @Test(priority = 6, enabled = true)
    public void applyForCarLoan(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.carLoan();
    }
    @Test(priority = 7, enabled = true)
    public void smallBussinessTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.startSmallBussiness();
    }
}
