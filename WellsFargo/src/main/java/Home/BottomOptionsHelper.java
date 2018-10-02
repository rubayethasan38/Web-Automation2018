package Home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BottomOptionsHelper extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[1]/a") public static WebElement AboutWellsFargo;
    @FindBy(xpath = "//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[3]/a") public static WebElement Privacy;
    @FindBy(xpath = "//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[4]/a") public static WebElement ReportFraud;
    @FindBy(xpath = "//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[5]/a") public static WebElement SiteMap;
    @FindBy(xpath = "//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[6]/a") public static WebElement Accesability;
    @FindBy(xpath = "//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[7]/a") public static WebElement OnlineAccesment;
    @FindBy(xpath = "//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[8]/a") public static WebElement AddChoices;

    public void AboutWellsFargoB(){
        AboutWellsFargo.click();
    }
    public void privacyButton(){
        Privacy.click();
    }
    public void reportFraudB(){
        ReportFraud.click();
    }
    public void siteMapB(){
        SiteMap.click();
    }
    public void accesabilityB(){
        Accesability.click();
    }
    public void onlineAccesment(){
        OnlineAccesment.click();
    }
    public void addChoices(){
        AddChoices.click();
    }
}
