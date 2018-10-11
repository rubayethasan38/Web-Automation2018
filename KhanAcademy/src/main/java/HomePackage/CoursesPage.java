package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CoursesPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/div[1]/div[1]/button/span")
    public static WebElement courses;
    @FindBy(xpath = "//*[@id=\"header-dropdown\"]/ul/li[1]/div/h2/li/a")
    public static WebElement grammer;
    @FindBy(xpath = "//*[@id=\"header-dropdown\"]/ul/li[7]/div/ul/li[1]/a/span")
    public static WebElement Sat;
    @FindBy(xpath = "//*[@id=\"header-dropdown\"]/ul/li[7]/div/ul/li[3]/a/span")
    public static WebElement mCat;
    @FindBy(xpath = "//*[@id=\"header-dropdown\"]/ul/li[7]/div/ul/li[4]/a/span")
    public static WebElement gMat;
    @FindBy(xpath = "//*[@id=\"header-dropdown\"]/ul/li[7]/div/ul/li[2]/a/span")
    public static WebElement lSat;
    //Science and engineering
    @FindBy(xpath = "//*[@id=\"header-dropdown\"]/ul/li[3]/div/ul/li[1]/a/span")
    public static WebElement physics;
    @FindBy(xpath = "//*[@id=\"header-dropdown\"]/ul/li[3]/div/ul/li[2]/a/span")
    public static WebElement physics1;
    @FindBy(xpath = "//*[@id=\"header-dropdown\"]/ul/li[3]/div/ul/li[3]/a/span")
    public static WebElement physics2;

    // methods for courses
    public void clickCourses() {courses.click();}
    public void clickGrammer() {courses.click();}
    public void clickSat() {courses.click();}
    public void clickMcat() {courses.click();}
    public void clickGmat() {courses.click();}
    public void clickLsat() {courses.click();}
    //Science and engineering
    public void clickPhysic() {courses.click();}
    public void clickPhysic1(){courses.click();}
    public void clickPhysics2(){courses.click();}
}


