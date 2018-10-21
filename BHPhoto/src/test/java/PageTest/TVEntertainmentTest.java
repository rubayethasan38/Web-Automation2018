package PageTest;
import Page.TVEntertainment;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TVEntertainmentTest extends TVEntertainment {
    Page.TVEntertainment tvEntertainment = PageFactory.initElements(webDriver, TVEntertainment.class);
    //method
    @Test
    public void FirstTest() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    tvEntertainment.clickOnTVEntertainmentTelevisions();
    }
    @Test
    public void SecondTest() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    tvEntertainment.clickOnTVEntertainmentHomeTheaterProjectors();
    }
    @Test
    public void ThirdTest() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    tvEntertainment.clickOnTVEntertainmentBlurayDVDPlayers();
    }
    @Test
    public void FourthTest() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    tvEntertainment.clickOnTVEntertainmentStreamingMediaPlayers();
    }
    @Test
    public void FifthTest() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    tvEntertainment.clickOnTVEntertainmentGaming();
    }
}
