package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class Lighting extends CommonAPI {
    @FindBy(xpath = "//a[@name='Top Nav-Lighting and Studio']//span[contains(text(),'Lighting')]")
    public static WebElement Lighting;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[4]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]")
    public static WebElement ContinuousLighting;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[4]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]")
    public static WebElement StrobeLighting;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[4]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]")
    public static WebElement FlashesOnCameraLighting;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[4]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]")
    public static WebElement LightModifiers;
    //methods
    public void clickOnLightingContinuousLighting() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Lighting and Studio']//span[contains(text(),'Lighting')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Lighting and Studio']//span[contains(text(),'Lighting')]");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[4]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]");
        String expected = "Continuous Lighting";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3)")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnLightingStrobeFlash() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Lighting and Studio']//span[contains(text(),'Lighting')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Lighting and Studio']//span[contains(text(),'Lighting')]");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[4]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]");
        String expected = "Strobe (Flash) Lighting";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnLightingFlashesOnCameraLights() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Lighting and Studio']//span[contains(text(),'Lighting')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Lighting and Studio']//span[contains(text(),'Lighting')]");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[4]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]");
        String expected = "Flashes & On Camera Lights";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnLightingLightModifiers() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Lighting and Studio']//span[contains(text(),'Lighting')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Lighting and Studio']//span[contains(text(),'Lighting')]");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[4]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]");
        String expected = "Light Modifiers";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
}
