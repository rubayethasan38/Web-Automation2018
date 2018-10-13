package HomePageTest;

import FeaturesTest.Features;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class FeaturesTests extends Features {
    Features features;
    @BeforeMethod
    public void init(){
        features = PageFactory.initElements(webDriver, Features.class);
    }
    @Test
    public void testSignInWithInvalidIdAndPassword() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        features.selectFeature();
    }
}
