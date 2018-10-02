package Page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"level2Menu0\"]/a")
    public static WebElement Appliances;
    @FindBy(xpath = "//*[@id=\"level2Menu1\"]/a")
    public static WebElement TVHomeTheater;
    @FindBy(xpath="//*[@id=\"level2Menu2\"]/a")
    public static WebElement ComputersTablets;
    @FindBy(xpath = "//*[@id=\"level2Menu3\"]/a")
    public static WebElement CamerasCamcorders;
    @FindBy(xpath="//*[@id=\"level2Menu4\"]/a")
    public static WebElement CellPhones;
    @FindBy (xpath="//*[@id=\"level2Menu5\"]/a")
    public static WebElement Audio;
    @FindBy (xpath="//*[@id=\"level2Menu6\"]/a")
    public static WebElement VideoGames;
    @FindBy (xpath="//*[@id=\"level2Menu7\"]/a")
    public static WebElement MoviesMusic;
    @FindBy (xpath="//*[@id=\"level2Menu8\"]/a")
    public static WebElement CarElectronicsGPS;
    @FindBy (xpath="//*[@id=\"level2Menu9\"]/a")
    public static WebElement WearableTechnology;
    @FindBy (xpath="//*[@id=\"level2Menu10\"]/a")
    public static WebElement HealthFitnessBeauty;
    @FindBy (xpath="//*[@id=\"level2Menu11\"]/a")
    public static WebElement HomeGarageOffice;
    @FindBy (xpath="//*[@id=\"level2Menu11\"]/a")
    public static WebElement SmartHomeSecurityWiFiMenu;
    @FindBy (xpath="//*[@id=\"level2Menu13\"]/a")
    public static WebElement DronesToysCollectiblesMenu;
    @FindBy (xpath="//*[@id=\"level2Menu14\"]/a")
    public static  WebElement bbyoutletlink;

    //T3HOM_SR_TC01 verify Best Match link in Sort by dropbox
    public static boolean checkBestMatchSortBy() {
        sortByButton.click();                   //Tried using Select Class but throwing error -Sort by UnexpectedTagNameException
        implicitWait(driver, 40);
        boolean bl = bestMatchLink.isEnabled();
        return bl;
    }
    //T3HOM_S_TC02 verify TopSeller Link under sort By dropbox
    public static boolean checkTopSellerSortBy(){
        sortByButton.click();
        implicitWait(driver,40);
        boolean bl = topSellerLink.isEnabled();
        return bl;
    }
    //T3HOM_SP_TC03 verify LowToHigh link under sort by dropbox
    public static boolean checkLowToHighSortBy() {
        sortByButton.click();
        implicitWait(driver, 40);
        boolean bl = lowToHighLink.isDisplayed();
        return bl;
    }
    //T3HOM_SP_TC04 verify HighToLow link under sort by dropbox
    public static boolean checkHighToLowSortBy() {
        sortByButton.click();
        implicitWait(driver, 40);
        boolean bl = highToLowLink.isEnabled();
        return bl;
    }
    //T3HOM_SP_TC05 verify TopRated link under sort by dropbox
    public static boolean checkTopRatedSortBy() {
        sortByButton.click();
        implicitWait(driver, 40);
        boolean bl = topRatedLink.isDisplayed();
        return bl;
    }
    //T3HOM_SP_TC06 Get items from Sortby drop box
    public static void getItemsFromSortBy(){
        sortByButton.click();
        List<String> sortByOptions = new ArrayList<>();
        List<WebElement> option = driver.findElements(By.className("sortby__items"));
        for (WebElement we : option) {
            sortByOptions.add(we.getText());
        }
        for (String st: sortByOptions){
            System.out.println(st);
        }
        System.out.println("Total number of items in SortBy drop box with size(): "+sortByOptions.size());
    }
    //T3HOM_SP_TC07 verify increment Quantity of the product by clicking increment button
    public static String verifyIncrementButton(){
        searchItem1.click();
        implicitWait(driver, 35);
        incrementButton.click();
        String str = quantityDisplayed.getText();
        return str;
    }
    //T3HOM_SP_TC08 verify decrement Quantity of the product by clicking decrement button
    public static String verifyDecrementButton(){
        searchItem1.click();
        implicitWait(driver, 35);
        incrementButton.click();
        decrementButton.click();
        String str = quantityDisplayed.getText();
        return str;
    }
    //T3HOM_SP_TC09 check Price filter under $10 check box
    public static boolean verifyPriceFilter(){
        priceFilterUnder10.click();
        implicitWait(driver, 35);
        boolean bl = priceFilterUnder10.isSelected();
        return bl;
    }
    //T3HOM_SP_T10 verify Price filter under $10 selection feature
    public static String goToPriceFilter(){
        priceFilterUnder10.click();
        implicitWait(driver, 35);
        String str = priceSelectionCheck.getText();
        return str;
    }
    //Click add to cart and continue with the next page
    public static void goToCart(){
        addToCart.click();
    }
    //T3HOM_SP_T11 verify scrollDown
    public static String checkScrollDown(){
        searchItem1.click();
        implicitWait(driver, 35);
        for(String handle: driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        implicitWait(driver, 30);
        String str = bottomLink.getAttribute("title");
        return str;
    }
}
}
