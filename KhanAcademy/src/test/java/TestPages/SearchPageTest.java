package TestPages;

import HomePackage.SearchPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchPageTest extends SearchPage {
    SearchPage searchPage;
    @BeforeMethod
    public void search () { searchPage = PageFactory.initElements(webDriver, SearchPage.class);
    }
    @Test
    public void clickSearch () {  TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.searchIn();
    }
    @Test
    public void searchMath () { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.searchItem();}
    @Test
    public void searchComputer() {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.searchIT();}
    @Test void biology () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.searchScience();}
    @Test
    public void english () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.searchEnglish();}
    @Test
    public void art () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.searchArts(); }
    @Test
    public void test () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.searchTest();}
    @Test
    public void career () {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.searchCareer();}

    //bottom section of the page

    @Test
    public void about() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.clickAbout();}
    @Test
    public void team() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.clickTeam();}
    @Test
    public void leader() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.clickLeader();}
    @Test
    public void help() {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.clickHelp();}
    @Test
    public void press() {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.clickPress();}
    @Test
    public void IOSApp() {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.clickIOS();}
    @Test
    public void androidApp() {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    searchPage.clickAndroid();
    }
}

