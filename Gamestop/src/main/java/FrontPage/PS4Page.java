package FrontPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PS4Page extends CommonAPI {

    @FindBy(xpath = "///*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[3]/a[1]")
    public static WebElement Cons;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[3]/a[2]/img")
    public static WebElement Games;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[1]/a[1]/h3")
    public static WebElement ComingSoon;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[1]/a[2]/h3")
    public static WebElement NowAvailable;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[1]/a[3]/h3")
    public static WebElement Action;
    @FindBy(xpath = "//*[@id=\"n//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[1]/a[4]/h3")
    public static WebElement Casual;
    @FindBy(xpath = "///*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[2]/a[1]/h3")
    public static WebElement Fighting;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[2]/a[2]/h3")
    public static WebElement Shooter;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[2]/a[3]")
    public static WebElement Musicandparty;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[2]/a[4]/h3")
    public static WebElement sports;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[3]/a[1]")
    public static WebElement Strategy;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[3]/a[2]")
    public static WebElement RolePlaying;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[3]/a[3]")
    public static WebElement Puzzleandcard;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[6]/div[3]/a[4]")
    public static WebElement Simulation;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[9]/div[1]/a[1]")
    public static WebElement Controllers;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[9]/div[1]/a[2]")
    public static WebElement Headsets;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[9]/div[1]/a[3]")
    public static WebElement Chargers;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[9]/div[1]/a[4]")
    public static WebElement Harddrives;
    @FindBy(xpath = "//*[@id=\"mainContentPlaceHolder_dynamicContent_ctl00_RepeaterCenterColumnLayouts_CenterColumnPlaceHolder_0_ctl00_0_LayoutStandardPanel_0\"]/div[6]/div[9]/div[2]/a[1]")
    public static WebElement Cables;

    public void Cons() {
        Cons.click();
    }
    public void Games() {
        Games.click();
    }
    public void ComingSoon() {
        ComingSoon.click();
    }
    public void NowAvailable() {
        NowAvailable.click();
    }
    public void Action() {
        Action.click();
    }
    public void Casual() {
        Casual.click();
    }
    public void Fighting() {
        Fighting.click();
    }
    public void Shooter() {
        Shooter.click();
    }
    public void MusicandParty() {
        Musicandparty.click();
    }
    public void sports() {
        sports.click();
    }
    public void strategy() {
        Strategy.click();
    }
    public void Roleplaying() {
        RolePlaying.click();
    }
    public void Puzzleandcard() {
        Puzzleandcard.click();
    }
    public void simulation() {
        Simulation.click();
    }
    public void controllers() {
        Controllers.click();
    }
    public void Headsets() {
        Headsets.click();
    }
    public void chargers() {
        Chargers.click();
    }
    public void Harddrives() {
        Harddrives.click();
    }
    public void cables() {
        Cables.click();
    }
}
