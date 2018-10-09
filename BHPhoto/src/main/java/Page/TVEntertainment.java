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
    public void clickOnTVEntertainmentTelevisions() {
        mouseHoverByCSS("#cat4600 > a > span");
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Televisions";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentHomeTheaterProjectors() {
        mouseHoverByCSS("#cat4600 > a > span");
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Home Theater Projectors";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentBlurayDVDPlayers() {
        mouseHoverByCSS("#cat4600 > a > span");
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Blu-ray & DVD Players";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentStreamingMediaPlayers() {
        mouseHoverByCSS("#cat4600 > a > span");
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Streaming & Media Players";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnTVEntertainmentGaming() {
        mouseHoverByCSS("#cat4600 > a > span");
        clickOnCss("#menu-4600 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Gaming";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
}
