package FrontPage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"searchtext\"]")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"searchbutton\"]")
    public static WebElement SearchButton;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[1]/a")
    public static WebElement Xboxone;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[2]/a")
    public static WebElement PS4;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[3]/a")
    public static WebElement SwitchTab;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[4]/a")
    public static WebElement Xbox360;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[5]/a")
    public static WebElement PS3;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[6]/a")
    public static WebElement PC;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[7]/a")
    public static WebElement WiiU;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[8]/a")
    public static WebElement sds;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[9]/a")
    public static WebElement VR;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[10]/a")
    public static WebElement CoolStuff;
    @FindBy(xpath = "///*[@id=\"navline3\"]/div[1]/div/ul/li[11]/a")
    public static WebElement Digital;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[11]/a")
    public static WebElement PowerUpRewards;
    @FindBy(xpath = "//*[@id=\"hrd-greeting\"]/a")
    public static WebElement LoginIn;
    @FindBy(xpath = "//*[@id=\"navline1\"]/ul/li[5]/a")
    public static WebElement WeeklyAd;
    @FindBy(xpath = "//*[@id=\"navline1\"]/ul/li[1]")
    public static WebElement NeedHelp;
    @FindBy(xpath = "//*[@id=\"navline1\"]/ul/li[3]/a")
    public static WebElement FindAStore;
    @FindBy(xpath = "//*[@id=\"navline1\"]/ul/li[4]/a")
    public static WebElement GiftCard;
    @FindBy(xpath = "//*[@id=\"navline1\"]/ul/li[6]/a")
    public static WebElement Deals;
    @FindBy(xpath = "///*[@id=\"navline2\"]/ul/li[2]")
    public static WebElement YourCart;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[14]/a")
    public static WebElement PreOwned;
    @FindBy(xpath = "//*[@id=\"navline3\"]/div[1]/div/ul/li[15]/a")
    public static WebElement Trade;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[2]/ul/li[5]/a")
    public static WebElement Events;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[2]/ul/li[4]/a")
    public static WebElement RssFeed;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[3]/ul/li[6]/a")
    public static WebElement StoreFeedBack;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[3]/ul/li[5]/a")
    public static WebElement ContactUs;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[3]/ul/li[3]/a")
    public static WebElement OrderHistory;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[4]/ul/li[5]/a")
    public static WebElement GameStopInternational;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[2]/ul/li[6]/a")
    public static WebElement SweepStakes;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[4]/ul/li[3]/a")
    public static WebElement GameInformer;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[3]/ul/li[1]/a")
    public static WebElement HelpCenter;

    public void isSearchBox() {
        searchBox.sendKeys("Fortnite", Keys.ENTER);
    }

    public void searchButton() {
        SearchButton.click();
    }

    public void Xboxone() {
        Xboxone.click();
    }

    public void PS4() {
        PS4.click();
    }

    public void SwitchTab() {
        SwitchTab.click();
    }

    public void Xbox360() {
        Xbox360.click();
    }

    public void PS3() {
        PS3.click();
    }

    public void PC() {
        PC.click();
    }

    public void WiiU() {
        WiiU.click();
    }

    public void sds() {
        sds.click();
    }

    public void VR() {
        VR.click();
    }

    public void CoolStuff() {
        CoolStuff.click();
    }

    public void Digital() {
        Digital.click();
    }

    public void PowerUprewards() {
        PowerUpRewards.click();
    }

    public void LoginIn() {
        LoginIn.click();
    }

    public void WeeklyAd() {
        WeeklyAd.click();
    }

    public void NeedHelp() {
        NeedHelp.click();
    }

    public void FindAstore() {
        FindAStore.click();
    }

    public void Giftcard() {
        GiftCard.click();
    }

    public void Deals() {
        Deals.click();
    }

    public void Yourcart() {
        YourCart.click();
    }

    public void PreOwned() {
        PreOwned.click();
    }

    public void Trade() {
        Trade.click();
    }

    public void Events() {
        Events.click();
    }

    public void RssFeed() {
        RssFeed.click();
    }

    public void StoreFeedBack() {
        StoreFeedBack.click();
    }

    public void ContactUs() {
        ContactUs.click();
    }

    public void OrderHistory() {
        OrderHistory.click();
    }

    public void GameStopInternational() {
        GameStopInternational.click();
    }

    public void SweepStakes() {
        SweepStakes.click();
    }

    public void GameInformer() {
        GameInformer.click();
    }

    public void HelpCenter() {
        HelpCenter.click();
    }
}
