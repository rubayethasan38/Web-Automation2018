package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamPage extends CommonAPI {
 @FindBy(css = "#featurette-2")
    public static WebElement team;
 @FindBy(css = "#featurette-3")
    public static WebElement stories;
















        // methods
    public void clickTeam () {team.click();}
    public void clickStories () {stories.click();}
}
