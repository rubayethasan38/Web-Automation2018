package Page;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage extends CommonAPI {
    @FindBy(id = "headerSearchButton")
    public static WebElement searchBoxButton;
    @FindBy(id = "headerSearch")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"menu0\"]")
    public static WebElement ProductsTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/nav[1]/ul/li[2]")
    public static WebElement BrandsTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/nav[1]/ul/li[3]")
    public static WebElement DealsTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/nav[1]/ul/li[4]")
    public static WebElement ServicesTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[1]/nav/ul/li[1]/a")
    public static WebElement WeeklyAdTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[1]/nav/ul/li[2]/a")
    public static WebElement DealOfTheDayTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[1]/nav/ul/li[3]/a")
    public static WebElement CreditCardsTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[1]/nav/ul/li[4]/a")
    public static WebElement GiftCardsTab;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[1]/nav/ul/li[5]/a")
    public static WebElement GiftIdeasRegistryTab;
    //methods
    public void setSearchBoxButton() {
        searchBoxButton.click();
    }
    public void setSearchBox() {
        searchBox.click();
    }
    public void setProductsTab() {
        ProductsTab.click();
    }
    public void setBrandsTab() {
        BrandsTab.click();
    }
    public void setDealsTab() {
        DealsTab.click();
    }
    public void setServicesTab() {
        ServicesTab.click();
    }
    public void setWeeklyAdTab() {
        WeeklyAdTab.click();
    }
    public void setDealOfTheDayTab() { DealOfTheDayTab.click(); }
    public void setCreditCardsTab() {
        CreditCardsTab.click();
    }
    public void setGiftCardsTab() {
        GiftCardsTab.click();
    }
    public void setGiftIdeasRegistryTab() {
        GiftIdeasRegistryTab.click();
    }
}
