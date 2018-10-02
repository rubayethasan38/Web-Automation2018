package HomePageTest;

import Home.HomeHelper;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageFunctions extends HomeHelper {

    HomeHelper homeHelper;
    @BeforeMethod
    public void init(){
        homeHelper = PageFactory.initElements(webDriver, HomeHelper.class);
    }
    @Test(priority = 1, enabled = true)
    public void studentLoadsB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        studentLoans();
    }
    @Test(priority = 2, enabled = true)
    public void earnKBonusB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        earnKBonus();
    }
    @Test(priority = 3, enabled = true)
    public void missPlacedDebitCardB() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        missPlacedDebitCard();
    }
    @Test(priority = 4, enabled = true)
    public void HurrricaneAlertFunction(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HurricaneAlertLearnMoreF();
    }
}

