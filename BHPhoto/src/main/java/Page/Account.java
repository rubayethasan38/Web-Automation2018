package Page;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class Account extends CommonAPI {
    @FindBy(css = "#js-login > span.twelve.login-msg")
    public static WebElement MyAccount;
    @FindBy(css = "#account-cart > div.cart-alert-tab.js-cart-alert-tab > div.account-notifications")
    public static WebElement LogInBox;
    @FindBy(xpath = "#my-account-guest-notification > div.login-buttons > a:nth-child(2) > button")
    public static WebElement LogIn;
    @FindBy(css = "//*[@id=\"user-input\"]")
    public static WebElement enterEmail;
    @FindBy(xpath = "//*[@id=\"password-input\"]")
    public static WebElement enterpassword;
    @FindBy(xpath = "//*[@id=\"onePopupLayer\"]/div[2]/div/div/div/div[1]/form/input[1]")
    public static WebElement submitlogin;
    // methods
    public void clickOnMyAccount() {
        mouseHoverByCSS("#cat989 > a:nth-child(1) > span");
        clickOnCss("#my-account-guest-notification > div.login-buttons > a:nth-child(2) > button");
        String expected = "Log in to Your Account";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    //
    public void loginpage() {
        LogIn.click();
    }

    public void setLogin() {
        LogIn.click();
        enterEmail.sendKeys("sameer1187@gmail.com");
        enterpassword.sendKeys("rmhssdakh2287");
    }
}