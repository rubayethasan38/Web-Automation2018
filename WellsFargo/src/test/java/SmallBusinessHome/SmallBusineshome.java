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
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class SmallBusineshome extends SmallBussiness {

    SmallBussiness ObjOfSmallBussiness;
    @BeforeMethod
    public void init(){
        ObjOfSmallBussiness = PageFactory.initElements(webDriver, SmallBussiness.class);
    }
    @Test
    public void signOnT(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signOn();
    }
    @Test
    public void menuRightArrowClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        menuLeftArrow();
    }
    @Test
    public void menuLeftArrowClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));menuLeftArrow();
    }
    @Test
    public void ZipCodeLocator(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));finByZipCode();
    }
}
