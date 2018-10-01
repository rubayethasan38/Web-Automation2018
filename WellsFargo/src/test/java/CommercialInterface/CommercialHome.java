package CommercialInterface;

import Home.CommercialHelper;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class CommercialHome extends CommercialHelper {

    CommercialHelper commercialHelper;

    @BeforeMethod
    public void init (){
      commercialHelper=  PageFactory.initElements(webDriver, CommercialHelper.class);
    }
    @Test
    public void signOnCommercial(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SignOn();
    }
    @Test
    public void watchSuccessVideo(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        succesStoriesVideo();
    }
    @Test
    public void productsAndServicesB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        productsAndServices();
    }
    @Test
    public void commercialSignOnB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        commercialSignOnButton();
    }
    @Test
    public void moreIndustriesB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        moreIndustrices();
    }
    @Test
    public void moreInsightsB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        moreInsights();
    }
}
