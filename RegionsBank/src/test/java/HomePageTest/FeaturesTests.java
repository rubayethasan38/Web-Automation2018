package HomePageTest;

import KeyWordDriven.Features;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class FeaturesTests extends Features {
    Features ObjOfFeatures;
    @BeforeMethod
    public void init(){
        ObjOfFeatures = PageFactory.initElements(webDriver, Features.class);
    }
    @Test
    public void testSignInWithInvalidIdAndPassword() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfFeatures.selectFeature();
    }
}
