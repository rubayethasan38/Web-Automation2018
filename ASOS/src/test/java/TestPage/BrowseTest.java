package TestPage;

import TestClass.Browse;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class BrowseTest extends Browse {

    Browse ObjOfBrowse;
    @BeforeMethod
    public void initElements(){
        ObjOfBrowse = PageFactory.initElements(webDriver, Browse.class);
    }
    @Test
    public void womenPageTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfBrowse.clickWomenTest();
    }
    public void menPageTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfBrowse.clickMenTest();
    }
    public void expandActivewearTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ObjOfBrowse.expandActivewearTest();
    }
    public void SalesbannerTest(){
        ObjOfBrowse.clickSalesbannerTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }
    public void menPageTest(){
        ObjOfBrowse.clickMenTest();
    }




}
