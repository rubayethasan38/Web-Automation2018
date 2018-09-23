package BottomOptions;

import Home.BottomOptionsHelper;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BottomOptionsTest extends BottomOptionsHelper {

    BottomOptionsHelper ObjOfBottomOptionsHelper;
    @BeforeMethod
    public void init (){
        ObjOfBottomOptionsHelper = PageFactory.initElements(webDriver, BottomOptionsHelper.class);
    }
    @Test
    public void aboutWellsFargoFunction(){
       AboutWellsFargoB();
    }
    @Test
    public void privacyB(){
        privacyButton();
    }
    @Test
    public void reportFraudB(){
        reportFraudB();
    }
    @Test
    public void siteMap(){
        siteMapB();
    }
    @Test
    public void accesability(){
        accesabilityB();
    }
    @Test
    public void onlineAccesmentB(){
        onlineAccesment();
    }
    @Test
    public void addChoicesB(){
        addChoices();
    }
}
