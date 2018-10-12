package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class HomeHelper extends CommonAPI {
    @FindBy(css = "#inputTopSearchField")  public static WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"userid\"]" )  public static WebElement userName;
    @FindBy(xpath = "//*[@id=\"password\"]")  public static WebElement userPassWord;
    @FindBy(css = "#pageFooter > div.c9content > nav > div > ul > li:nth-child(2) > a") WebElement careersButton;
    @FindBy(xpath = "//*[@id=\"topSearch\"]/ul/li[1]/a") public  static WebElement enrollButton;
    @FindBy(xpath ="//*[@id=\"topSearch\"]/ul/li[2]/a" ) public static WebElement costumerService;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[2]/div[2]/div/div[7]/a/img") public static WebElement moveSlidesToRight;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[2]/div[2]/div/div[1]/a/img") public static WebElement moveSlidesToLeft;
    @FindBy(xpath = "//*[@id=\"taskbar\"]/div/ul/li[3]/div/div/a/div") public static WebElement studentLoans;
    @FindBy(xpath = "//*[@id=\"taskbar\"]/div/ul/li[1]/div/div/a") public static WebElement earnKBonus;
    @FindBy(xpath = "//*[@id=\"taskbar\"]/div/ul/li[4]/div/div[1]") public static WebElement MakeAnAppointment;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[4]/div/div/div[2]/a") public static WebElement MissplacedDebitCard;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/p/a") public static WebElement HurricaneAlertLearnMore;
     public void setSearchBoxFunction(){
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
         searchBox.sendKeys("Atm near Me");
    }
     public void usernameInput(){
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
         userName.sendKeys("luillo123");
    }
     public void enrollButtonF(){
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
         enrollButton.click();
    }
     public void careersButtonF(){
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
         careersButton.click();
    }
     public void userPasswordInput(){
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
         userPassWord.click();
     }
     public void costumerService(){
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
         costumerService.click();
     }
     public void moveSlidesToRight (){
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
        moveSlidesToRight.click();
     }
     public void moveSlideToLeft(){
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
         moveSlidesToLeft.click();
     }
     public void studentLoans(){
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));WebDriverWait wait = new WebDriverWait(webDriver, 20);
         WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taskbar\"]/div/ul/li[3]")));
        studentLoans.click();
    }
     public void earnKBonus(){
         TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
         WebDriverWait wait = new WebDriverWait(webDriver, 10);
         WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taskbar\"]/div/ul/li[1]/div/div/a")));
         earnKBonus.click();
     }
    public void missPlacedDebitCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MissplacedDebitCard.click();
        String Expected = "Pause Your Debit Card if Misplaced - Wells Fargo" ;
        String Actual = webDriver.getTitle();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
    public void HurricaneAlertLearnMoreF(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
         HurricaneAlertLearnMore.click();
        String Expected = "Disaster Response Services - Wells Fargo";
        String Actual = webDriver.getTitle();
        System.out.println(Actual);
        Assert.assertEquals(Actual, Expected);
    }
}

