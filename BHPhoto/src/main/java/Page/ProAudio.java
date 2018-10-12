package Page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProAudio extends CommonAPI {
    @FindBy(css = "#cat12154 > a > span")
    public static WebElement ProAudio;
    public void clickOnProAudioProRecording() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat12154 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat12154 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-12154\"]/div/div/div/ul/li[1]/a/div[1]");
        String expected = "Pro Audio Recording";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioComputer() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat12154 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat12154 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-12154\"]/div/div/div/ul/li[2]/a/div[1]");
        String expected = "Computer Audio";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioLocationSoundAudioEquipment() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat12154 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat12154 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-12154\"]/div/div/div/ul/li[3]/a/div[1]");
        String expected = "Location Sound Audio Equipment";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioLiveSound() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat12154 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat12154 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-12154\"]/div/div/div/ul/li[4]/a/div[1]");
        String expected = "Live Sound";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioMicrophones() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat12154 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat12154 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-12154\"]/div/div/div/ul/li[5]/a/div[1]");
        String expected = "Microphones";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
}
