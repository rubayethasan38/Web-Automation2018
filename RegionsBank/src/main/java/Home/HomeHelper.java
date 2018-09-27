package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    @FindBy(xpath = "//*[@id=\"OnLineId\"]") public static WebElement OnlineIdInputBox;
    @FindBy(xpath = "//*[@id=\"CardNumber\"]") public static WebElement CardNumberInputBox;
    @FindBy(xpath = "//*[@id=\"PIN\"]") public static WebElement PinInputbox;
    @FindBy(xpath = "//*[@id=\"widget-f2af04e991c64e29b10a3b18d67e3e0f\"]/div/div[3]/form/fieldset/div/button")public static WebElement ContinueButton;
    @FindBy(css = "#regions-location-finder-form-zip-input") public static WebElement branchZipCodeInput;
    @FindBy(css = "#regions-location-finder-form-city-input") public static WebElement branchCityInput;
    @FindBy(css = "#regions-location-finder-form-state-input") public static WebElement branchStateInput;
    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/ul[2]/li[2]/div/a/span[1]") public static WebElement ServicesInterface;
    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/ul[2]/li[2]/div/div/div/div/div[1]/div[1]/ul/li[4]/a") public static WebElement MyStudentLoan;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/div[1]/section[2]/p[2]/a") public static WebElement ApplyForStudentLoan;
    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/ul[2]/li[2]/div/div/div/div/div[1]/div[1]/ul/li[2]/a") public static WebElement collectionsButton;
    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/ul[2]/li[2]/div/div/div/div/div[1]/div[2]/ul/li[2]/a") public static WebElement QuickDeposit;
    @FindBy(css = "#userid") public static WebElement QuickDepositUserInputBox;
    @FindBy(css = "#pass") public static WebElement QuickDepositPasswordInputBox;
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
        String Expected = "Forgot Your Password or Online ID? - Reset Your Regions Online Banking Password - Regions Online Banking";
        String Actual = webDriver.getTitle();
        Assert.assertEquals(Actual, Expected);
    }
    public void clickOnSignIn(){
        LogIn.click();
    }
    public void openAnAccount(){
        OpenAnAccount.click();
    }
    public void careers(){
        Careers.click();
        String Expected = "Careers | Regions";
        String Actual = webDriver.getTitle();
        Assert.assertEquals(Actual, Expected);
    }
    public void contactUs(){
        ContactUs.click();
        String Expected = "Contact Us | Ask Us a Question | Regions";
        String Actual = webDriver.getTitle();
        Assert.assertEquals(Actual,Expected);
    }
    public void changeToSpanish(){
       ChangeLanguageToSpanish.click();
    }
    public void recoverPassword(){
        ForgotPassword.click();
       WebDriverWait wait = new WebDriverWait(webDriver,10);
       wait.until(ExpectedConditions.elementToBeClickable(OnlineIdInputBox));
        OnlineIdInputBox.sendKeys("123123123");
        CardNumberInputBox.sendKeys("1232232375849765");
        PinInputbox.sendKeys("5555555",Keys.ENTER);
    }
    public void searchBranchByLocations(){
        Locations.click();
        branchZipCodeInput.sendKeys("33025",Keys.ENTER);
        String Expected = "Locator | Regions";
        String Actual = webDriver.getTitle();
        Assert.assertEquals(Expected, Actual);
    }
    public void searchBranchByCityAndState(){
        Locations.click();
        branchCityInput.sendKeys("Miramar");
        branchStateInput.sendKeys("FL",Keys.ENTER);
        String Expected = "Locator | Regions";
        String Actual = webDriver.getTitle();
        Assert.assertEquals(Actual,Expected);
    }
    public void applyForStudentLoan(){
    ServicesInterface.click();
    MyStudentLoan.click();
    }
    public void collections(){
    ServicesInterface.click();
    collectionsButton.click();
    }
    public void quickDeposit(){
        ServicesInterface.click();
        QuickDeposit.click();
        QuickDepositUserInputBox.sendKeys("selenium123");
        QuickDepositPasswordInputBox.sendKeys("244244424424",Keys.ENTER);
    }
}
