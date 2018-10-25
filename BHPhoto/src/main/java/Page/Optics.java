package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class Optics extends CommonAPI {
    @FindBy(xpath = "//a[@name='Top Nav-Binoculars and Scopes']")
    public static WebElement menuOptics;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[10]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]")
    public static WebElement Binoculars;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[10]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]")
    public static WebElement Telescope;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[10]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]")
    public static WebElement SpottingScopes;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[10]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]")
    public static WebElement RiflescopesSights;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[10]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]")
    public static WebElement NightThermalVision;
    //methods
    public void clickOnOpticsBinoculars() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Binoculars and Scopes']"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Binoculars and Scopes']");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[10]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]");
        String expected = "Binoculars";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsTelescopesAstronomy() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Binoculars and Scopes']"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Binoculars and Scopes']");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[10]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]");
        String expected = "Telescopes & Astronomy";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsSpottingScopesAccessories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Binoculars and Scopes']"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Binoculars and Scopes']");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[10]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]");
        String expected = "Spotting Scopes & Accessories";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsRiflescopesAccessories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Binoculars and Scopes']"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Binoculars and Scopes']");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[10]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]");
        String expected = "Riflescopes & Accessories";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsNightThermalVisionOptics() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Binoculars and Scopes']"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Binoculars and Scopes']");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[10]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]");
        String expected = "Night & Thermal Vision Optics";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
}
