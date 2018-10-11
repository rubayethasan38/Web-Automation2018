package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/div[1]/div[2]/a/div/span")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/span/div/div/div/form/div/input")
    public static WebElement typeInSearchBox;
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/span/div/div/div/form/div/input")
    public static WebElement typeInComputer;
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/span/div/div/div/form/div/input")
    public static WebElement typeInScience;
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/span/div/div/div/form/div/input")
    public static WebElement typeInEnglish;
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/span/div/div/div/form/div/input")
    public static WebElement typeInArt;
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/span/div/div/div/form/div/input")
    public static WebElement typeInTest;
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/span/div/div/div/form/div/input")
    public static WebElement typeInCareer;
    //bottom section of the page
    @FindBy(className = "link_1jd2xz2")
    public static WebElement clickOnAbout;
    @FindBy(className = "link_1jd2xz2")
    public static WebElement clickOnTeam;
    @FindBy(className = "link_1jd2xz2")
    public static WebElement clickOnLeader;
    @FindBy(className = "link_1jd2xz2")
    public static WebElement clickOnHelp;
    @FindBy(className = "link_1jd2xz2")
    public static WebElement clickOnPress;
    @FindBy(className = "link_1jd2xz2")
    public static WebElement clickOnIOS;
    @FindBy(className = "link_1jd2xz2")
    public static WebElement clickOnAndroid;
    @FindBy(how = How.XPATH, using = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/div[3]/div[1]/a/svg")
    public static WebElement submitButtonWebElement;

    public static List<String> getMultipleCorses() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Math");
        itemsList.add("English");
        itemsList.add("Science");
        itemsList.add("Arts");
        itemsList.add("Computer");
        itemsList.add("History");
        itemsList.add("Economics");
        itemsList.add("Test Prep");
        return itemsList;
    }
        //methods
        public void searchIn () {
            searchBox.click();
        }
        public void searchItem () {
            searchBox.click();
            typeInSearchBox.sendKeys("Math");
        }
        public void searchIT () {
            searchBox.click();
            typeInComputer.sendKeys("Computer");
        }
        public void searchScience () {
            searchBox.click();
            typeInScience.sendKeys("Biology");
        }
        public void searchEnglish () {
            searchBox.click();
            typeInEnglish.sendKeys("English");
        }
        public void searchArts () {
            searchBox.click();
            typeInArt.sendKeys("Arts and Humanities");
        }
        public void searchTest () {
            searchBox.click();
            typeInTest.sendKeys("Test Prep");
        }
        public void searchCareer () {
            searchBox.click();
            typeInCareer.sendKeys("College");
        }
        //bottom section of the page
        public void clickAbout () {
            clickOnAbout.click();
        }
        public void clickTeam () {
            clickOnTeam.click();
        }
        public void clickLeader () {
            clickOnLeader.click();
        }
        public void clickHelp () {
            clickOnHelp.click();
        }
        public void clickPress () {
            clickOnPress.click();
        }
        public void clickIOS () {
            clickOnIOS.click();
        }
        public void clickAndroid () {
            clickOnAndroid.click();
        }
}