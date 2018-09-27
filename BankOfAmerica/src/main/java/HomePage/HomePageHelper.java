package HomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import reporting.TestLogger;

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
    @FindBy(css = "#navCreditCards > span.title") public static WebElement CreditCards;
    @FindBy(id = "compareCheckingAccounts")public static WebElement CompareCreditCards;
    @FindBy(css= "#forgot-oid-pwd") public static WebElement ForgotPassWord;
    @FindBy(css = "#tlpvt-account-num") public static WebElement AccountNumberInputBox;
    @FindBy(xpath = "//*[@id=\"tlpvt-personalSSN-tin\"]") public static WebElement ssnInputBox;
    @FindBy(css = "#enroll") public static WebElement Enroll;
    @FindBy(css = "#tlpvt-sixdigit-account-num") public static WebElement EnrollAccountNumberInput;
    @FindBy(xpath = "//*[@id=\"tlpvt-ssn-num-val\"]") public static WebElement EnrollSSNInput;
    @FindBy(css = "#open")public static WebElement OpenAnAccount;
    @FindBy(id = "CheckingSavings_GetStarted_2017mOAA2RS") public static WebElement GetStartedChecking;
    @FindBy(id ="Card_GetStarted_2017mOAA2RS")public static WebElement GetStartedCreditCard;
    @FindBy(id = "HomeLoans_GetStarted_2017mOAA2RS") public static WebElement ApplyForHomeLoan;
    @FindBy(id = "AutoLoans_GetStarted_2017mOAA2RS")public static WebElement ApplyForCarLoan;
    @FindBy(id = "SB_GetStarted_2017mOAA2RS")public static WebElement OpenSmallBussiness;
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
    public void forgotPassword(){
        ForgotPassWord.click();
        AccountNumberInputBox.sendKeys("123123123123123");
        ssnInputBox.sendKeys("234234234234234",Keys.ENTER);
    }
    public void enroll(){
        Enroll.click();
        EnrollAccountNumberInput.sendKeys("234234234234234");
        EnrollSSNInput.sendKeys("234234234",Keys.ENTER);
    }
    public void openAccount (){
        OpenAnAccount.click();
        GetStartedChecking.click();
    }
    public void openCreditCard(){
        OpenAnAccount.click();
        GetStartedCreditCard.click();
    }
    public void homeLoan(){
        OpenAnAccount.click();
        ApplyForHomeLoan.click();
    }
    public void carLoan(){
        OpenAnAccount.click();
        ApplyForCarLoan.click();
    }
    public void startSmallBussiness(){
        OpenAnAccount.click();
        OpenSmallBussiness.click();
    }


}
