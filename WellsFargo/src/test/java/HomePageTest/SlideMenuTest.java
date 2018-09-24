package HomePageTest;

import Home.SlideMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SlideMenuTest extends SlideMenu {

    SlideMenu ObjOfSlideMenu;

    public void init(){
        ObjOfSlideMenu = PageFactory.initElements(webDriver, SlideMenu.class);
    }
    @Test
    public void hoverOverBankingCardsT(){
        chekingAccountsFunctions();
    }
    @Test
    public void sendZipCodePopUp(){
        checkingAccountPopup();
    }
    @Test
    public void checkingAccountTittle(){
        titleT();
    }
}
