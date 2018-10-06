package Page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct extends CommonAPI {
    @FindBy(xpath="//*[@id=\"level2Menu7\"]/a")
    public static WebElement MoviesMusic;
    @FindBy (xpath="//*[@id=\"level2Menu8\"]/a")
    public static WebElement CarElectronicsGPS;
    @FindBy (xpath="//*[@id=\"level2Menu9\"]/a")
    public static WebElement WearableTechnology;
    @FindBy (xpath="//*[@id=\"level2Menu10\"]/a")
    public static WebElement HealthFitnessBeauty;
    @FindBy (xpath="//*[@id=\"level2Menu11\"]/a")
    public static WebElement HomeGarageOffice;
    @FindBy (xpath="//*[@id=\"level2Menu11\"]/a")
    public static WebElement SmartHomeSecurityWiFiMenu;
    @FindBy (xpath="//*[@id=\"level2Menu13\"]/a")
    public static WebElement DronesToysCollectiblesMenu;
    @FindBy (xpath="//*[@id=\"level2Menu14\"]/a")
    public static  WebElement bbyoutletlink;

    //methods
    public void setMoviesMusicMoviesMusic() {MoviesMusic.click();}
    public void setCarElectronicsGPSCarElectronics() {CarElectronicsGPS.click();}
    public void setWearableTechnology() {WearableTechnology.click();}
    public void setHealthFitness () {HealthFitnessBeauty.click();}
    public void setHomegarage () {HomeGarageOffice.click();}
    public void setSmarthome () {SmartHomeSecurityWiFiMenu.click();}
    public void setDrones () {DronesToysCollectiblesMenu.click();}
    public void setBbyoutletlink () {bbyoutletlink.click();}
}
