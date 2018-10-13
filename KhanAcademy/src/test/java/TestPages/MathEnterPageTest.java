package TestPages;

import HomePackage.MathEnterPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MathEnterPageTest extends MathEnterPage {
    MathEnterPage mathEnterPage;
    @BeforeMethod
    public void khanAcademy() {
        mathEnterPage = PageFactory.initElements(webDriver, MathEnterPage.class);
    }

    @Test
    public void clickOnKhanAcademy() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mathEnterPage.mainPage();
    }
    @Test
    public void clickMath() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mathEnterPage.math();
    }
    @Test
    void clickGeometry() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mathEnterPage.selectGeometry();
    }
    @Test
    public void setPrecalculas() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mathEnterPage.clickPrecalculas();
    }
    @Test
    void clickAlgebra2() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mathEnterPage.subAlgebra2();
    }
}