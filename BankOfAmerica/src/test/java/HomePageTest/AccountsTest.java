package HomePageTest;

import HomePage.HomePageHelper;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AccountsTest extends HomePageHelper {

    HomePageHelper ObjOfHomePageHelper;
    @BeforeMethod
    public void init (){
        ObjOfHomePageHelper = PageFactory.initElements(webDriver,HomePageHelper.class);
    }
    @Test
    public void recoverPasswordTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfHomePageHelper.forgotPassword();
    }
    @Test
    public void enrollBankOfAmericaTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfHomePageHelper.enroll();
    }
    @Test
    public void openAnAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfHomePageHelper.openAccount();
    }
    @Test
    public void openCreditCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfHomePageHelper.openCreditCard();
    }
    @Test
    public void applyHomeLoan(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfHomePageHelper.homeLoan();
    }
    @Test
    public void applyForCarLoan(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfHomePageHelper.carLoan();
    }
    @Test
    public void smallBussinessTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfHomePageHelper.startSmallBussiness();
    }
}
