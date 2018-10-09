package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class ProAudio extends CommonAPI {
    @FindBy(css = "#cat12154 > a > span")
    public static WebElement ProAudio;
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
}
