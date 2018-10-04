package Page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {
    @FindBy(css = "#cat989 > a > span")
    public static WebElement Photography;
    @FindBy(css = "#cat9581 > a > span")
    public static WebElement Computers;
    @FindBy(css = "#cat3755 > a > span")
    public static WebElement ProVideo;
    @FindBy(css = "#cat1161 > a > span")
    public static WebElement Lighting;
    @FindBy(css = "#cat12154 > a > span")
    public static WebElement ProAudio;
    @FindBy(css = "#cat8565 > a > span")
    public static WebElement Mobile;
    @FindBy(css = "#cat4600 > a > span")
    public static WebElement TVEntertainment;
    @FindBy(css = "#cat1820 > a > span")
    public static WebElement Camcorders;
    @FindBy(css = "#cat3496 > a > span")
    public static WebElement Surveillance;
    @FindBy(css = "#cat978 > a > span")
    public static WebElement Optics;
    @FindBy(css = "#cat3644 > a > span")
    public static WebElement AudioVisual;

    //methods

    public void clickOnPhotography() {
        mouseHoverByCSS("#cat989 > a:nth-child(1) > span");
        clickOnCss("#menu-989 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Digital Camera Types";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }

    public void clickOnComputers() {
        mouseHoverByCSS("##menu-9581 > a:nth-child(2) > span");
        clickOnCss("#menu-9581 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "View Results By Product Type";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProVideo() {
        mouseHoverByCSS("#cat3755 > a");
        clickOnCss("#menu-3755 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "PRO CAMCORDERS & CAMERAS";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnLighting() {
        mouseHoverByCSS("#cat1161 > a > span");
        clickOnCss("##menu-1161 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Continuous Lighting";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);

    }
    public void clickOnProAudio() {
        mouseHoverByCSS("#cat12154 > a > span");
        clickOnCss("#menu-12154 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Computer Audio";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);

    }
    public void clickOnMobile() {
        mouseHoverByCSS("##cat8565 > a > span");
        clickOnCss("#menu-8565 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "View Results By Carrier Compatibility";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);

    }
    public void clickOnTVEntertainment() {
        mouseHoverByCSS("#cat4600 > a > span");
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "View Results By Television Type";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);

    }
    public void clickOnCamcorders() {
        mouseHoverByCSS("#cat1820 > a > span");
        clickOnCss("#menu-1820 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Action Cameras & Accessories";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);

    }
    public void clickOnSurveillance() {
        mouseHoverByCSS("#cat3496 > a > span");
        clickOnCss("#menu-3496 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Body Cameras & Accessories";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);

    }
    public void clickOnOptics() {
        mouseHoverByCSS("#cat978 > a > span");
        clickOnCss("#menu-978 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Night & Thermal Vision Optics";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);

    }
    public void clickOnAudioVisual() {
        mouseHoverByCSS("#cat3644 > a > span");
        clickOnCss("#menu-3644 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Whiteboards & Easels";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);

    }

}