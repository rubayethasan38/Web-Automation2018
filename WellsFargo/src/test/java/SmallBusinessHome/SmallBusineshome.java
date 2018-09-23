package SmallBusinessHome;

import Home.SmallBussiness;
import base.CommonAPI;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmallBusineshome extends SmallBussiness {

    SmallBussiness ObjOfSmallBussiness;
    @BeforeMethod
    public void init(){
        ObjOfSmallBussiness = PageFactory.initElements(webDriver, SmallBussiness.class);
    }
    @Test
    public void signOnT(){
        signOn();
    }
    @Test
    public void menuRightArrowClick(){
        menuLeftArrow();
    }
    @Test
    public void menuLeftArrowClick(){
        menuLeftArrow();
    }
    @Test
    public void ZipCodeLocator(){
        finByZipCode();
    }
}
