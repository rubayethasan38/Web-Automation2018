package HomePageTest;

import KeyWordDriven.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class FeaturesTests extends Features {
    Features ObjOfFeatures;
    @BeforeMethod
    public void init(){
        ObjOfFeatures = PageFactory.initElements(webDriver, Features.class);
    }
}
