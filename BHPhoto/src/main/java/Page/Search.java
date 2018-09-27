package Page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"top-search-input\"]")
    public static WebElement search;

    public void search1(){
        search.click();
    }
}
