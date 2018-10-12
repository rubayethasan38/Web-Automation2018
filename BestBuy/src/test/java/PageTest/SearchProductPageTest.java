package PageTest;

import Page.SearchProductPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchProductPageTest extends SearchProductPage {
    @BeforeMethod
    public void init (){
        SearchProductPage searchProductPage = PageFactory.initElements(webDriver, SearchProductPage.class);
    }
    @Test
    public void Appliances () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setAppliances();
    }
    @Test
    public void TVHomeTheater () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setHomeEntertainment();
    }
    @Test
    public void ComputersTablets () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setComputers();
    }
    @Test
    public void CamerasCamcorders () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setCameras();
    }
    @Test
    public void CellPhones () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setCellPhones();
    }
    @Test
    public void Audio () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setAudioAudio();
    }
    @Test
    public void VideoGames () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        setVideoGames();
    }
}
