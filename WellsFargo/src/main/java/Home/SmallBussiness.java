package Home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SmallBussiness extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"tabNavSmallBusiness\"]") public static WebElement SmallBussiness;
    @FindBy(xpath = "//*[@id=\"userid\"]") public static WebElement SmallBussinessUserName;
    @FindBy(xpath = "//*[@id=\"password\"]") public static WebElement SmallBussinessPassword;
    @FindBy(xpath = "//*[@id=\"NID1_7\"]/a[2]/img") public static WebElement MenuArrowRight;
    @FindBy(xpath = "//*[@id=\"NID1_7\"]/a[1]/img") public static WebElement MenuArrowLeft;
    @FindBy(xpath = "//*[@id=\"location\"]") public static WebElement FindByZipcode;

    public void smallBussinessInterface(){
        SmallBussiness.click();
    }
    public void signOn(){
        SmallBussiness.click();
        SmallBussinessUserName.sendKeys("selenium");
        SmallBussinessPassword.sendKeys("pnt", Keys.ENTER);
        String Expected = "Sign On to View Your Business Accounts | Wells Fargo";
        String Actual = webDriver.getTitle();
        Assert.assertEquals(Actual,Expected);
    }
    public void menuRightArrow(){
        MenuArrowRight.click();
    }
    public void menuLeftArrow(){
        MenuArrowLeft.click();
    }
    public void finByZipCode(){
        FindByZipcode.sendKeys("33027");
    }
}
