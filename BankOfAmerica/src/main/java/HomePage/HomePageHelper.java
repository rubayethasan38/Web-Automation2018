package HomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageHelper extends CommonAPI {

    @FindBy(css = "#nav-search-query") public static WebElement SearhBox;
    @FindBy(xpath = "//*[@id=\"NAV_EN_ES\"]") public static WebElement SpanishSite;
    @FindBy(css = "#NAV_CONTACT_US") public static WebElement ContactUs;
    @FindBy(css = "#NAV_HELP") public static WebElement Help;
    @FindBy(css = "#NAV_BUSINESS_ADVANTAGE") public static WebElement SmallBussiness;
    @FindBy(css = "#NAV_WEALTH_MANAGEMENT") public static WebElement WealthManagement;
    @FindBy(css = "#NAV_BUSINESS_INSTITUTIONS") public static WebElement BussinessAndInstitutions;
    @FindBy(css = "#NAV_ABOUT_US") public static WebElement AboutUs;
    @FindBy(css ="#onlineId1") public static WebElement SignInInputBox;
    @FindBy(css = "#passcode1") public static WebElement PasswordInputBox;
    @FindBy(xpath = "//*[@id=\"signIn\"]/span[1]") public static WebElement SignInButton;

    public void searchBox(){
        SearhBox.sendKeys("ATM near me ", Keys.ENTER);
    }
    public void changeLenguage(){
        SpanishSite.click();
    }
    public void contactUs(){
        ContactUs.click();
    }
    public void help(){
        Help.click();
    }
    public void smallBussiness(){
        SmallBussiness.click();
    }
    public void wealthManagement(){
        WealthManagement.click();
    }
    public void bussinessAI(){
        BussinessAndInstitutions.click();
    }
    public void aboutUs(){
        AboutUs.click();
    }
    public void signIn(){
    SignInInputBox.sendKeys("selenium123123");
    PasswordInputBox.sendKeys("ddeddeefe");
    SignInButton.click();
    }
}
