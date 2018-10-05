package TestPage;

import Page.SearchProductPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchProductPageTest extends SearchProductPage {
    @BeforeMethod
    public void search (){
        SearchProductPage searchProductPage = PageFactory.initElements(webDriver,SearchProductPage.class);
    }
    @Test
    public void HomeAppliance () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Appliances();
    }
    @Test
    public void HomeEntertainment () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        TVHomeTheater();
    }
    @Test
    public void Computers () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        ComputersTablets();
    }
    @Test
    public void Cameras () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        CamerasCamcorders();
    }
    @Test
    public void setCellPhones () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        CellPhones();
    }
    @Test
    public void setAudio () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        Audio();
    }
    @Test
    public void setVideoGames () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        VideoGames();
    }
    @Test
    public void setMoviesMusic () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        MoviesMusic();
    }
    @Test
    public void setCarElectronicsGPSCarElectronics () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        CarElectronicsGPS();
    }
    @Test
    public void setWearableTechnology () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        WearableTechnology();
    }
    @Test
    public void HealthFitness () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        HealthFitnessBeauty();
    }
    @Test
    public void Homegarage () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        HomeGarageOffice();
    }
    @Test
    public void Smarthome () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        SmartHomeSecurityWiFiMenu();
    }
    @Test
    public void Drones () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        DronesToysCollectiblesMenu();
    }
    @Test
    public void setBbyoutletlink () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        bbyoutletlink();
    }
}


