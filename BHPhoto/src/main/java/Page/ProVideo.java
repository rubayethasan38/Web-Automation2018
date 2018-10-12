package Page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProVideo extends CommonAPI {
    @FindBy(css = "#cat3755 > a > span")
    public static WebElement ProVideo;
    //methods
    public void clickOnProVideoCamcorders() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat3755 > a"));
        mouseHoverByCSS("#cat3755 > a");
        sleepFor(1);
        clickByXpath("#menu-3755 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        sleepFor(1);
        String expected = "PRO CAMCORDERS & CAMERAS";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoDigitalCineCamera() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat3755 > a"));
        sleepFor(1);
        mouseHoverByCSS("#cat3755 > a");
        sleepFor(1);
        clickByXpath("#menu-3755 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Digital Cine Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoTelevisionStudioEFPCameras() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat3755 > a"));
        sleepFor(1);
        mouseHoverByCSS("#cat3755 > a");
        sleepFor(1);
        clickByXpath("#menu-3755 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Television Studio & EFP Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoBroadcastVideoCameras() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat3755 > a"));
        sleepFor(1);
        mouseHoverByCSS("#cat3755 > a");
        sleepFor(1);
        clickByXpath("#menu-3755 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Broadcast Video Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoIndustrialMultiPurposeCameras() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat3755 > a"));
        sleepFor(1);
        mouseHoverByCSS("#cat3755 > a");
        sleepFor(1);
        clickByXpath("#menu-3755 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Industrial & Multi-Purpose Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
}
