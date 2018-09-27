package FrontPageTest;

import FrontPage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    HomePage objHomePage;

    @BeforeMethod
    public void initializePageObjects() {

        objHomePage = PageFactory.initElements(webDriver, HomePage.class);
    }

    @Test
    public void searchBoxTest() {
        objHomePage.isSearchBox();
    }

    @Test
    public void searchButtonTest() {
        objHomePage.searchButton();
    }

    @Test
    public void xboxOne() {
        objHomePage.Xboxone();
    }

    @Test
    public void PS4() {
        objHomePage.PS4();
    }

    @Test
    public void swtichTab() {
        objHomePage.SwitchTab();
    }

    @Test
    public void xbox360() {
        objHomePage.Xbox360();
    }

    @Test
    public void PS3() {
        objHomePage.PS3();
    }

    @Test
    public void PC() {
        objHomePage.PC();
    }

    @Test
    public void WiiU() {
        objHomePage.WiiU();
    }

    @Test
    public void sds() {
        objHomePage.sds();
    }

    @Test
    public void VR() {
        objHomePage.VR();
    }

    @Test
    public void CoolStuff() {
        objHomePage.CoolStuff();
    }

    @Test
    public void Digital() {
        objHomePage.Digital();
    }

    @Test
    public void PowerUpRewards() {
        objHomePage.PowerUprewards();
    }

    @Test
    public void LoginIn() {
        objHomePage.LoginIn();
    }

    @Test
    public void WeeklyAd() {
        objHomePage.WeeklyAd();
    }

    @Test
    public void NeedHelp() {
        objHomePage.NeedHelp();
    }

    @Test
    public void FindAstore() {
        objHomePage.FindAstore();
    }

    @Test
    public void GiftCard() {
        objHomePage.Giftcard();
    }

    @Test
    public void Deals() {
        objHomePage.Deals();
    }

    @Test
    public void YourCart() {
        objHomePage.Yourcart();
    }

    @Test
    public void Preowned() {
        objHomePage.PreOwned();
    }

    @Test
    public void Trade() {
        objHomePage.Trade();
    }

    @Test
    public void Events() {
        objHomePage.Events();
    }

    @Test
    public void RssFeed() {
        objHomePage.RssFeed();
    }

    @Test
    public void StoreFeedBack() {
        objHomePage.StoreFeedBack();
    }

    @Test
    public void ContactUs() {
        objHomePage.ContactUs();
    }

    @Test
    public void OrderHistory() {
        objHomePage.OrderHistory();
    }

    @Test
    public void GameStopInternational() {
        objHomePage.GameStopInternational();
    }

    @Test
    public void Sweepstakes() {
        objHomePage.SweepStakes();
    }

    @Test
    public void GameInformer() {
        objHomePage.GameInformer();
    }

    @Test
    public void HelpCenter() {
        objHomePage.HelpCenter();
    }
}






