package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reporting.TestLogger;

public class SlideMenu extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"banking\"]/div[1]/div[1]/ul/li[1]/a") public static WebElement CheckingAccount;
    @FindBy(xpath = "//*[@id=\"bankingTab\"]") public static WebElement BankingAndCards;
    @FindBy(xpath = "//*[@id=\"c28close\"]/img") public static WebElement ClosePupOp;
    @FindBy(xpath = "//*[@id=\"primaryRegion\"]/div/div/div/div[3]/div[2]/span/a") public static WebElement OpenAccountNow;
    @FindBy(xpath = "//*[@id=\"lb\"]") public static WebElement ChangeLocations;
    public void chekingAccountsFunctions(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].click()");
        clickByXpath("//*[@id=\"banking\"]/div[1]/div[1]/ul/li[1]/a");
    }
    public void checkingAccountPopup(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].click()", webDriver.findElement(By.xpath("//*[@id=\"banking\"]/div[1]/div[1]/ul/li[1]/a")));
        webDriver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("33027", Keys.ENTER);
    }
    public void titleT(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].click()", webDriver.findElement(By.xpath("//*[@id=\"banking\"]/div[1]/div[1]/ul/li[1]/a")));
        webDriver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("33027", Keys.ENTER);
        String Expected = "Checking Accounts: Open Online Today | Wells Fargo";
        String Actual = webDriver.getTitle();
        Assert.assertEquals(Actual, Expected);
    }
}
