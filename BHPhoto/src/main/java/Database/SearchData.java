package Database;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SearchData extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"top-search-input\"]")
    public static WebElement search;

    public void search() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.click();
    }

}