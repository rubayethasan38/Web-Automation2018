package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class ProVideo extends CommonAPI {
    @FindBy(xpath = "//span[contains(text(),'Pro Video')]")
    public static WebElement ProVideo;
    @FindBy(xpath = "//*[@id=\"menu-3755\"]/div/div/div/ul/li[1]/a/div[1]")
    public static WebElement ProfessionalCamcorders;
    @FindBy(xpath = "//*[@id=\"menu-3755\"]/div/div/div/ul/li[2]/a/div[1]")
    public static WebElement DigitalCineCameras;
    @FindBy(xpath = "//*[@id=\"menu-3755\"]/div/div/div/ul/li[3]/a/div[1]")
    public static WebElement StudioEFPCameras;
    @FindBy(xpath = "//*[@id=\"menu-3755\"]/div/div/div/ul/li[4]/a/div[1]")
    public static WebElement BroadcastCameras;
    @FindBy(xpath = "//*[@id=\"menu-3755\"]/div/div/div/ul/li[5]/a/div[1]")
    public static WebElement IndustrialMultiPurposeCameras;
    //methods
    public void clickOnProVideoCamcorders() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//span[contains(text(),'Pro Video')]"));
        mouseHoverByXpath("//span[contains(text(),'Pro Video')]");
        sleepFor(1);
        clickByXpath("#menu-3755 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        sleepFor(1);
        String expected = "PRO CAMCORDERS & CAMERAS";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoDigitalCineCamera() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//span[contains(text(),'Pro Video')]"));
        sleepFor(1);
        mouseHoverByXpath("//span[contains(text(),'Pro Video')]");
        sleepFor(1);
        clickByXpath("#menu-3755 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Digital Cine Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoTelevisionStudioEFPCameras() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//span[contains(text(),'Pro Video')]"));
        sleepFor(1);
        mouseHoverByXpath("//span[contains(text(),'Pro Video')]");
        sleepFor(1);
        clickByXpath("#menu-3755 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Television Studio & EFP Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoBroadcastVideoCameras() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//span[contains(text(),'Pro Video')]"));
        sleepFor(1);
        mouseHoverByXpath("//span[contains(text(),'Pro Video')]");
        sleepFor(1);
        clickByXpath("#menu-3755 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Broadcast Video Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoIndustrialMultiPurposeCameras() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//span[contains(text(),'Pro Video')]"));
        sleepFor(1);
        mouseHoverByXpath("//span[contains(text(),'Pro Video')]");
        sleepFor(1);
        clickByXpath("#menu-3755 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Industrial & Multi-Purpose Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
}
