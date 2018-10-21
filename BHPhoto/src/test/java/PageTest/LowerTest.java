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
    lower.clickAboutUs();
    }
    @Test
    public void NationalWorkshops () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    lower.clickNationalWorkshops();
    }
    @Test
    public void ReviewsAwards () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    lower.clickReviewsAwards();
    }
    @Test
    public void AffiliateProgram () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    lower.clickAffiliateProgram();
    }
    @Test
    public void SupplierDiversityProgram () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    lower.clickSupplierDiversityProgram();
    }
    @Test
    public void CareerOpportunities () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    lower.clickCareerOpportunities();
    }
    @Test
    public void ShopByBrand () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    lower.clickShopByBrand();
    }
    @Test
    public void ManufacturesDirectory () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    lower.clickManufacturesDirectory();
    }
    @Test
    public void SourcebooksCatalogs () {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    lower.clickSourcebooksCatalogs();
    }
}
