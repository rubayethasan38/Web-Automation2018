package PageTest;

import Page.Optics;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class OpticsTest extends Optics {
    Optics optics = PageFactory.initElements(webDriver, Optics.class);
    @Test
    public void FirstTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        optics.clickOnOpticsBinoculars();
    }
    @Test
    public void SecondTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        optics.clickOnOpticsTelescopesAstronomy();
    }
    @Test
    public void ThirdTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        optics.clickOnOpticsSpottingScopesAccessories();
    }
    @Test
    public void FourthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        optics.clickOnOpticsRiflescopesAccessories();
    }
    @Test
    public void FifthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        optics.clickOnOpticsNightThermalVisionOptics();
    }
}
