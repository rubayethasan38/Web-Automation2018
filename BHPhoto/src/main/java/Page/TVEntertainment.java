package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class TVEntertainment extends CommonAPI {
    @FindBy(xpath = "//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]")
    public static WebElement TVEntertainment;
    @FindBy(xpath = "//*[@id=\"menu-4600\"]/div/div/div/ul/li[1]/a/div[1]")
    public static WebElement Televisions;
    @FindBy(xpath = "//*[@id=\"menu-4600\"]/div/div/div/ul/li[2]/a/div[1]")
    public static WebElement HomeTheaterProjectors;
    @FindBy(xpath = "//*[@id=\"menu-4600\"]/div/div/div/ul/li[3]/a/div[1]")
    public static WebElement BlurayDVDPlayers;
    @FindBy(xpath = "//*[@id=\"menu-4600\"]/div/div/div/ul/li[4]/a/div[1]")
    public static WebElement StreamingMediaPlayers;
    @FindBy(xpath = "//*[@id=\"menu-4600\"]/div/div/div/ul/li[5]/a/div[1]")
    public static WebElement Gaming;
    //methods
    public void clickOnTVEntertainmentTelevisions() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]");
        sleepFor(1);
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Televisions";
        sleepFor(3);
        String actual = webDriver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[3]/a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentHomeTheaterProjectors() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]");
        sleepFor(1);
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Home Theater Projectors";
        sleepFor(3);
        String actual = webDriver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[4]/a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentBlurayDVDPlayers() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]");
        sleepFor(1);
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Blu-ray & DVD Players";
        sleepFor(3);
        String actual = webDriver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[3]/a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentStreamingMediaPlayers() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]");
        sleepFor(1);
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Streaming & Media Players";
        sleepFor(3);
        String actual = webDriver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[3]/a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentGaming() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]");
        sleepFor(1);
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Gaming";
        sleepFor(3);
        String actual = webDriver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[3]/a")).getText();
        Assert.assertEquals(actual, expected);
    }
}
