package Page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class ProAudio extends CommonAPI {
    @FindBy(xpath = "//a[@name='Top Nav-Audio Professional']")
    public static WebElement ProAudio;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[5]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]")
    public static WebElement Recording;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[5]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]")
    public static WebElement ComputerAudio;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[5]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]")
    public static WebElement LocationSound;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[5]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]")
    public static WebElement LiveSound;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[5]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]")
    public static WebElement Microphones;
    //methods
    Actions action = new Actions(webDriver);
    WebElement we = webDriver.findElement(By.xpath("html/body/div[13]/ul/li[4]/a"));
    public void clickOnProAudioProRecording() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Audio Professional']"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Audio Professional']");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[5]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]");
        String expected = "Pro Audio Recording";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioComputer() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Audio Professional']"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Audio Professional']");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[5]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]");
        String expected = "Computer Audio";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioLocationSoundAudioEquipment() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Audio Professional']"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Audio Professional']");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[5]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]");
        String expected = "Location Sound Audio Equipment";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioLiveSound() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Audio Professional']"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Audio Professional']");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[5]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]");
        String expected = "Live Sound";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnProAudioMicrophones() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Audio Professional']"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Audio Professional']");
        sleepFor(1);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[5]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]");
        String expected = "Microphones";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
}
