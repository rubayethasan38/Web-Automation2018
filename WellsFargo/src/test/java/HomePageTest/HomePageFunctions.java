package HomePageTest;

import Home.HomeHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageFunctions extends HomeHelper {

    HomeHelper objOfHomeHelper;
    @BeforeMethod
    public void init(){
        objOfHomeHelper = PageFactory.initElements(webDriver, HomeHelper.class);
    }
    @Test
    public void studentLoadsB(){
        studentLoans();
    }
    @Test
    public void earnKBonusB(){
        earnKBonus();
    }
    @Test
    public void makeAnAppointmentF(){
        makeAnAppointment();
    }
    @Test
    public void missPlacedDebitCardB() {
        missPlacedDebitCard();
    }
    @Test
    public void HurrricaneAlertFunction(){
        HurricaneAlertLearnMoreF();
    }
}

