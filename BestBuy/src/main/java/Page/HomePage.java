package Page;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {
    @FindBy(id = "headerSearchButton")
    public static WebElement searchBoxButton;
    @FindBy(id = "headerSearch")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"menu0\"]")
    public static WebElement ProductsTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/nav[1]/ul/li[2]")
    public static WebElement BrandsTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/nav[1]/ul/li[3]")
    public static WebElement DealsTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/nav[1]/ul/li[4]")
    public static WebElement ServicesTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[1]/nav/ul/li[1]/a")
    public static WebElement WeeklyAdTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[1]/nav/ul/li[2]/a")
    public static WebElement DealOfTheDayTab;
    @FindBy(xpath="//*[@id=\"header\"]/div[1]/div[1]/nav/ul/li[3]/a")
    public static WebElement CreditCardsTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[1]/nav/ul/li[4]/a")
    public static WebElement GiftCardsTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[1]/nav/ul/li[5]/a")
    public static WebElement GiftIdeasRegistryTab;
    @FindBy(xpath = "//*[@id=\"hf_listsMenuLink\"]")
    public static WebElement SavedItemsTab;
    @FindBy(xpath = "//*[@id='container']/div[2]/div[3]/div[1]/div//a/img")
    public static WebElement heroImage;
    @FindBy(xpath = "//*[@id=\"hf_accountMenuLink\"]")
    public static WebElement AccountButton;
    @FindBy(xpath = "//*[@id=\'authSignIn\']/a/span")
    public static WebElement signinLink;
    @FindBy(id = "email_id")
    public static WebElement emailBox;

    public static boolean isSearchButtonDisplay() {
        boolean disp = searchBoxButton.isDisplayed();
        return disp;
    }
    public static String goToAppliances(){
        allDepartmentTab.click();
        implicitWait(WebDriver, 30);
        appliancesLink.click();
        String str = WebDriver.getTitle();
        return str;
    }
    public static String returnBackAllDept() {
        allDepartmentTab.click();
        WebDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        appliancesLink.click();
        System.out.println("Title of the page: " + WebDriver.getTitle());
        WebDriver.navigate().back();
        WebDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String title = WebDriver.getTitle();
        System.out.println("Title of the page: " + title);
        return title;
    }
    public static String goToBathroomUsingImg() {
        shopRoomTab.click();
        implicitWait(WebDriver, 35);
        implicitWait(WebDriver, 35);
        bathroomImgLink.click();
        String imgLinkTitle = WebDriver.getTitle();
        return imgLinkTitle;
    }
    public static String goToBathroomUsingTxt() {
        shopRoomTab.click();
        implicitWait(WebDriver, 35);
        bathroomTextLink.click();
        implicitWait(WebDriver, 30);
        String textLinkTitle = WebDriver.getTitle();
        return textLinkTitle;
    }
    public static String captureTextHeroImage() {
        String text = heroImage.getAttribute("title");
        return text;
    }

    public static void goToSearchProductPage() {

        searchBox.sendKeys("floor tiles", Keys.ENTER);
    }
    //Go to Login Page
    public static void goToLoginPage() {
        myAcctButton.click();
        for (String handle : WebDriver.getWindowHandles()) {
            WebDriver.switchTo().window(handle);
        }
        new WebDriverWait(WebDriver, 50).until(ExpectedConditions.elementToBeClickable(signinLink));
        signinLink.click();
    }
}
}
