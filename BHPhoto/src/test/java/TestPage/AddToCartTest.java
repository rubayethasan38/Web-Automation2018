package TestPage;

import Page.AddToCart;
import Page.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends AddToCart {
    /*HomePage objHomePage;
    SearchProductPage objSearchPage;
    AddToCart objAddToCartPage;

    @BeforeMethod
    public void initializePageObjects() {
        objHomePage = PageFactory.initElements(WebDriver., HomePage.class);
        objSearchPage = PageFactory.initElements(WebDriver.SearchProductPage.class);
        objAddToCartPage = PageFactory.initElements(WebDriver. AddToCart.class);
    }
    //T3HOM_AP_TC01 verify CheckOut Now
    @Test(enabled=false)
    public void testCheckOut(){
        objHomePage.goToSearchProductPage();
        objSearchPage.goToCart();
        String actual = objAddToCartPage.clickCheckOutButton();
        System.out.println(actual);
    }*/
}