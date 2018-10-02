package HomePageTest;

import Home.SlideMenu;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SlideMenuTest extends SlideMenu {

    SlideMenu slideMenu;
    @BeforeMethod
    public void init(){
        slideMenu = PageFactory.initElements(webDriver, SlideMenu.class);
    }
    @Test(priority = 2, enabled = true)
    public void hoverOverBankingCardsT(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chekingAccountsFunctions();
    }
    @Test(priority = 1, enabled = true)
    public void sendZipCodePopUp(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        checkingAccountPopup();
    }
    @Test(priority = 3, enabled = true)
    public void checkingAccountTittle(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        titleT();
    }
}
