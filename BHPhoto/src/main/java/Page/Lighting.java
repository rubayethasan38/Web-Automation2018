package Page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Lighting extends CommonAPI {
    @FindBy(css = "#cat1161 > a > span")
    public static WebElement Lighting;
    public void clickOnLightingContinuousLighting() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat1161 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat1161 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-1161\"]/div/div/div/ul/li[1]/a/div[1]");
        String expected = "Continuous Lighting";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3)")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnLightingStrobeFlash() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat1161 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat1161 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-1161\"]/div/div/div/ul/li[2]/a/div[1]");
        String expected = "Strobe (Flash) Lighting";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnLightingFlashesOnCameraLights() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat1161 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat1161 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-1161\"]/div/div/div/ul/li[3]/a/div[1]");
        String expected = "Flashes & On Camera Lights";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnLightingLightModifiers() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat1161 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat1161 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-1161\"]/div/div/div/ul/li[4]/a/div[1]");
        String expected = "Light Modifiers";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
}
