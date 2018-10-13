package TestPages;

import HomePackage.CoursesPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CoursesTest extends CoursesPage {
    CoursesPage coursesPage;
    @BeforeMethod
    public void init() { coursesPage = PageFactory.initElements(webDriver, CoursesPage.class);
    }
    @Test
    public void getCourses() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        coursesPage.clickCourses();
    }
    @Test
    public void getGrammer() {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    coursesPage.clickGrammer();
    }
    @Test
    public void getSat() {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    coursesPage.clickSat();
    }
    @Test
    public void getmCat() {TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    coursesPage.clickMcat();
    }
    @Test
    public void getGmat() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    coursesPage.clickGmat();
    }
    @Test
    public void getLsat() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    coursesPage.clickLsat();
    }
    //Science and engineering
    @Test
    public void getPhysics() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    coursesPage.clickPhysic();
    }
    @Test
    public void getPhysics1() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    coursesPage.clickPhysic1();
    }
    @Test
    public void getPhysics2() { TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    coursesPage.clickPhysics2();
    }
}

