package LogIn;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class Account extends CommonAPI {
    @FindBy (xpath= "//div[@class='user login-account']//a")
    public static WebElement MyAccount;
    @FindBy(xpath = "//button[@class='login']")
    public static WebElement LogIn;
    @FindBy(xpath = "//input[@id='user-input']")
    public static WebElement enterEmail;
    @FindBy(xpath = "//input[@id='password-input']")
    public static WebElement enterPassword;
    @FindBy(xpath = "//input[@value='Log In']")
    public static WebElement Loginclick;
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
