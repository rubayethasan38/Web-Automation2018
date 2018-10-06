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
    public void clickOnProVideoCamcorders() {
        mouseHoverByCSS("#cat3755 > a");
        clickOnCss("#menu-3755 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "PRO CAMCORDERS & CAMERAS";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoDigitalCineCamera() {
        mouseHoverByCSS("#cat3755 > a");
        clickOnCss("#menu-3755 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Digital Cine Cameras";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoTelevisionStudioEFPCameras() {
        mouseHoverByCSS("#cat3755 > a");
        clickOnCss("#menu-3755 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Television Studio & EFP Cameras";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoBroadcastVideoCameras() {
        mouseHoverByCSS("#cat3755 > a");
        clickOnCss("#menu-3755 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Broadcast Video Cameras";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideoIndustrialMultiPurposeCameras() {
        mouseHoverByCSS("#cat3755 > a");
        clickOnCss("#menu-3755 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Industrial & Multi-Purpose Cameras";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
}
