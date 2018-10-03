package TestPages;

import HomePackage.ArtPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ArtPageTest extends ArtPage {
    @BeforeMethod
    public void artAndHumanities() {
        ArtPage artPage = PageFactory.initElements(webDriver, ArtPage.class);
    }

    //ArtAndHumanities
    @Test
    public void artHumanities() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickArt();
    }
    @Test void chooseHistory () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickHistory();
    }
    @Test void studyUsHistory () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickUsHistory();
    }
    @Test void setWorldHistory () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickWorldHistory();
    }
    @Test void pickArtHistory() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickArtHistory();}
    //Science and engineering section

    @Test
    public void setPhysics () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickPhysics();
    }
    @Test
    public void pickChemistry () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickChemistry();
    }
    @Test
    public void chooseBiology () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickBiology();
    }
    @Test void setHealthAndMedicine () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickHealthAndMedicine();}


}
