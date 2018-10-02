package HomePageTest;

import Home.HomeHelper;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ServicesTest extends HomeHelper {

    HomeHelper homeHelper;
    @BeforeMethod
    public void init (){
        homeHelper = PageFactory.initElements(webDriver, HomeHelper.class);
    }
    @Test(priority = 1, enabled = true)
    public void applyForStudentLoanTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.applyForStudentLoan();
    }
    @Test(priority = 2, enabled = true)
    public void collectionsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.collections();
    }
    @Test(priority = 3, enabled = true)
    public void makeQuickDepositTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeHelper.quickDeposit();
    }
}
