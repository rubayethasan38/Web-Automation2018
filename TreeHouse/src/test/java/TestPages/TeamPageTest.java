package TestPages;

import HomePackage.TeamPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamPageTest extends TeamPage {
    @BeforeMethod
    public void HomePageTeam() {
        TeamPage teamPage = PageFactory.initElements(webDriver, TeamPage.class);
    }
    @Test
    public void homeTeam() {
        clickTeam();
    }
    @Test
    public void homeStories() {
        clickStories();
    }
}
