package TestPage;

import Page.Camera;
import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CameraTest extends Camera {
    @Test
    public void firstTest(){ TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnPhotographyDigitalCameraTypes();
    }
    @Test
    public void secondTest(){ TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnPhotographyLenses();
    }
    @Test
    public void thirdTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnPhotographyDrones();
    }
    @Test
    public void fourthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnPhotographyTripods();
    }
    @Test
    public void fifthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnPhotographyBags();
    }
    @Test
    public void sixthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnCamcordersVideo();
    }
    @Test
    public void seventhTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnCamcordersActionCamerasAccessories();
    }
    @Test
    public void eighthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnCamcordersProfessionalCamcorders();
    }
    @Test
    public void ninthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnCamcordersPALConsumerCamcorders();
    }
    @Test
    public void tenthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnCamcordersDronesAerialImaging();
    }
    @Test
    public void eleventhTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnSurveillanceVideo();
    }
    @Test
    public void twelevthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnSurveillanceWiFiWirelessCameras();
    }
    @Test
    public void thirteenthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnSurveillanceHiddenCameras();
    }
    @Test
    public void fourteenthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnSurveillanceBodyCamerasAccessories();
    }
    @Test
    public void fifteenthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnSurveillanceIntercomSystems();
    }
}
