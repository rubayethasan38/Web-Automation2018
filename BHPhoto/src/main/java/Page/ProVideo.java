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
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[3]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]")
    public static WebElement ProfessionalCamcorders;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[3]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]")
    public static WebElement DigitalCineCameras;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[3]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]")
    public static WebElement StudioEFPCameras;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[3]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]")
    public static WebElement BroadcastCameras;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[3]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]")
    public static WebElement IndustrialMultiPurposeCameras;
    //methods
    public void clickOnProVideoCamcorders() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//span[contains(text(),'Pro Video')]"));
        mouseHoverByXpath("//span[contains(text(),'Pro Video')]");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[3]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]");
        sleepFor(2);
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
        sleepFor(2);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[3]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]");
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
        sleepFor(2);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[3]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]");
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
        sleepFor(2);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[3]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]");
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
        sleepFor(2);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[3]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]");
        String expected = "Industrial & Multi-Purpose Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
}
