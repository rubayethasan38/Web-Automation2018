package TestPages;

import HomePackage.TrialPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrialPageTest extends TrialPage {
    @BeforeMethod
    public void homeTrial () {
        TrialPage trialPage = PageFactory.initElements(webDriver, TrialPage.class);
    }
    @Test
    public void freeTrial () {clickTrial();}
}
