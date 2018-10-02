package TestPage;

import Page.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    HomePage homePage;

    @BeforeMethod
    public void initializePageObjects() {

        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    //T3HOM_HP_TC01 Verify Search button, if it is displayed
    @Test(enabled=true)
    public void verifySearchButton(){
        boolean bl = homePage.isSearchButtonDisplay();
        Assert.assertTrue(bl);
        System.out.println("VerifySearchButton test passed");
    }
    //T3HOM_HP_TC02  Go to Appliance tab and get title of the page
    @Test (enabled=true)
    public void verifyApplianceTitle(){
        String actual = homePage.goToAppliances();
        String expected = "Appliances at The Home Depot";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("VerifyApplianceTitle test passed");
    }
    //T3HOM_HP_TC03  Navigate back to Home page after clicking AllDepartment tab
    @Test (enabled=true)
    public void verifyBackToHomePage() {
        String actual = homePage.returnBackAllDept();
        String expected = "The Home Depot";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("VerifyBackToHomePage test passed");
    }
    //T3HOM_HP_TC04 Go to Bathroom image link under Shop Room tab and get title of the page
    @Test (enabled=true)
    public void verifyShopRoomImgLink() {
        String actual = homePage.goToBathroomUsingImg();
        String expected = "Shop by Room at The Home Depot";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("VerifyShopRoomImageLink test is passed");
    }
    //T3HOM_HP_TC05 Go to Bathroom text link under Shop Room tab and get title of the page
    @Test (enabled=true)
    public void verifyShopRoomtextLink() {
        String actual = homePage.goToBathroomUsingTxt();
        String expected = "Shop by Room at The Home Depot";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("VerifyShopRoomTextLink test passed");
    }
    //T3HOM_HP_TC06 Compare the text and image link to check if it takes to same page
    @Test (enabled=true)
    public void compareImageTextLink() {
        String str1 = homePage.goToBathroomUsingTxt();
        String str2 = homePage.goToBathroomUsingTxt();
        Assert.assertEquals(str1,str2);
        System.out.println("CompareImageTextLink test passed");
    }
    //T3HOM_HP_TC07 capture the text of hero image
    @Test (enabled=false)
    public void testHeroImage() {
        String actual = homePage.captureTextHeroImage();
        String expected = "Up to 30% off select storage solutions";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("TestHeroImage test passed");
    }
}
