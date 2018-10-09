package Page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Mobile extends CommonAPI {
    @FindBy(css = "#cat8565 > a > span")
    public static WebElement Mobile;
    //methods
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
}
