package Home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class CommercialHelper  extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"tabNavCommercial\"]") public static WebElement CommercialInterface;
    @FindBy(xpath = "//*[@id=\"btnSignon\"]") public static WebElement SignOnButton;
    @FindBy(xpath = "//*[@id=\"comp_id\"]") public static WebElement CommercialCompanyId;
    @FindBy(xpath = "//*[@id=\"user_id\"]") public static WebElement CommercialUserInput;
    @FindBy(xpath = "//*[@id=\"passwordIdField\"]") public static WebElement CommercialPasswordInput;
    @FindBy(xpath = "//*[@id=\"btnSignon\"]") public static WebElement CommercialSignOnButton;
    @FindBy(xpath = "//*[@id=\"NID1_8_3_1_2_1_1_1_3_1\"]") public static WebElement WatchVideo;
    @FindBy(xpath = "/html/body") public static WebElement PlayVideo;
    @FindBy(xpath = "//*[@id=\"productsTab\"]/a") public static WebElement ProductsAndServices;
    @FindBy(xpath = "//*[@id=\"NID1_8_3_1_1_1_4_7_1\"]") public static WebElement MoreIndustries;
    @FindBy(xpath = "//*[@id=\"insightsTab\"]/a") public static WebElement MoreInsights;
    public void SignOn(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CommercialInterface.click();
        SignOnButton.click();
        CommercialCompanyId.sendKeys("12345");
        CommercialUserInput.sendKeys("selenium");
        CommercialPasswordInput.sendKeys("amd123", Keys.ENTER);
    }
    public void succesStoriesVideo (){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CommercialInterface.click();
        WatchVideo.click();
        PlayVideo.click();
    }
    public void productsAndServices(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CommercialInterface.click();
        ProductsAndServices.click();
    }
    public void commercialSignOnButton(){
        CommercialSignOnButton.click();
    }
    public void moreIndustrices(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CommercialInterface.click();
        MoreIndustries.click();
    }
    public void moreInsights(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CommercialInterface.click();
        MoreInsights.click();
    }
}
