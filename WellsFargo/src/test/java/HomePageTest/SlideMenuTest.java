package HomePageTest;

import Home.SlideMenu;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SlideMenuTest extends SlideMenu {

    SlideMenu ObjOfSlideMenu;

    public void init(){
        ObjOfSlideMenu = PageFactory.initElements(webDriver, SlideMenu.class);
    }
    @Test
    public void hoverOverBankingCardsT(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chekingAccountsFunctions();
    }
    @Test
    public void sendZipCodePopUp(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        checkingAccountPopup();
    }
    @Test
    public void checkingAccountTittle(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        titleT();
    }
}
