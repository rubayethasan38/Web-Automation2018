package TestPage;

import Page.TVEntertainment;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TVEntertainmentTest extends TVEntertainment {
    @FindBy(css = "#cat4600 > a > span")
    public static WebElement TVEntertainment;
    //method
    @Test
    public void FirstTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnTVEntertainmentTelevisions();
    }
    @Test
    public void SecondTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnTVEntertainmentHomeTheaterProjectors();
    }
    @Test
    public void ThirdTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnTVEntertainmentBlurayDVDPlayers();
    }
    @Test
    public void FourthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnTVEntertainmentStreamingMediaPlayers();
    }
    @Test
    public void FifthTest(){TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
        clickOnTVEntertainmentGaming();
    }
}
