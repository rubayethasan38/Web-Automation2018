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
    @Test
    public void recoverPasswordTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.forgotPassword();
    }
    @Test
    public void enrollBankOfAmericaTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.enroll();
    }
    @Test
    public void openAnAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.openAccount();
    }
    @Test
    public void openCreditCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.openCreditCard();
    }
    @Test
    public void applyHomeLoan(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.homeLoan();
    }
    @Test
    public void applyForCarLoan(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.carLoan();
    }
    @Test
    public void smallBussinessTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageHelper.startSmallBussiness();
    }
}
