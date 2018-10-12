package PageTest;
import Page.Lighting;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LightingTest extends Lighting {
    Lighting lighting = PageFactory.initElements(webDriver, Lighting.class);
    @Test
    public void FirstTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lighting.clickOnLightingContinuousLighting();
    }
    @Test
    public void SecondTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        lighting.clickOnLightingStrobeFlash();
    }
    @Test
    public void ThirdTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        lighting.clickOnLightingFlashesOnCameraLights();
    }
    @Test
    public void FourthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        lighting.clickOnLightingLightModifiers();
    }
}
