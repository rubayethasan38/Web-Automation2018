package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class Lighting extends CommonAPI {
    @FindBy(css = "#cat1161 > a > span")
    public static WebElement Lighting;
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
}
