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

        //Science and engineering section

    @FindBy(css = "#physics")
        public static WebElement physics;
   @FindBy(css = "#chemistry")
         public static WebElement chemistry;
   @FindBy(css = "#biology")
        public static WebElement biology;
   @FindBy(css = "#health-and-medicine")
        public static WebElement healthAndMedicine;

    //method
//    ArtAndHumanities section
    public void clickArt (){artAndHumanities.click();}
    public void clickHistory () {history.click();}
    public void clickUsHistory () {usHistory.click();}
    public void clickWorldHistory() {worldHistory.click();}
    public void clickArtHistory() {artHistory.click();}

    //Science and engineering section
    public void clickPhysics () { physics.click();}
    public void clickChemistry () {chemistry.click();}
    public void clickBiology () {biology.click();}
    public void clickHealthAndMedicine () {healthAndMedicine.click();}
}
