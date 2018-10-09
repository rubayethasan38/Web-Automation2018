package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class Computer extends CommonAPI {
    @FindBy(css = "#cat9581 > a > span")
    public static WebElement Computers;
    public void clickOnComputersLaptops() {
        mouseHoverByCSS("##menu-9581 > a:nth-child(2) > span");
        clickOnCss("#menu-9581 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
        String expected = "Laptops";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersMac() {
        mouseHoverByCSS("##menu-9581 > a:nth-child(2) > span");
        clickOnCss("#menu-9581 > div > div > div > ul > li:nth-child(2) > a > div.category-image");
        String expected = "Mac";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersiPadsMediaTablets() {
        mouseHoverByCSS("##menu-9581 > a:nth-child(2) > span");
        clickOnCss("#menu-9581 > div > div > div > ul > li:nth-child(3) > a > div.category-image");
        String expected = "iPads & Media Tablets";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersDesktopsWorkstations() {
        mouseHoverByCSS("##menu-9581 > a:nth-child(2) > span");
        clickOnCss("#menu-9581 > div > div > div > ul > li:nth-child(4) > a > div.category-image");
        String expected = "Desktops & Workstations";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersComponents() {
        mouseHoverByCSS("##menu-9581 > a:nth-child(2) > span");
        clickOnCss("#menu-9581 > div > div > div > ul > li:nth-child(5) > a > div.category-image");
        String expected = "Computer Components";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
}
