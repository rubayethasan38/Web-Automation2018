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

    BottomOptionsHelper bottomOptionsHelper;
    @BeforeMethod
    public void init (){
        bottomOptionsHelper = PageFactory.initElements(webDriver, BottomOptionsHelper.class);
    }
    @Test(priority = 2, enabled = true)
    public void aboutWellsFargoFunction(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AboutWellsFargoB();
    }
    @Test(priority = 1, enabled = true)
    public void privacyB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacyButton();
    }
    @Test(priority = 3, enabled = true)
    public void reportFraud(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        reportFraudB();
    }
    @Test(priority = 4, enabled = true)
    public void siteMap(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        siteMapB();
    }
    @Test(priority = 5, enabled = true)
    public void accesability(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        accesabilityB();
    }
    @Test(priority = 6, enabled = true)
    public void onlineAccesmentB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        onlineAccesment();
    }
    @Test(priority = 7, enabled = true)
    public void addChoicesB(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        addChoices();
    }
}
