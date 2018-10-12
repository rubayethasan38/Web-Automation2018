package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TVEntertainment extends CommonAPI {
    @FindBy(css = "#cat4600 > a > span")
    public static WebElement TVEntertainment;
    //methods
    public void clickOnTVEntertainmentTelevisions() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat4600 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat4600 > a > span");
        sleepFor(1);
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Televisions";
        sleepFor(3);
        String actual = webDriver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[3]/a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentHomeTheaterProjectors() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat4600 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat4600 > a > span");
        sleepFor(1);
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Home Theater Projectors";
        sleepFor(3);
        String actual = webDriver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[4]/a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentBlurayDVDPlayers() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat4600 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat4600 > a > span");
        sleepFor(1);
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "Blu-ray & DVD Players";
        sleepFor(3);
        String actual = webDriver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[3]/a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentStreamingMediaPlayers() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat4600 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat4600 > a > span");
        sleepFor(1);
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Streaming & Media Players";
        sleepFor(3);
        String actual = webDriver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[3]/a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentGaming() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat4600 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat4600 > a > span");
        sleepFor(1);
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Gaming";
        sleepFor(3);
        String actual = webDriver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/li[3]/a")).getText();
        Assert.assertEquals(actual, expected);
    }
}
