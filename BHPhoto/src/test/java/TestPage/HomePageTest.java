package TestPage;

import Page.HomePage;
import base.CommonAPI;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTest extends HomePage {
    HomePage homePage = PageFactory.initElements(CommonAPI.webDriver,HomePage.class);

    @Test
    public void firstTest(){ TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnPhotography();
    }
    @Test
    public void secondTest(){ TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnComputers();
    }
    @Test
    public void thirdTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnProVideo();
    }
    @Test
    public void fourthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnLighting();
    }
    @Test
    public void fifthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnProAudio();
    }
    @Test
    public void sixthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnMobile();
    }
    @Test
    public void seventhTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnTVEntertainment();
    }
    @Test
    public void eightTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnCamcorders();
    }
    @Test
    public void ninthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnSurveillance();
    }
    @Test
    public void tenthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnOptics();
    }
    @Test
    public void eleventhTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnAudioVisual();
    }
}