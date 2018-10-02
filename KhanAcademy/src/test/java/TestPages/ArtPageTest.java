package TestPages;

import HomePackage.ArtPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArtPageTest extends ArtPage {
    @BeforeMethod
    public void artAndHumanities() {
        ArtPage artPage = PageFactory.initElements(webDriver, ArtPage.class);
    }

    //ArtAndHumanities
    @Test
    public void artHumanities() {clickArt();
    }
    @Test void chooseHistory () {clickHistory();
    }
    @Test void studyUsHistory () {clickUsHistory();
    }
    @Test void setWorldHistory () {clickWorldHistory();
    }
    @Test void pickArtHistory() {clickArtHistory();}
    //Science and engineering section

    @Test
    public void setPhysics () {clickPhysics();
    }
    @Test
    public void pickChemistry () {clickChemistry();
    }
    @Test
    public void chooseBiology () {clickBiology();
    }
    @Test void setHealthAndMedicine () {clickHealthAndMedicine();}


}
