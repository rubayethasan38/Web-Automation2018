package HomePageTest;

import KeywordDriven.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class FeaturesTests extends Features {
    Features ObjOfFeatures;
    @BeforeMethod
    public void init(){
        ObjOfFeatures = PageFactory.initElements(webDriver, Features.class);
    }
}
