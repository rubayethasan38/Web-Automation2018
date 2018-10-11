package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArtPage extends CommonAPI {
    //ArtAndHumanities section
    @FindBy(css = "#\\2f humanities > div.exceptPhone_wrjbrc > h2 > a > div")
    public static WebElement artAndHumanities;
    @FindBy(xpath = "//*[@id=\"/humanities\"]/div[2]/h2/a/div")
    public static WebElement history;
    @FindBy(xpath = "//*[@id=\"us-history\"]")
    public static WebElement usHistory;
    @FindBy(xpath = "//*[@id=\"ap-world-history\"]")
    public static WebElement worldHistory;
    @FindBy(xpath = "//*[@id=\"art-history\"]")
    public  static WebElement artHistory;
    @FindBy(css = "#electrical-engineering")
    public static WebElement electricalEngineering;
    @FindBy(css = "#us-government-and-civics")
    public static WebElement governmentAndCivics;

        //Science and engineering section
    @FindBy(css = "#physics")
    public static WebElement physics;
    @FindBy(css = "#chemistry")
    public static WebElement chemistry;
    @FindBy(css = "#biology")
    public static WebElement biology;
    @FindBy(css = "#health-and-medicine")
    public static WebElement healthAndMedicine;
    @FindBy(css = "#hour-of-code")
    public static WebElement hourOfCode;
    @FindBy (css = "#pixar")
    public static WebElement computerAnimation;
    //method
//    ArtAndHumanities section
    public void clickArt (){artAndHumanities.click();}
    public void clickHistory () {history.click();}
    public void clickUsHistory () {usHistory.click();}
    public void clickWorldHistory() {worldHistory.click();}
    public void clickArtHistory() {artHistory.click();}

    //Science and engineering section
    public void clickPhysics() { physics.click();}
    public void clickChemistry () {chemistry.click();}
    public void clickBiology() {biology.click();}
    public void clickHealthAndMedicine () {healthAndMedicine.click();}
    public void clickHourOfCode(){hourOfCode.click();}
    public void clickComputerAnimation(){computerAnimation.click();}
    public void clickElectricalEngineering(){electricalEngineering.click();}
    public void clickGovernmentAndCivics(){governmentAndCivics.click();}
}
