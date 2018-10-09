package Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class FooterC {
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
    public void setAboutUs() {
        AboutUs.click();
    }
    public void setNationalWorkshops() {
        NationalWorkshops.click();
    }
    public void setReviewsAwards() {
        ReviewsAwards.click();
    }
    public void setAffiliateProgram() {
        AffiliateProgram.click();
    }
    public void setSupplierDiversityProgram(){
        SupplierDiversityProgram.click();
    }
    public void setCareerOpportunities(){
        CareerOpportunities.click();
    }
    public void setShopByBrand(){
        ShopByBrand.click();
    }
    public void setManufacturesDirectory(){
        ManufacturesDirectory.click();
    }
    public void setSourcebooksCatalogs(){
        SourcebooksCatalogs.click();
    }
}
