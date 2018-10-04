package TestPage;

import Page.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTest extends HomePage {
    @BeforeMethod
    public void search (){
        HomePage homePage = PageFactory.initElements(webDriver,HomePage.class);
    }
    @Test
    public void setSearchBoxButton () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBoxButton();
    }
    @Test
    public void setSearchBox () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        searchBox();
    }
    @Test
    public void setProductsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        ProductsTab();
    }
    @Test
    public void setBrandsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        BrandsTab();
    }
    @Test
    public void setDealsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        DealsTab();
    }
    @Test
    public void setServicesTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        ServicesTab();
    }
    @Test
    public void setWeeklyAdTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        WeeklyAdTab();
    }
    @Test
    public void setDealOfTheDayTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        DealOfTheDayTab();
    }
    @Test
    public void setCreditCardsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        CreditCardsTab();
    }
    @Test
    public void setGiftCardsTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        GiftCardsTab();
    }
    @Test
    public void setGiftIdeasRegistryTab () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        GiftIdeasRegistryTab();
    }
}
