package Page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Computer extends CommonAPI {
    @FindBy(css = "#cat9581 > a > span")
    public static WebElement Computers;
    public void clickOnComputersLaptops() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat9581 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat9581 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-9581\"]/div/div/div/ul/li[1]/a/div[1]");
        String expected = "Laptops";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersMac() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat9581 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat9581 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-9581\"]/div/div/div/ul/li[2]/a/div[1]]");
        String expected = "Mac";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersiPadsMediaTablets() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat9581 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat9581 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-9581\"]/div/div/div/ul/li[3]/a/div[1]");
        String expected = "iPads & Media Tablets";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3)")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersDesktopsWorkstations() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat9581 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat9581 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-9581\"]/div/div/div/ul/li[4]/a/div[1]");
        String expected = "Desktops & Workstations";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3) > a")).getText();
        Assert.assertEquals(actual, expected);
    }
    public void clickOnComputersComponents() throws InterruptedException {
        waitUntilClickAble(By.cssSelector("#cat9581 > a > span"));
        sleepFor(1);
        mouseHoverByCSS("#cat9581 > a > span");
        sleepFor(1);
        clickByXpath("//*[@id=\"menu-9581\"]/div/div/div/ul/li[5]/a/div[1]");
        String expected = "Computer Components";
        sleepFor(3);
        String actual = webDriver.findElement(By.cssSelector("#breadcrumbs > li:nth-child(3)")).getText();
        Assert.assertEquals(actual, expected);
    }
}
