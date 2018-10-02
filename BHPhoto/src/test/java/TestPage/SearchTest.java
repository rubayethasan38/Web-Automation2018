package TestPage;

import Page.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends LogIn {
    @BeforeMethod
    public void setLogIn() {
         Search search = PageFactory.initElements(WebDriver, Search.class);
    }
    @Test
    public void search1() {
        search1();
    }
}