package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class ProAudio extends CommonAPI {
    @FindBy(xpath = "//a[@name='Top Nav-Audio Professional']")
    public static WebElement ProAudio;
    @FindBy(xpath = "//*[@id=\"menu-12154\"]/div/div/div/ul/li[1]/a/div[1]")
    public static WebElement Recording;
    @FindBy(xpath = "//*[@id=\"menu-12154\"]/div/div/div/ul/li[2]/a/div[1]")
    public static WebElement ComputerAudio;
    @FindBy(xpath = "//*[@id=\"menu-12154\"]/div/div/div/ul/li[3]/a/div[1]")
    public static WebElement LocationSound;
    @FindBy(xpath = "//*[@id=\"menu-12154\"]/div/div/div/ul/li[4]/a/div[1]")
    public static WebElement LiveSound;
    @FindBy(xpath = "//*[@id=\"menu-12154\"]/div/div/div/ul/li[5]/a/div[1]")
    public static WebElement Microphones;
    //methods
    public void clickOnProAudioProRecording() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-Audio Professional']"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-Audio Professional']");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-12154\"]/div/div/div/ul/li[1]/a/div[1]");
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
        clickByXpath("//*[@id=\"menu-12154\"]/div/div/div/ul/li[2]/a/div[1]");
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
        clickByXpath("//*[@id=\"menu-12154\"]/div/div/div/ul/li[3]/a/div[1]");
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
        clickByXpath("//*[@id=\"menu-12154\"]/div/div/div/ul/li[4]/a/div[1]");
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
        clickByXpath("//*[@id=\"menu-12154\"]/div/div/div/ul/li[5]/a/div[1]");
        String expected = "Microphones";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
        Assert.assertEquals(actual, expected);
    }
}
