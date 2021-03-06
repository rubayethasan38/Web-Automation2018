package Home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomeHelper  extends CommonAPI {
    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/ul[2]/li[1]/div/a") public static WebElement Locations;
    @FindBy(xpath = "//*[@id=\"regions-primary-navigation-list\"]/li[2]/a") public static WebElement SmallBussinessBanking;
    @FindBy(xpath = "//*[@id=\"regions-primary-navigation-list\"]/li[3]/a") public static WebElement Commercial;
    @FindBy(xpath = "//*[@id=\"regions-search-input\"]") public static WebElement SearchBox;
    @FindBy(xpath = "//*[@id=\"OnlineID\"]") public static WebElement UserInputBox;
    @FindBy(xpath = "//*[@id=\"Password\"]") public static WebElement PasswordInputBox;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/section[1]/div[1]/div/div/form/fieldset/div/div[2]/div[2]/a") public static WebElement ForgotPassword;
    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/ul[2]/li[3]/a") public static WebElement OpenAnAccount;
    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/ul[2]/li[5]/a") public static WebElement ContactUs;
    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/ul[2]/li[6]/a") public static WebElement ChangeLanguageToSpanish;
    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/ul[2]/li[4]/a") public static WebElement Careers;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/section[1]/div[1]/div/div/form/fieldset/div/div[1]/div[3]/button") public static WebElement LogIn;
    @FindBy(xpath = "//*[@id=\"contentWrapper\"]/div/div[2]/div/div[1]") public static WebElement signInReply;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/header/div/div/div/div[1]/h1") public static WebElement searchText;
    public void locations(){
        Locations.click();
    }
    public void smallBussinessBanking(){
        SmallBussinessBanking.click();
    }
    public void commercial(){
        Commercial.click();
    }
    public void searchBox(){
        SearchBox.sendKeys("Atm Near Me", Keys.ENTER);
        String Expected = "Search Results";
        String Actual = searchText.getText();
        Assert.assertEquals(Actual, Expected);
    }
    public void signIn(){
        UserInputBox.sendKeys("selenium");
        PasswordInputBox.sendKeys("100kAYear", Keys.ENTER);
        String ReplyText = signInReply.getText();
        System.out.println("Reply : "+ ReplyText);
    }
    public void forgotPassword(){
        ForgotPassword.click();
    }
    public void clickOnSignIn(){
        LogIn.click();
    }
    public void openAnAccount(){
        OpenAnAccount.click();
    }
}
