package Page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    public static WebElement Photography;
    @FindBy(css = "#cat989 > a > span")
    public static WebElement Computers;
    @FindBy(css = "#cat9581 > a > span")
    public static WebElement ProVideo;
    @FindBy(css = "#cat3755 > a > span")
    public static WebElement Lighting;
    @FindBy(css = "#cat1161 > a > span")
    public static WebElement ProAudio;
    @FindBy(css = "#cat12154 > a > span")
    public static WebElement Mobile;
    public static WebElement TVEntertainment;
    @FindBy(css = "#cat4600 > a > span")
    public static WebElement Camcorders;
    @FindBy(css = "#cat1820 > a > span")
    public static WebElement Surveillance;
    @FindBy(css = "#cat3496 > a > span")
    public static WebElement Optics;
    @FindBy(css = "#cat978 > a > span")
    public static WebElement AudioVisual;
    //@FindBy(css = "#menu-989 > div > div > div > ul > li:nth-child(1) > a > div.category-image")

    //methods

public void clickOnPhotography(){
    mouseHoverByCSS("#cat989 > a:nth-child(1) > span");
    clickOnCss("#menu-989 > div > div > div > ul > li:nth-child(1) > a > div.category-image");
    String expected = "Digital Camera Types";
    String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
    Assert.assertEquals(actual,expected);
}

    }