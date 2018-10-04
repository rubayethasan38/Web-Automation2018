package Page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"level2Menu0\"]/a")
    public static WebElement Appliances;
    @FindBy(xpath = "//*[@id=\"level2Menu1\"]/a")
    public static WebElement TVHomeTheater;
    @FindBy(xpath="//*[@id=\"level2Menu2\"]/a")
    public static WebElement ComputersTablets;
    @FindBy(xpath = "//*[@id=\"level2Menu3\"]/a")
    public static WebElement CamerasCamcorders;
    @FindBy(xpath="//*[@id=\"level2Menu4\"]/a")
    public static WebElement CellPhones;
    @FindBy (xpath="//*[@id=\"level2Menu5\"]/a")
    public static WebElement Audio;
    @FindBy (xpath="//*[@id=\"level2Menu6\"]/a")
    public static WebElement VideoGames;
    @FindBy (xpath="//*[@id=\"level2Menu7\"]/a")
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
    public void HomeAppliance () { Appliances.click();}
    public void HomeEntertainment () {TVHomeTheater.click();}
    public void Computers () { ComputersTablets.click();}
    public void Cameras() {CamerasCamcorders.click();}
    public void setCellPhones () {CellPhones.click();}
    public void Audio () {Audio.click();}
    public void VideoGames () {VideoGames.click();}
    public void MoviesMusic () {MoviesMusic.click();}
    public void CarElectronics () {CarElectronicsGPS.click();}
    public void WearableTechnology () {WearableTechnology.click();}
    public void HealthFitness () {HealthFitnessBeauty.click();}
    public void Homegarage () {HomeGarageOffice.click();}
    public void Smarthome () {SmartHomeSecurityWiFiMenu.click();}
    public void Drones () {DronesToysCollectiblesMenu.click();}
    public void setBbyoutletlink () {bbyoutletlink.click();}
}