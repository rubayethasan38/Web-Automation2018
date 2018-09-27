package TestPage;

import TestClass.Browse;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowseTest extends Browse {

    Browse ObjOfBrowse;
    @BeforeMethod
    public void initElements(){
        ObjOfBrowse = PageFactory.initElements(webDriver, Browse.class);
    }
    @Test
    public void womenPageTest(){
        ObjOfBrowse.clickWomenTest();
    }

}
