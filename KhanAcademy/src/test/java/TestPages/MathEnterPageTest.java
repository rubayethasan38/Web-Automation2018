package TestPages;

import HomePackage.MathEnterPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MathEnterPageTest extends MathEnterPage {
    @BeforeMethod
    public void khanAcademy() {
        MathEnterPage enterPage = PageFactory.initElements(webDriver, MathEnterPage.class);
    }

    @Test
    public void clickOnKhanAcademy() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage();
    }

    @Test
    public void clickMath() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        math();
    }

    @Test
    void clickGeometry() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectGeometry();
    }

    @Test
    public void setPrecalculas() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickPrecalculas();
    }

    @Test
    void clickAlgebra2() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        subAlgebra2();
    }
}