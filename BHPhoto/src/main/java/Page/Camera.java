package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class Camera extends CommonAPI {
    @FindBy(xpath = "//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]")
    public static WebElement Photography;
    @FindBy(xpath = "//*[@id=\"menu-989\"]/div/div/div/ul/li[1]/a/div[1]")
    public static WebElement DigitalCameras;
    @FindBy(xpath = "//*[@id=\"menu-989\"]/div/div/div/ul/li[2]/a/div[1]")
    public static WebElement Lenses;
    @FindBy(xpath = "//*[@id=\"menu-989\"]/div/div/div/ul/li[3]/a/div[1]")
    public static WebElement DronesAerialImaging;
    @FindBy(xpath = "//*[@id=\"menu-989\"]/div/div/div/ul/li[4]/a/div[1]")
    public static WebElement TripodsSupport;
    @FindBy(xpath = "//*[@id=\"menu-989\"]/div/div/div/ul/li[5]/a/div[1]")
    public static WebElement PhotographyBagsCases;
    @FindBy(xpath = "//a[@name='Top Nav-Camcorders']//span[contains(text(),'Camcorders')]")
    public static WebElement Camcorders;
    @FindBy(xpath = "//*[@id=\"menu-1820\"]/div/div/div/ul/li[1]/a/div[1]")
    public static WebElement ConsumerCamcorders;
    @FindBy(xpath = "//*[@id=\"menu-1820\"]/div/div/div/ul/li[2]/a/div[1]")
    public static WebElement ActionCamerasAccessories;
    @FindBy(xpath = "//*[@id=\"menu-1820\"]/div/div/div/ul/li[3]/a/div[1]")
    public static WebElement ProfessionalCamcorders;
    @FindBy(xpath = "//*[@id=\"menu-1820\"]/div/div/div/ul/li[4]/a/div[1]")
    public static WebElement PALCamcorders;
    @FindBy(xpath = "//*[@id=\"menu-1820\"]/div/div/div/ul/li[5]/a/div[1]")
    public static WebElement DronesImaging;
    @FindBy(css = "//a[@name='Top Nav-Surveillance Video']//span[contains(text(),'Surveillance')]")
    public static WebElement Surveillance;
    @FindBy(xpath = "//*[@id=\"menu-3496\"]/div/div/div/ul/li[1]/a/div[1]")
    public static WebElement SurveillanceVideo;
    @FindBy(xpath = "//*[@id=\"menu-3496\"]/div/div/div/ul/li[2]/a/div[1]")
    public static WebElement WirelessCameras;
    @FindBy(xpath = "//*[@id=\"menu-3496\"]/div/div/div/ul/li[3]/a/div[1]")
    public static WebElement HiddenCameras;
    @FindBy(xpath = "//*[@id=\"menu-3496\"]/div/div/div/ul/li[4]/a/div[1]")
    public static WebElement BodyCameras;
    @FindBy(xpath = "//*[@id=\"menu-3496\"]/div/div/div/ul/li[5]/a/div[1]")
    public static WebElement Intercoms;
    //methods
    public void clickOnPhotographyDigitalCameraTypes() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-989\"]/div/div/div/ul/li[1]/a/div[1]");
        String expected = "Digital Camera Types";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnPhotographyLenses() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-989\"]/div/div/div/ul/li[2]/a/div[1]");
        String expected = "Lenses";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnPhotographyDrones() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-989\"]/div/div/div/ul/li[3]/a/div[1]");
        String expected = "Drones & Aerial Imaging";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnPhotographyTripods() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-989\"]/div/div/div/ul/li[4]/a/div[1]");
        String expected = "Photography Tripods & Support";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnPhotographyBags() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Digital Photography']//span[contains(text(),'Photography')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-989\"]/div/div/div/ul/li[4]/a/div[1]");
        String expected = "Photography Bags & Cases";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnCamcordersVideo() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Camcorders']//span[contains(text(),'Camcorders')]"));
        mouseHoverByXpath("//a[@name='Top Nav-Camcorders']//span[contains(text(),'Camcorders')]");
        clickByXpath("//*[@id=\"menu-1820\"]/div/div/div/ul/li[1]/a/div[1]");
        String expected = "Consumer Video Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnCamcordersActionCamerasAccessories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Camcorders']//span[contains(text(),'Camcorders')]"));
        sleepFor(1);
        mouseHoverByCSS("//a[@name='Top Nav-Camcorders']//span[contains(text(),'Camcorders')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-1820\"]/div/div/div/ul/li[2]/a/div[1]");
        String expected = "Action Cameras & Accessories";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnCamcordersProfessionalCamcorders() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Camcorders']//span[contains(text(),'Camcorders')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Camcorders']//span[contains(text(),'Camcorders')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-1820\"]/div/div/div/ul/li[2]/a/div[1]");
        String expected = "Professional Camcorders";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnCamcordersPALConsumerCamcorders() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Camcorders']//span[contains(text(),'Camcorders')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Camcorders']//span[contains(text(),'Camcorders')]");
        sleepFor(1);
        clickOnCss("//*[@id=\"menu-1820\"]/div/div/div/ul/li[2]/a/div[1]");
        String expected = "PAL Consumer Camcorders (Non USA)";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnCamcordersDronesAerialImaging() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Camcorders']//span[contains(text(),'Camcorders')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Camcorders']//span[contains(text(),'Camcorders')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-1820\"]/div/div/div/ul/li[5]/a/div[1]");
        String expected = "Drones & Aerial Imaging\n";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnSurveillanceVideo() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Surveillance Video']//span[contains(text(),'Surveillance')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Surveillance Video']//span[contains(text(),'Surveillance')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-3496\"]/div/div/div/ul/li[1]/a/div[1]");
        String expected = "SurveillanceVideo";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnSurveillanceWiFiWirelessCameras() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Surveillance Video']//span[contains(text(),'Surveillance')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Surveillance Video']//span[contains(text(),'Surveillance')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-3496\"]/div/div/div/ul/li[2]/a/div[1]");
        String expected = "WiFi & Wireless Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnSurveillanceHiddenCameras() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Surveillance Video']//span[contains(text(),'Surveillance')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Surveillance Video']//span[contains(text(),'Surveillance')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-3496\"]/div/div/div/ul/li[3]/a/div[1]");
        String expected = "Hidden Cameras";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnSurveillanceBodyCamerasAccessories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Surveillance Video']//span[contains(text(),'Surveillance')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Surveillance Video']//span[contains(text(),'Surveillance')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-3496\"]/div/div/div/ul/li[4]/a/div[1]");
        String expected = "Body Cameras & Accessories";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnSurveillanceIntercomSystems() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Surveillance Video']//span[contains(text(),'Surveillance')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Surveillance Video']//span[contains(text(),'Surveillance')]");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-3496\"]/div/div/div/ul/li[5]/a/div[1]");
        String expected = "Intercom";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
}
