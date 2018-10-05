package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
        String Actual = webDriver.findElement(By.xpath("//*[@id=\"skip\"]")).getText();
        String Expected = "About Wells Fargo";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Expected);
    }
    public void privacyButton(){
        Privacy.click();
        String Actual = webDriver.findElement(By.xpath("//*[@id=\"skip\"]")).getText();
        String Expected = "Privacy, Security, and Legal";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Expected);
    }
    public void reportFraudB(){
        ReportFraud.click();
        String Actual = webDriver.findElement(By.xpath("//*[@id=\"skip\"]")).getText();
        String Expected = "How to Report Fraud";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Expected);
    }
    public void siteMapB(){
        SiteMap.click();
        String Actual = webDriver.findElement(By.xpath("//*[@id=\"skip\"]")).getText();
        String Expected = "Sitemap";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Expected);
    }
    public void accesabilityB(){
        Accesability.click();
        String Actual = webDriver.findElement(By.xpath("//*[@id=\"skip\"]")).getText();
        String Expected = "Diversity and Accessibility";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Expected);
    }
    public void onlineAccesment(){
        OnlineAccesment.click();
        String Actual = webDriver.findElement(By.xpath("//*[@id=\"skip\"]")).getText();
        String Expected = "Online Access Agreement";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Expected);
    }
    public void addChoices(){
        AddChoices.click();
        String Actual = webDriver.findElement(By.xpath("//*[@id=\"skip\"]")).getText();
        String Expected = "Wells Fargo Digital Privacy and Cookies Policy";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Expected);
    }
}
