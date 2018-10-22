package Page;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
//import reporting.TestLogger;

public class XcelElement extends CommonAPI {
    @FindBy(css = "#top-search-input")
    public static WebElement getXcelElement;
    public void getXcelElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getXcelElement.click();
    }
}
