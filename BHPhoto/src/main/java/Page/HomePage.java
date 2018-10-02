package Page;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {
    @FindBy(id = "top-search-input")
    public static WebElement searchBoxButton;
    @FindBy(id = "submit")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"cat989\"]/a")
    public static WebElement Photography;
    @FindBy(xpath = "//*[@id=\"cat9581\"]/a[1]")
    public static WebElement Computers;
    @FindBy(xpath = "//*[@id=\"cat3755\"]/a")
    public static WebElement ProVideo;
    @FindBy(xpath = "//*[@id=\"cat1161\"]/a")
    public static WebElement Lighting;
    @FindBy(xpath = "//*[@id='container']/div[1]//div[4]/div//li[5]/a")
    public static WebElement specialOfferTab;
    @FindBy(xpath = "//*[@id='container']/div[1]//div[4]//li[6]/a")
    public static WebElement localAdTab;
    @FindBy(xpath = "//div[text()='My Account']")
    public static WebElement myAcctButton;
    @FindBy(xpath = "//*[@id=\'authSignIn\']/a/span")
    public static WebElement signinLink;
    @FindBy(id = "email_id")
    public static WebElement emailBox;

    //T3HOM_HP_TC01 check if the search button is displayed
    public static boolean isSearchButtonDisplay() {
        boolean disp = searchBoxButton.isDisplayed();
        return disp;
    }

    //T3HOM_HP_TC02 Go to Appliance link in All departments tab and get title of the page
    public static String goToAppliances() {
        allDepartmentTab.click();
        implicitWait(driver, 30);
        appliancesLink.click();
        String str = WebDriver.getTitle();
        return str;
    }

    //T3HOM_HP_TC03 hover over All Department tab and click 1st item and navigate back to home page
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

    //T3HOM_HP_TC04, T3HOM_HP_TC06 Go to Bathroom image link under Shop Room tab and get title of the page
    public static String goToBathroomUsingImg() {
        shopRoomTab.click();
        implicitWait(driver, 35);
        bathroomImgLink.click();
        implicitWait(driver, 35);
        String imgLinkTitle = driver.getTitle();
        return imgLinkTitle;
    }

    //T3HOM_HP_TC05, T3HOM_HP_TC06 Go to Bathroom text link under Shop Room tab and get title of the page
    public static String goToBathroomUsingTxt() {
        shopRoomTab.click();
        implicitWait(WebDriver, 35);
        bathroomTextLink.click();
        implicitWait(WebDriver, 30);
        String textLinkTitle = WebDriver.getTitle();
        return textLinkTitle;
    }

    //T3HOM_HP_TC07 capture the text of hero image
    public static String captureTextHeroImage() {
        String text = heroImage.getAttribute("title");
        return text;
    }

    //T3HOM_SR_TC01, T3HOM_SR_TC02, T3HOM_SR_TC03, T3HOM_SR_TC04, T3HOM_SR_TC05, T3HOM_SR_TC06,
    // T3HOM_SR_TC07, T3HOM_SR_TC08, T3HOM_SR_TC09, T3HOM_SR_TC10 shows Search product- 'floor tiles'
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

