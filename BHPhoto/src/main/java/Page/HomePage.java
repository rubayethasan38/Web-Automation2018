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
    public void clickOnComputersLaptops() {
        mouseHoverByCSS("##menu-9581 > a:nth-child(2) > span");
        clickOnCss("#menu-9581 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Laptops";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersMac() {
        mouseHoverByCSS("##menu-9581 > a:nth-child(2) > span");
        clickOnCss("#menu-9581 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Mac";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersiPadsMediaTablets() {
        mouseHoverByCSS("##menu-9581 > a:nth-child(2) > span");
        clickOnCss("#menu-9581 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "iPads & Media Tablets";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersDesktopsWorkstations() {
        mouseHoverByCSS("##menu-9581 > a:nth-child(2) > span");
        clickOnCss("#menu-9581 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Desktops & Workstations";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersComponents() {
        mouseHoverByCSS("##menu-9581 > a:nth-child(2) > span");
        clickOnCss("#menu-9581 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Computer Components";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
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
    public void clickOnLightingContinuousLighting() {
        mouseHoverByCSS("#cat1161 > a > span");
        clickOnCss("##menu-1161 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Continuous Lighting";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnLightingStrobeFlash() {
        mouseHoverByCSS("#cat1161 > a > span");
        clickOnCss("##menu-1161 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Strobe (Flash) Lighting\n";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnLightingFlashesOnCameraLights() {
        mouseHoverByCSS("#cat1161 > a > span");
        clickOnCss("##menu-1161 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Flashes & On Camera Lights";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnLightingLightModifiers() {
        mouseHoverByCSS("#cat1161 > a > span");
        clickOnCss("##menu-1161 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Light Modifiers";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioProRecording() {
        mouseHoverByCSS("#cat12154 > a > span");
        clickOnCss("#menu-12154 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Pro Audio Recording";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioComputer() {
        mouseHoverByCSS("#cat12154 > a > span");
        clickOnCss("#menu-12154 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Computer Audio";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioLocationSoundAudioEquipment() {
        mouseHoverByCSS("#cat12154 > a > span");
        clickOnCss("#menu-12154 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Location Sound Audio Equipment";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioLiveSound() {
        mouseHoverByCSS("#cat12154 > a > span");
        clickOnCss("#menu-12154 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Live Sound";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioMicrophones() {
        mouseHoverByCSS("#cat12154 > a > span");
        clickOnCss("#menu-12154 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Microphones";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnMobileUnlockedCellPhones() {
        mouseHoverByCSS("##cat8565 > a > span");
        clickOnCss("#menu-8565 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Unlocked Cell Phones";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnMobileiPadsMediaTablets() {
        mouseHoverByCSS("##cat8565 > a > span");
        clickOnCss("#menu-8565 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "iPads & Media Tablets";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnMobileWearableTechnology() {
        mouseHoverByCSS("##cat8565 > a > span");
        clickOnCss("#menu-8565 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Wearable Technology";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnMobileCellPhoneAccessories() {
        mouseHoverByCSS("##cat8565 > a > span");
        clickOnCss("#menu-8565 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Cell Phone Accessories";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnMobileTabletAccessories() {
        mouseHoverByCSS("##cat8565 > a > span");
        clickOnCss("#menu-8565 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Tablet Accessories";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentTelevisions() {
        mouseHoverByCSS("#cat4600 > a > span");
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Televisions";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentHomeTheaterProjectors() {
        mouseHoverByCSS("#cat4600 > a > span");
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Home Theater Projectors";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentBlurayDVDPlayers() {
        mouseHoverByCSS("#cat4600 > a > span");
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Blu-ray & DVD Players";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentStreamingMediaPlayers() {
        mouseHoverByCSS("#cat4600 > a > span");
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Streaming & Media Players";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentGaming() {
        mouseHoverByCSS("#cat4600 > a > span");
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Gaming";
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
    public void clickOnOpticsBinoculars() {
        mouseHoverByCSS("#cat978 > a > span");
        clickOnCss("#menu-978 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Binoculars";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsTelescopesAstronomy() {
        mouseHoverByCSS("#cat978 > a > span");
        clickOnCss("#menu-978 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Telescopes & Astronomy";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsSpottingScopesAccessories() {
        mouseHoverByCSS("#cat978 > a > span");
        clickOnCss("#menu-978 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Spotting Scopes & Accessories";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsRiflescopesAccessories() {
        mouseHoverByCSS("#cat978 > a > span");
        clickOnCss("#menu-978 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Riflescopes & Accessories";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsNightThermalVisionOptics() {
        mouseHoverByCSS("#cat978 > a > span");
        clickOnCss("#menu-978 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Night & Thermal Vision Optics";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnAudioVisualProjectors() {
        mouseHoverByCSS("#cat3644 > a > span");
        clickOnCss("#menu-3644 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Projectors";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnAudioVisualMultimediaProjectorScreens() {
        mouseHoverByCSS("#cat3644 > a > span");
        clickOnCss("#menu-3644 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Multimedia Projector Screens";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnAudioVisualCommercialMonitorsDisplays() {
        mouseHoverByCSS("#cat3644 > a > span");
        clickOnCss("#menu-3644 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Commercial Monitors & Displays";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnAudioVisualVideoPresentersAccessories() {
        mouseHoverByCSS("#cat3644 > a > span");
        clickOnCss("#menu-3644 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Video Presenters & Accessories";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnAudioVisualWhiteboardsEasels() {
        mouseHoverByCSS("#cat3644 > a > span");
        clickOnCss("#menu-3644 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Whiteboards & Easels";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }


}