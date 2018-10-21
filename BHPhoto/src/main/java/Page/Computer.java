package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
public class Computer extends CommonAPI {
    @FindBy(css = "#cat9581 > a > span")
    public static WebElement Computers;
    @FindBy(xpath = "//*[@id=\"menu-9581\"]/div/div/div/ul/li[1]/a/div[1]")
    public static WebElement Laptops;
    @FindBy(xpath = "//*[@id=\"menu-9581\"]/div/div/div/ul/li[2]/a/div[1]")
    public static WebElement Mac;
    @FindBy(xpath = "//*[@id=\"menu-9581\"]/div/div/div/ul/li[3]/a/div[1]")
    public static WebElement iPadsTablets;
    @FindBy(xpath = "//*[@id=\"menu-9581\"]/div/div/div/ul/li[4]/a/div[1]")
    public static WebElement DesktopsWorkstations;
    @FindBy(xpath = "//*[@id=\"menu-9581\"]/div/div/div/ul/li[5]/a/div[1]")
    public static WebElement ComputerComponents;
    //methods
    public void clickOnComputersLaptops() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
