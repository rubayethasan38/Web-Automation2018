package KeywordDrivenTest;
import KeywordDriven.Features;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
public class FeaturesTest extends Features {
    Features objOfFeatures;
    @BeforeMethod
    public void initializeObjects(){
        objOfFeatures = PageFactory.initElements(CommonAPI.webDriver, Features.class);
    }
    @Test
    public void FeaturesTest () throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " : " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objOfFeatures.selectFeature();
    }
}
