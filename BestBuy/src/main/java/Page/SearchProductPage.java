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
    //methods
    public void setAppliances () { Appliances.click();}
    public void setHomeEntertainment () {TVHomeTheater.click();}
    public void setComputers () { ComputersTablets.click();}
    public void setCameras() {CamerasCamcorders.click();}
    public void setCellPhones () {CellPhones.click();}
    public void setAudioAudio() {Audio.click();}
    public void setVideoGamesVideoGames() {VideoGames.click();}
}