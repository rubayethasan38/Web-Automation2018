package TestPages;

import HomePackage.ArtPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ArtPageTest extends ArtPage {
    ArtPage artPage;
    @BeforeMethod
    public void artAndHumanities() { artPage = PageFactory.initElements(webDriver, ArtPage.class);
    }

    //ArtAndHumanities
    @Test
    public void artHumanities() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickArt();
    }
    @Test void chooseHistory () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickHistory();
    }
    @Test void studyUsHistory () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickUsHistory();
    }
    @Test void setWorldHistory () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickWorldHistory();
    }
    @Test void pickArtHistory() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickArtHistory();}
    //Science and engineering section

    @Test
    public void setPhysics () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickPhysics();
    }
    @Test
    public void pickChemistry () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickChemistry();
    }
    @Test
    public void chooseBiology () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickBiology();
    }
    @Test void setHealthAndMedicine () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickHealthAndMedicine();
    }
    @Test void getHourOfCode () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickHourOfCode();
    }
    @Test public void getComputerAnimation(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickComputerAnimation();
    }
    @Test
    public void getComputerEngineering(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickElectricalEngineering();
    }
    @Test void getGovernmentCivics(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    artPage.clickGovernmentAndCivics();
    }
}
