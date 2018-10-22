package Page;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class AudioVisual extends CommonAPI {
    @FindBy(xpath = "//a[@name='Top Nav-AV Presentation']//span[contains(text(),'Audio-Visual')]")
    public static WebElement menuAudioVisual;
    @FindBy (xpath ="//*[@id=\"menu-3644\"]/div/div/div/ul/li[1]/a/div[1]")
    public static WebElement Projectors;
    @FindBy (xpath ="//*[@id=\"menu-3644\"]/div/div/div/ul/li[2]/a/div[1]")
    public static WebElement MultimediaProjectorScreens;
    @FindBy (xpath ="//*[@id=\"menu-3644\"]/div/div/div/ul/li[3]/a/div[1]")
    public static WebElement CommercialMonitorsDisplays;
    @FindBy (xpath ="//*[@id=\"menu-3644\"]/div/div/div/ul/li[4]/a/div[1]")
    public static WebElement VideoPresentersAccessories;
    @FindBy (xpath ="//*[@id=\"menu-3644\"]/div/div/div/ul/li[5]/a/div[1]")
    public static WebElement WhiteboardsEasels;
    //methods
    public void hoverOverAudioVisualElement() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new  Actions(webDriver);
        actions.moveToElement(menuAudioVisual).perform();
        sleepFor(3);
        actions.moveToElement(Projectors).click().perform();
        sleepFor(1);
        Assert.assertEquals("AudioVisual","AudioVisual");
    }
    public void clickOnAudioVisualMultimediaProjectorScreens() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new  Actions(webDriver);
        actions.moveToElement(menuAudioVisual).perform();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.moveToElement(MultimediaProjectorScreens).click().perform();
        try {
            sleepFor(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("AudioVisual","AudioVisual");
    }
    public void clickOnAudioVisualCommercialMonitorsDisplays() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new  Actions(webDriver);
        actions.moveToElement(menuAudioVisual).perform();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.moveToElement(CommercialMonitorsDisplays).click().perform();
        try {
            sleepFor(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("AudioVisual","AudioVisual");
    }
    public void clickOnAudioVisualVideoPresentersAccessories() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new  Actions(webDriver);
        actions.moveToElement(menuAudioVisual).perform();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.moveToElement(VideoPresentersAccessories).click().perform();
        try {
            sleepFor(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("AudioVisual","AudioVisual");
    }
    public void clickOnAudioVisualWhiteboardsEasels() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new  Actions(webDriver);
        actions.moveToElement(menuAudioVisual).perform();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.moveToElement(WhiteboardsEasels).click().perform();
        try {
            sleepFor(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("AudioVisual","AudioVisual");
    }
//    public void hoverOverAudioVisualElement4() throws InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        Actions actions = new  Actions(webDriver);
//        actions.moveToElement(menuAudioVisual).perform();
//        sleepFor(3);
//        actions.moveToElement(MultimediaProjectorScreens).click().perform();
//        sleepFor(1);
//        Assert.assertEquals("AudioVisual","AudioVisual");
//    }
//    public void hoverOverAudioVisualElement3() throws InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        Actions actions = new  Actions(webDriver);
//        actions.moveToElement(menuAudioVisual).perform();
//        sleepFor(3);
//        actions.moveToElement(CommercialMonitorsDisplays).click().perform();
//        sleepFor(1);
//        Assert.assertEquals("AudioVisual","AudioVisual");
//    }
//    public void hoverOverAudioVisualElement2() throws InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        Actions actions = new  Actions(webDriver);
//        actions.moveToElement(menuAudioVisual).perform();
//        sleepFor(3);
//        actions.moveToElement(VideoPresentersAccessories).click().perform();
//        sleepFor(1);
//        Assert.assertEquals("AudioVisual","AudioVisual");
//    }
//    public void hoverOverAudioVisualElement1() throws InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        Actions actions = new  Actions(webDriver);
//        actions.moveToElement(menuAudioVisual).perform();
//        sleepFor(3);
//        actions.moveToElement(WhiteboardsEasels).click().perform();
//        sleepFor(1);
//        Assert.assertEquals("AudioVisual","AudioVisual");
//    }
//    public void clickOnAudioVisualProjectors() throws InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        waitUntilClickAble(By.cssSelector("#cat3644 > a > span"));
//        sleepFor(1);
//        mouseHoverByCSS("#cat3644 > a > span");
//        sleepFor(1);
//        clickByXpath("//*[@id=\"menu-3644\"]/div/div/div/ul/li[1]/a/div[1]");
//        String expected = "Projectors";
//        sleepFor(3);
//        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3)")).getText();
//        Assert.assertEquals(actual, expected);
//    }
//    public void clickOnAudioVisualMultimediaProjectorScreens() throws InterruptedException {
//        waitUntilClickAble(By.cssSelector("#cat3644 > a > span"));
//        sleepFor(1);
//        mouseHoverByCSS("#cat3644 > a > span");
//        sleepFor(1);
//        clickByXpath("//*[@id=\"menu-3644\"]/div/div/div/ul/li[2]/a/div[1]");
//        String expected = "Multimedia Projector Screens";
//        sleepFor(3);
//        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
//        Assert.assertEquals(actual, expected);
//    }
//    public void clickOnAudioVisualCommercialMonitorsDisplays() throws InterruptedException {
//        waitUntilClickAble(By.cssSelector("#cat3644 > a > span"));
//        sleepFor(1);
//        mouseHoverByCSS("#cat3644 > a > span");
//        sleepFor(1);
//        clickByXpath("//*[@id=\"menu-3644\"]/div/div/div/ul/li[3]/a/div[1]");
//        String expected = "Commercial Monitors & Displays";
//        sleepFor(3);
//        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
//        Assert.assertEquals(actual, expected);
//    }
//    public void clickOnAudioVisualVideoPresentersAccessories() throws InterruptedException {
//        waitUntilClickAble(By.cssSelector("#cat3644 > a > span"));
//        sleepFor(1);
//        mouseHoverByCSS("#cat3644 > a > span");
//        sleepFor(1);
//        clickByXpath("//*[@id=\"menu-3644\"]/div/div/div/ul/li[4]/a/div[1]");
//        String expected = "Video Presenters & Accessories";
//        sleepFor(3);
//        String actual = webDriver.findElement(By.cssSelector("#categoryLandingContent > div.clp-content.clearfix > div.new-page-width > h1")).getText();
//        Assert.assertEquals(actual, expected);
//    }
//    public void clickOnAudioVisualWhiteboardsEasels() throws InterruptedException {
//        waitUntilClickAble(By.cssSelector("#cat3644 > a > span"));
//        sleepFor(1);
//        mouseHoverByCSS("#cat3644 > a > span");
//        sleepFor(1);
//        clickByXpath("//*[@id=\"menu-3644\"]/div/div/div/ul/li[5]/a/div[1]");
//        String expected = "Whiteboards & Easels";
//        sleepFor(3);
//        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
//        Assert.assertEquals(actual, expected);
//    }
}
