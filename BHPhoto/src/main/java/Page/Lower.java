package Page;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
public class Lower extends CommonAPI {
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[3]/a[1]")
    public static WebElement AboutUs;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[3]/a[3]")
    public static WebElement NationalWorkshops;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[3]/a[4]")
    public static WebElement ReviewsAwards;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[3]/a[5]")
    public static WebElement AffiliateProgram;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[3]/a[6]")
    public static WebElement SupplierDiversityProgram;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[3]/a[7]")
    public static WebElement CareerOpportunities;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[4]/a[1]")
    public static WebElement ShopByBrand;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[4]/a[2]")
    public static WebElement ManufacturesDirectory;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[4]/a[3]")
    public static WebElement SourcebooksCatalogs;
    //methods
    public void clickAboutUs() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    AboutUs.click();
    }
    public void clickNationalWorkshops() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    NationalWorkshops.click();
    }
    public void clickReviewsAwards() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    ReviewsAwards.click();
    }
    public void clickAffiliateProgram() {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    AffiliateProgram.click();
    }
    public void clickSupplierDiversityProgram(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    SupplierDiversityProgram.click();
    }
    public void clickCareerOpportunities(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    CareerOpportunities.click();
    }
    public void clickShopByBrand(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    ShopByBrand.click();
    }
    public void clickManufacturesDirectory(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    ManufacturesDirectory.click();
    }
    public void clickSourcebooksCatalogs(){
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    SourcebooksCatalogs.click();
    }
}
