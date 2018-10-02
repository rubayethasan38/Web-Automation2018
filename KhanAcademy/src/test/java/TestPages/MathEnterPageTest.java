package TestPages;

import HomePackage.MathEnterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MathEnterPageTest extends MathEnterPage {
    @BeforeMethod
    public void khanAcademy () {
        MathEnterPage enterPage = PageFactory.initElements(webDriver, MathEnterPage.class);
    }
    @Test
    public void clickOnKhanAcademy () { mainPage();
    }
    @Test
    public void clickMath () {math();
    }
    @Test void clickGeometry () {selectGeometry();
    }
    @Test
    public void setPrecalculas() {clickPrecalculas();
    }
    @Test void clickAlgebra2() {subAlgebra2();}





















//    @Test
//    public void loginAccount() {
//        webDriver.findElement(By.xpath("//*[@idn=\"login-or-signup\"]")).click();
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//    }
//    @Test
//    public void singup(){
//        webDriver.findElement(By.xpath("//*[@id=\"geometry\"]")).click();
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        webDriver.findElement(By.xpath("//*[@id=\"subjects\"]/div/div/div/div/div[3]/div[1]/a/div[1]/div/span/img")).click();
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        webDriver.findElement(By.xpath("//*[@id=\"topic-progress\"]/span/div/div/div[3]/div/div[2]/div/div/div[1]/h2/a")).click();
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        webDriver.findElement(By.xpath("//*[@id=\"euclid-as-the-father-of-geometry-Video-tab\"]")).click();
      // webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        webDriver.findElement(By.xpath("//*[@id=\"player_uid_865218609_1\"]/div[20]/div[2]/div[1]/button")).click();
    }


