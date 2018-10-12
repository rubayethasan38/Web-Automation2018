package Page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Optics extends CommonAPI {
    @FindBy(css = "#cat978 > a > span")
    public static WebElement Optics;
    public void clickOnOpticsBinoculars() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat978 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat978 > a > span");
        sleepFor(1);
        clickByXpath("#menu-978 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Binoculars";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsTelescopesAstronomy() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat978 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat978 > a > span");
        sleepFor(1);
        clickByXpath("#menu-978 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Telescopes & Astronomy";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsSpottingScopesAccessories() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat978 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat978 > a > span");
        sleepFor(1);
        clickByXpath("#menu-978 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Spotting Scopes & Accessories";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsRiflescopesAccessories() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat978 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat978 > a > span");
        sleepFor(1);
        clickByXpath("#menu-978 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Riflescopes & Accessories";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnOpticsNightThermalVisionOptics() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat978 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat978 > a > span");
        sleepFor(1);
        clickByXpath("#menu-978 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Night & Thermal Vision Optics";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
}
