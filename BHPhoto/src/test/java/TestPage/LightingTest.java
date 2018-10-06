package TestPage;

import Page.Lighting;
import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LightingTest extends Lighting {
    @Test
    public void FirstTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnLightingContinuousLighting();
    }
    @Test
    public void SecondTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnLightingStrobeFlash();
    }
    @Test
    public void ThirdTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnLightingFlashesOnCameraLights();
    }
    @Test
    public void FourthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnLightingLightModifiers();
    }
}
