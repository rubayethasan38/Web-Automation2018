package LogIn;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class Account extends CommonAPI {
    @FindBy (xpath= "//*[@id=\"js-login\"]/span[3]")
    public static WebElement MyAccount;
    @FindBy(css = "#account-cart > div.cart-alert-tab.js-cart-alert-tab > div.account-notifications")
    public static WebElement LogInBox;
    @FindBy(xpath = "//*[@id=\"my-account-guest-notification\"]/div[1]/a[1]/button")
    public static WebElement LogIn;
    @FindBy(xpath = "//*[@id=\"user-input\"]")
    public static WebElement enterEmail;
    @FindBy(xpath = "//*[@id=\"password-input\"]")
    public static WebElement enterPassword;
    @FindBy(xpath = "//*[@id=\"onePopupLayer\"]/div[2]/div/div/div/div[1]/form/input[1]")
    public static WebElement clickLogin;
    // methods
    public void clickOnMyAccount() {
        waitUntilClickAble(By.cssSelector("#js-login > span.bold.myaccount-header"));
        mouseHoverByCSS("#js-login > span.bold.myaccount-header");
        clickOnCss("#my-account-guest-notification > div.login-buttons > a:nth-child(2) > button");
        String expected = "Log in to Your Account";
        String actual = webDriver.findElement(By.cssSelector("#searchTermBannerHead > h2")).getText();
        Assert.assertEquals(actual, expected);
    }
    //
    public void clickAccount () {MyAccount.click();}
    public void loginpage() {
        LogIn.click();
    }

    public void setLogin() {
        LogIn.click();
        enterEmail.sendKeys("sel18@gmail.com");
        enterPassword.sendKeys("seli18");
    }
    //T3ALI_SI_TC01,
    // Sign in with invalid id and email
    public void signIn() throws InterruptedException {
        enterEmail.sendKeys("sel18@gmail.com");
        enterPassword.sendKeys("sel18");
        LogIn.click();
        System.out.println("Sign In Error Message");
    }
}
