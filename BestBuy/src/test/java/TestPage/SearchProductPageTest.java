package TestPage;

import Page.SearchProductPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchProductPageTest extends SearchProductPage {
    @BeforeMethod
    public void search (){
        SearchProductPage searchProductPage = PageFactory.initElements(webDriver,SearchProductPage.class);
    }
    @Test
    public void HomeAppliance () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setAppliances();
    }
    @Test
    public void HomeEntertainment () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setHomeEntertainment();
    }
    @Test
    public void Computers () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setComputers();
    }
    @Test
    public void Cameras () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setCameras();
    }
    @Test
    public void setCellPhones () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setCellPhones();
    }
    @Test
    public void setAudio () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setAudioAudio();
    }
    @Test
    public void setVideoGames () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setVideoGamesVideoGames();
    }

}


