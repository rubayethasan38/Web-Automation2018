package HomePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
    public void searchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearhBox.sendKeys("ATM near me ", Keys.ENTER);
    }
    public void changeLenguage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SpanishSite.click();
    }
    public void contactUs(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ContactUs.click();
    }
    public void help(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Help.click();
    }
    public void smallBussiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SmallBussiness.click();
    }
    public void wealthManagement(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        WealthManagement.click();
    }
    public void bussinessAI(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BussinessAndInstitutions.click();
    }
    public void aboutUs(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AboutUs.click();
    }
    public void signIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
         SignInInputBox.sendKeys("selenium123123");
         PasswordInputBox.sendKeys("ddeddeefe");
         SignInButton.click();
    }
    public void forgotPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ForgotPassWord.click();
        AccountNumberInputBox.sendKeys("123123123123123");
        ssnInputBox.sendKeys("234234234234234",Keys.ENTER);
    }
    public void enroll(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Enroll.click();
        EnrollAccountNumberInput.sendKeys("234234234234234");
        EnrollSSNInput.sendKeys("234234234",Keys.ENTER);
    }
    public void openAccount (){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        OpenAnAccount.click();
        GetStartedChecking.click();
    }
    public void openCreditCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        OpenAnAccount.click();
        GetStartedCreditCard.click();
    }
    public void homeLoan(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        OpenAnAccount.click();
        ApplyForHomeLoan.click();
    }
    public void carLoan(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        OpenAnAccount.click();
        ApplyForCarLoan.click();
    }
    public void startSmallBussiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        OpenAnAccount.click();
        OpenSmallBussiness.click();
    }
}
