package PageTest;

import Page.SearchProduct;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchProductTest extends SearchProduct {
    @BeforeMethod
    public void setSearchProduct() { SearchProduct searchProduct = PageFactory.initElements(webDriver, SearchProduct.class);
    }
    @Test
    public void MoviesMusic () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName())); setMoviesMusicMoviesMusic();
    }
    @Test
    public void CarElectronicsGPS () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName())); setCarElectronicsGPSCarElectronics();
    }
    @Test
    public void WearableTechnology () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName())); setWearableTechnology();
    }
    @Test
    public void HealthFitness () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName())); setHealthFitness();
    }
    @Test
    public void Homegarage () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName())); setHome();
    }
    @Test
    public void HomeGarageOffice () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName())); setSmart();
    }
    @Test
    public void DronesToysCollectiblesMenu () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName())); setDrones();
    }
    @Test
    public void BByoutletlink () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName())); setBby();
    }
}
