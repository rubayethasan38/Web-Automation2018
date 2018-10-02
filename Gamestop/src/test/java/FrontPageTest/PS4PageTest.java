package FrontPageTest;

import FrontPage.PS4Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS4PageTest extends PS4Page {
    PS4Page objHomePage;


    @BeforeMethod
    public void initializePageObjects() {

        objHomePage = PageFactory.initElements(webDriver, PS4Page.class);
    }

    @Test
    public void Cons() {
        objHomePage.Cons();
    }

    @Test
    public void Games() {
        objHomePage.Games();
    }

    @Test
    public void ComingSoon() {
        objHomePage.ComingSoon();
    }

    @Test
    public void NowAvailable() {
        objHomePage.NowAvailable();
    }

    @Test
    public void Action() {
        objHomePage.Action();
    }

    @Test
    public void Casual() {
        objHomePage.Casual();
    }

    @Test
    public void Fighting() {
        objHomePage.Fighting();
    }

    @Test
    public void Shooter() {
        objHomePage.Shooter();
    }

    @Test
    public void Musicandparty() {
        objHomePage.MusicandParty();
    }

    @Test
    public void Sports() {
        objHomePage.sports();
    }

    @Test
    public void Strategy() {
        objHomePage.strategy();
    }

    @Test
    public void Roleplaying() {
        objHomePage.Roleplaying();
    }

    @Test
    public void Puzzleandcard() {
        objHomePage.Puzzleandcard();
    }

    @Test
    public void Simulation() {
        objHomePage.simulation();
    }

    @Test
    public void Controllers() {
        objHomePage.controllers();
    }

    @Test
    public void Headsets() {
        objHomePage.Headsets();
    }

    @Test
    public void chargers() {
        objHomePage.chargers();
    }

    @Test
    public void cables() {
        objHomePage.cables();
    }

}