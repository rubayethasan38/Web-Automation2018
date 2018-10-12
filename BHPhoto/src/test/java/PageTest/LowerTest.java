package PageTest;
import Page.Lower;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class LowerTest extends Lower {
    Lower lower = PageFactory.initElements(webDriver, Lower.class);
    @Test
    public void AboutUs () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lower.setAboutUs();
    }
    @Test
    public void NationalWorkshops () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        lower.setNationalWorkshops();
    }
    @Test
    public void ReviewsAwards () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lower.setReviewsAwards();
    }
    @Test
    public void AffiliateProgram () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lower.setAffiliateProgram();
    }
    @Test
    public void SupplierDiversityProgram () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lower.setSupplierDiversityProgram();
    }
    @Test
    public void CareerOpportunities () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lower.setCareerOpportunities();
    }
    @Test
    public void ShopByBrand () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lower.setShopByBrand();
    }
    @Test
    public void ManufacturesDirectory () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lower.setManufacturesDirectory();
    }
    @Test
    public void SourcebooksCatalogs () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lower.setSourcebooksCatalogs();
    }
}
