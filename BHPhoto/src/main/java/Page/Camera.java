package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class Camera extends CommonAPI {
    @FindBy(css = "#cat989 > a > span")
    public static WebElement Photography;
    @FindBy(css = "#cat1820 > a > span")
    public static WebElement Camcorders;
    @FindBy(css = "#cat3496 > a > span")
    public static WebElement Surveillance;
    //methods
    public void clickOnPhotographyDigitalCameraTypes() {
        mouseHoverByCSS("#cat989 > a:nth-child(1) > span");
        clickOnCss("#menu-989 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Digital Camera Types";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnPhotographyLenses() {
        mouseHoverByCSS("#cat989 > a:nth-child(1) > span");
        clickOnCss("#menu-989 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Lenses";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnPhotographyDrones() {
        mouseHoverByCSS("#cat989 > a:nth-child(1) > span");
        clickOnCss("#menu-989 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Drones & Aerial Imaging";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnPhotographyTripods() {
        mouseHoverByCSS("#cat989 > a:nth-child(1) > span");
        clickOnCss("#menu-989 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Photography Tripods & Support";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnPhotographyBags() {
        mouseHoverByCSS("#cat989 > a:nth-child(1) > span");
        clickOnCss("#menu-989 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Photography Bags & Cases";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnCamcordersVideo() {
        mouseHoverByCSS("#cat1820 > a > span");
        clickOnCss("#menu-1820 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Consumer Video Cameras";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnCamcordersActionCamerasAccessories() {
        mouseHoverByCSS("#cat1820 > a > span");
        clickOnCss("#menu-1820 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Action Cameras & Accessories";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnCamcordersProfessionalCamcorders() {
        mouseHoverByCSS("#cat1820 > a > span");
        clickOnCss("#menu-1820 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Professional Camcorders";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnCamcordersPALConsumerCamcorders() {
        mouseHoverByCSS("#cat1820 > a > span");
        clickOnCss("#menu-1820 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "PAL Consumer Camcorders (Non USA)";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnCamcordersDronesAerialImaging() {
        mouseHoverByCSS("#cat1820 > a > span");
        clickOnCss("#menu-1820 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Drones & Aerial Imaging\n";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnSurveillanceVideo() {
        mouseHoverByCSS("#cat3496 > a > span");
        clickOnCss("#menu-3496 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "SurveillanceVideo";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnSurveillanceWiFiWirelessCameras() {
        mouseHoverByCSS("#cat3496 > a > span");
        clickOnCss("#menu-3496 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "WiFi & Wireless Cameras";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnSurveillanceHiddenCameras() {
        mouseHoverByCSS("#cat3496 > a > span");
        clickOnCss("#menu-3496 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Hidden Cameras";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnSurveillanceBodyCamerasAccessories() {
        mouseHoverByCSS("#cat3496 > a > span");
        clickOnCss("#menu-3496 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Body Cameras & Accessories";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnSurveillanceIntercomSystems() {
        mouseHoverByCSS("#cat3496 > a > span");
        clickOnCss("#menu-3496 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Intercom";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
}
