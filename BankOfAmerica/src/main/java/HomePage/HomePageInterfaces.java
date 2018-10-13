package HomePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePageInterfaces extends CommonAPI {

    @FindBy(id = "compareCheckingAccounts")public static WebElement chekingAccounts;
    public void setCheking() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickByXpath("//*[@id=\"navChecking\"]/span[2]");
        String Actual = "Checking should\n" +
                "fit your life";
        String Expected = webDriver.findElement(By.xpath("//*[@id=\"navCheckingContent\"]/div[2]/div[1]/div[1]/div[1]/div[1]/div/p")).getText();
        Assert.assertEquals(Actual, Expected);
    }
    public void setSavigns(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickByXpath("//*[@id=\"navSavings\"]");
        String Actual = "Savings made simple and rewarding";
        String Expected= webDriver.findElement(By.xpath("//*[@id=\"navSavingsContent\"]/div[2]/div[1]/div[1]/div[1]/div[1]/div/p")).getText();
        Assert.assertEquals(Actual, Expected);
    }
    public void setCreditCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickByXpath("//*[@id=\"navCreditCards\"]/span[2]");
        String Actual = "Find the perfect credit card from among our most popular options";
        String Expected = webDriver.findElement(By.xpath("//*[@id=\"navCreditCardsContent\"]/div[2]/div[1]/div[1]/div[1]/div[1]/div/p")).getText();
        Assert.assertEquals(Actual,Expected);
    }
    public void compareChekingAccounts() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickByXpath("//*[@id=\"navChecking\"]/span[2]");
        sleepFor(2);
        chekingAccounts.click();
    }
    public void shopCreditCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickByXpath("//*[@id=\"navCreditCards\"]/span[2]");
        clickByXpath("//*[@id=\"btnCompareCreditCards\"]");
    }
}
