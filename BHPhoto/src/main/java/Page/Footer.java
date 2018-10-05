package Page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer extends CommonAPI {
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[1]/div[1]/a/span[1]")
    public static WebElement Shipping;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[1]/div[2]/a/span[1]")
    public static WebElement Returns;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[1]/div[3]/a/span[1]")
    public static WebElement GiftCards;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[1]/div[4]/a/span[1]")
    public static WebElement EventSpace;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[2]/div[2]/div/a/span")
    public static WebElement ContactUs;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[2]/div[3]/div/a/span")
    public static WebElement LiveChat;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[1]/a[1]")
    public static WebElement HoursOfService;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[1]/a[2]")
    public static WebElement AddressDirections;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[1]/a[1]")
    public static WebElement TrackRequestReturn;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[1]/a[2]")
    public static WebElement UnsubscribeCatalog;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[1]/a[3]")
    public static WebElement UnsubscribeEmail;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[1]/a[4]")
    public static WebElement Payments;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[1]/a[5]")
    public static WebElement AllHelpTopics;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[2]/a[1]")
    public static WebElement WorldwideShipping;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[2]/a[2]")
    public static WebElement PaymentOptions;
    @FindBy(xpath = "/html/body/div[1]/div[4]/footer/div[3]/div/div[2]/div[2]/a[3]")
    public static WebElement CustomsVAT;
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
    public void setShippingShipping() {
        Shipping.click();
    }
    public void setReturns() {
        Returns.click();
    }
    public void setGiftCards() {
        GiftCards.click();
    }
    public void setEventSpace() {
        EventSpace.click();
    }
    public void setContactUs() {
        ContactUs.click();
    }
    public void setLiveChat() {
        LiveChat.click();
    }
    public void setHoursOfService() {
        HoursOfService.click();
    }
    public void setAddressDirections() {
        AddressDirections.click();
    }
    public void setTrackRequestReturn() {
        TrackRequestReturn.click();
    }
    public void setUnsubscribeCatalog() {
        UnsubscribeCatalog.click();
    }
    public void setUnsubscribeEmail() { UnsubscribeEmail.click(); }
    public void setPayments() {
        Payments.click();
    }
    public void setAllHelpTopics() {
        AllHelpTopics.click();
    }
    public void setWorldwideShipping() {
        WorldwideShipping.click();
    }
    public void setPaymentOptions() {
        PaymentOptions.click();
    }
    public void setCustomsVAT() { CustomsVAT.click(); }
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
