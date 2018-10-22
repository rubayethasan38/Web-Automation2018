package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class Mobile extends CommonAPI {
    @FindBy(css = "#cat8565 > a > span")
    public static WebElement Mobile;
    @FindBy(xpath = "//*[@id=\"menu-8565\"]/div/div/div/ul/li[1]/a/div[1]")
    public static WebElement UnlockedCellPhones;
    @FindBy(xpath = "//*[@id=\"menu-8565\"]/div/div/div/ul/li[2]/a/div[1]")
    public static WebElement iPadsTablets;
    @FindBy(xpath = "//*[@id=\"menu-8565\"]/div/div/div/ul/li[3]/a/div[1]")
    public static WebElement WearableTechnology;
    @FindBy(xpath = "//*[@id=\"menu-8565\"]/div/div/div/ul/li[4]/a/div[1]")
    public static WebElement CellPhoneAccessories;
    @FindBy(xpath = "//*[@id=\"menu-8565\"]/div/div/div/ul/li[5]/a/div[1]")
    public static WebElement TabletAccessories;
    //methods
    public void clickOnMobileUnlockedCellPhones() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.cssSelector("#cat8565 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat8565 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-8565\"]/div/div/div/ul/li[1]/a/div[1]");
        String expected = "Unlocked Cell Phones";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnMobileiPadsMediaTablets() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.cssSelector("##cat8565 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("##cat8565 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-8565\"]/div/div/div/ul/li[2]/a/div[1]");
        String expected = "iPads & Media Tablets";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnMobileWearableTechnology() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.cssSelector("##cat8565 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("##cat8565 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-8565\"]/div/div/div/ul/li[3]/a/div[1]");
        String expected = "Wearable Technology";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnMobileCellPhoneAccessories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.cssSelector("##cat8565 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("##cat8565 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-8565\"]/div/div/div/ul/li[4]/a/div[1]");
        String expected = "Cell Phone Accessories";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnMobileTabletAccessories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.cssSelector("##cat8565 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("##cat8565 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-8565\"]/div/div/div/ul/li[5]/a/div[1]");
        String expected = "Tablet Accessories";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
        Assert.assertEquals(actual, expected);
    }
}