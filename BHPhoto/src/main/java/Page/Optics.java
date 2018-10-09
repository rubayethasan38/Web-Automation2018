package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class Optics extends CommonAPI {
    @FindBy(css = "#cat978 > a > span")
    public static WebElement Optics;
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
}
