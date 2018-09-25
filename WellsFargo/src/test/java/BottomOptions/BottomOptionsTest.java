package BottomOptions;

import Home.BottomOptionsHelper;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class BottomOptionsTest extends BottomOptionsHelper {

    BottomOptionsHelper ObjOfBottomOptionsHelper;
    @BeforeMethod
    public void init (){
        ObjOfBottomOptionsHelper = PageFactory.initElements(webDriver, BottomOptionsHelper.class);
    }
    @Test
    public void aboutWellsFargoFunction(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AboutWellsFargoB();
    }
    @Test
    public void privacyB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacyButton();
    }
    @Test
    public void reportFraudB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        generateReport();
    }
    @Test
    public void siteMap(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        siteMapB();
    }
    @Test
    public void accesability(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        accesabilityB();
    }
    @Test
    public void onlineAccesmentB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        onlineAccesment();
    }
    @Test
    public void addChoicesB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        addChoices();
    }
}
