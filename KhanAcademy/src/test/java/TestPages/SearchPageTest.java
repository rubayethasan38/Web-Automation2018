package TestPages;

import HomePackage.SearchPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchPageTest extends SearchPage {
    @BeforeMethod
    public void search () {
        SearchPage searchPage = PageFactory.initElements(webDriver, SearchPage.class);
    }
    @Test
    public void clickSearch () { searchIn();
    }
}
