package TestPages;

import HomePackage.CoursesPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CoursesTest extends CoursesPage {
    @BeforeMethod
    public void init() {
        CoursesPage coursesHoverOverPage = PageFactory.initElements(webDriver, CoursesPage.class);}
    @Test
    public void getCourses() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickCourses();
    }
    @Test
    public void getGrammer() {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickGrammer();
    }
    @Test
    public void getSat() {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickSat();
    }
    @Test
    public void getmCat() {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickMcat();
    }
    @Test
    public void getGmat() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickGmat();
    }
    @Test
    public void getLsat() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickLsat();
    }
    //Science and engineering
    @Test
    public void getPhysics() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickPhysic();
    }
    @Test
    public void getPhysics1() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickPhysic1();
    }
    @Test
    public void getPhysics2() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    clickPhysics2();
    }
}

