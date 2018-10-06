package TestPage;

import Page.Optics;
import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class OpticsTest extends Optics {
    @Test
    public void FirstTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnOpticsBinoculars();
    }
    @Test
    public void SecondTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnOpticsTelescopesAstronomy();
    }
    @Test
    public void ThirdTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnOpticsSpottingScopesAccessories();
    }
    @Test
    public void FourthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnOpticsRiflescopesAccessories();
    }
    @Test
    public void FifthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnOpticsNightThermalVisionOptics();
    }
}
