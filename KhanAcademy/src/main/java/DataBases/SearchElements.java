package DataBases;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SearchElements extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/span/div/div/div/form/div/input")
    public static WebElement getXcelElement;

    public void getXcelElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getXcelElement.click();
    }
}

