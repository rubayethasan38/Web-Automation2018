package PageTest;

import Page.Camera;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CameraTest extends Camera {
    Camera camera = PageFactory.initElements(webDriver, Camera.class);
    @Test
    public void firstTest() throws InterruptedException { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnPhotographyDigitalCameraTypes();
    }
    @Test
    public void secondTest() throws InterruptedException { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnPhotographyLenses();
    }
    @Test
    public void thirdTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnPhotographyDrones();
    }
    @Test
    public void fourthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnPhotographyTripods();
    }
    @Test
    public void fifthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnPhotographyBags();
    }
    @Test
    public void sixthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnCamcordersVideo();
    }
    @Test
    public void seventhTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnCamcordersActionCamerasAccessories();
    }
    @Test
    public void eighthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnCamcordersProfessionalCamcorders();
    }
    @Test
    public void ninthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnCamcordersPALConsumerCamcorders();
    }
    @Test
    public void tenthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnCamcordersDronesAerialImaging();
    }
    @Test
    public void eleventhTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnSurveillanceVideo();
    }
    @Test
    public void twelevthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnSurveillanceWiFiWirelessCameras();
    }
    @Test
    public void thirteenthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnSurveillanceHiddenCameras();
    }
    @Test
    public void fourteenthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnSurveillanceBodyCamerasAccessories();
    }
    @Test
    public void fifteenthTest() throws InterruptedException {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        camera.clickOnSurveillanceIntercomSystems();
    }
}
