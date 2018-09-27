package TestClass;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Browse extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"chrome-sticky-header\"]/div[1]/div/ul[1]/li[2]/a")
    public static WebElement clickMen;
    @FindBy(xpath = "//*[@id=\"chrome-sticky-header\"]/div[2]/div[2]/nav/div/div[1]/button[5]/span/span")
    public static WebElement expandActivewear;
    @FindBy(xpath = "/html/body/section[1]/article/a/header/div[2]/div")
    public static WebElement clickSalesbanner;
    @FindBy(xpath = "///*[@id=\"product-10356801\"]/a/div[1]/img")
    public static WebElement gotoJacket;
    @FindBy(xpath = "//*[@id=\"product-details\"]/div/div[4]/div/a[1]")
    public static WebElement moreDetails;
    @FindBy(xpath = "//*[@id=\"globalBannerComponent\"]/div/div[1]/a[1]")
    public static WebElement clickWomen;
    @FindBy(xpath = "//*[@id=\"product-9509915\"]/a/div[1]/img")
    public static WebElement clickJacket;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[2]/a/img")
    public static WebElement nextImage;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[3]/a/img")
    public static WebElement nextImage1;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[4]/a/img")
    public static WebElement nextImage2;
    @FindBy(xpath = "//*[@id=\"product-add\"]/div/a/span[2]")
    public static WebElement addCart;
    @FindBy(xpath = "//*[@id=\"chrome-sticky-header\"]/div[1]/div/ul[2]/li[3]/a")
    public static WebElement gotoCart;
    @FindBy(xpath = "//*[@id=\"chrome-sticky-header\"]/div[1]/div/a")
    public static WebElement goHome;
    @FindBy(xpath = "/html/body/section[3]/article[1]/div[2]/div[3]/a/span")
    public static WebElement shopFall;
    @FindBy(xpath = "//*[@id=\"product-9644710\"]/a/div[1]/img")
    public static WebElement shopShoe;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[2]/a/img")
    public static WebElement gotoImage;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[3]/a/img")
    public static WebElement gotoImage1;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[4]/a/img")
    public static WebElement gotoImage2;
    @FindBy(xpath = "//*[@id=\"bc2\"]/a")
    public static WebElement goback;
    @FindBy(xpath = "/html/body/section[3]/article[2]/div[2]/div[3]/a")
    public static WebElement gotoShoes;
    @FindBy(css = "//*[@id=\"product-10119771\"]/a/div[1]/img")
    public static WebElement gotoproduct;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[2]/a/img")
    public static WebElement viewImage;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[3]/a/img")
    public static WebElement viewImage1;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[4]/a/img")
    public static WebElement viewImage2;
    @FindBy(xpath = "//*[@id=\"lower-content\"]/div[2]/section/div/ul/li[2]/a")
    public static WebElement nextPanel;
    @FindBy(xpath = "//*[@id=\"lower-content\"]/div[2]/section/div/ul/li[3]/a")
    public static WebElement nextPanel1;
    @FindBy(linkText = "//*[@id=\"lower-content\"]/div[2]/section/div/ul/li[4]/a")
    public static WebElement nextPanel2;
    @FindBy(xpath = "//*[@id=\"lower-content\"]/div[2]/section/div/div/div/div/div[2]/ul/li[4]/a/div/img")
    public static WebElement nextProduct;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[2]/a/img")
    public static WebElement viewnextImage;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[3]/a/img")
    public static WebElement viewnextImage1;
    @FindBy(xpath = "//*[@id=\"gallery-content\"]/div[2]/div[2]/ul/li[4]/a/img")
    public static WebElement viewnextImage2;
    @FindBy(xpath = "//*[@id=\"product-10158660\"]/a/div[1]/img")
    public static WebElement gotoBag;
    @FindBy(xpath = "//*[@id=\"lower-content\"]/div[2]/section/div/div/div/div/div[2]/ul/li[1]/a/div/img")
    public static WebElement nextBag;
    @FindBy(xpath = "//*[@id=\"lower-content\"]/div[2]/section/div/div/div/div/div[2]/ul/li[1]/a/div/img")
    public static WebElement nnextProduct;
    @FindBy(xpath = "//*[@id=\"lower-content\"]/div[2]/section/div/div/div/div/div[2]/ul/li[1]/a/div/img")
    public static WebElement nextProduct1;
    @FindBy(xpath = "//*[@id=\"lower-content\"]/div[2]/section/div/div/div/div/div[2]/ul/li[2]/a/div/img")
    public static WebElement nextProduct2;
    @FindBy(xpath = "//*[@id=\"lower-content\"]/div[2]/section/div/div/div/div/div[2]/ul/li[4]/a/div/img")
    public static WebElement nextProduct3;
    @FindBy(xpath = "//*[@id=\"chrome-header\"]/header/div[2]/div/ul/li[2]/a")
    public static WebElement customerService;
    @FindBy(tagName = "a")
    public List<WebElement> anchorTag = new ArrayList<>();

    public void clickWomenTest(){
        clickWomen.click();
    }

}

