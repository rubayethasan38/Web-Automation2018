package TestPage;

import Page.AddToCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends AddToCart {
    @BeforeMethod
    public void setAddToCart() {
        AddToCart addToCart = PageFactory.initElements(webDriver, AddToCart.class);
    }
    @Test
    public void AddToCart() {
        addtocart1();
    }
}
