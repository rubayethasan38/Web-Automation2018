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
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[7]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]")
    public static WebElement Televisions;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[7]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]")
    public static WebElement HomeTheaterProjectors;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[7]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]")
    public static WebElement BlurayDVDPlayers;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[7]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]")
    public static WebElement StreamingMediaPlayers;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[7]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]")
    public static WebElement Gaming;
    //methods
    public void clickOnTVEntertainmentTelevisions() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitUntilClickAble(By.xpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]"));
        sleepFor(1);
        mouseHoverByXpath("//a[@name='Top Nav-TVs & Home Entertainment']//span[contains(text(),'TVs & Entertainment')]");
        sleepFor(2);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[7]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]");
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
        sleepFor(2);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[7]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]");
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
        sleepFor(2);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[7]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]");
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
        sleepFor(2);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[7]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]");
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
        sleepFor(2);
        clickByXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/section[3]/div[1]/ul[1]/li[7]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]");
        String expected = "Gaming";
        sleepFor(3);
        String actual = webDriver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[3]/a")).getText();
        Assert.assertEquals(actual, expected);
    }
}
