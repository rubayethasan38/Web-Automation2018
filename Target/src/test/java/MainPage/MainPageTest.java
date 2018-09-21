package MainPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainPageTest extends CommonAPI {
    @Test
    public void searchTab(){
        webDriver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Ipone XMax", Keys.ENTER);
    }
    @Test
    public void signInbutton (){
        webDriver.findElement(By.xpath("//*[@id=\"account\"]")).click();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"accountNav-signIn\"]/a/div")).click();
    }

}
