package CommercialInterface;

import Home.CommercialHelper;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class CommercialHome extends CommercialHelper {

    CommercialHelper ObjOfCommercialHelper;

    @BeforeMethod
    public void init (){
      ObjOfCommercialHelper=  PageFactory.initElements(webDriver, CommercialHelper.class);
    }
    @Test
    public void signOnCommercial(){
        SignOn();
    }
    @Test
    public void watchSuccessVideo(){
        succesStoriesVideo();
    }
    @Test
    public void productsAndServicesB(){
        productsAndServices();
    }
    @Test
    public void commercialSignOnB(){
        commercialSignOnButton();
    }
    @Test
    public void moreIndustriesB(){
        moreIndustrices();
    }
    @Test
    public void moreInsightsB(){
        moreInsights();
    }
}
