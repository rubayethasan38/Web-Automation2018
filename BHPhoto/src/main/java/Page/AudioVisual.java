package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class AudioVisual extends CommonAPI {
    @FindBy(css = "#cat3644 > a > span")
    public static WebElement AudioVisual;
    public void clickOnAudioVisualProjectors() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat3644 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat3644 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-3644\"]/div/div/div/ul/li[1]/a/div[1]");
        String expected = "Projectors";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnAudioVisualMultimediaProjectorScreens() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat3644 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat3644 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-3644\"]/div/div/div/ul/li[2]/a/div[1]");
        String expected = "Multimedia Projector Screens";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnAudioVisualCommercialMonitorsDisplays() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat3644 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat3644 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-3644\"]/div/div/div/ul/li[3]/a/div[1]");
        String expected = "Commercial Monitors & Displays";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnAudioVisualVideoPresentersAccessories() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat3644 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat3644 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-3644\"]/div/div/div/ul/li[4]/a/div[1]");
        String expected = "Video Presenters & Accessories";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnAudioVisualWhiteboardsEasels() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat3644 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat3644 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-3644\"]/div/div/div/ul/li[5]/a/div[1]");
        String expected = "Whiteboards & Easels";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
        Assert.assertEquals(actual, expected);
    }
}
