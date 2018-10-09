package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class AudioVisual extends CommonAPI {
    @FindBy(css = "#cat3644 > a > span")
    public static WebElement AudioVisual;
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
