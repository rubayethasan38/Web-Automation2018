package HomePageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePageFeatures extends CommonAPI {
    @Test
    public void searchBox(){
        webDriver.findElement(By.xpath("//*[@id=\"inputTopSearchField\"]")).sendKeys("BANK NEAR ME ", Keys.ENTER);
    }
   @Test
    public void findAtms (){
        webDriver.findElement(By.xpath("//*[@id=\"topSearch\"]/ul/li[3]/a")).click();
    }
   @Test
    public void costumerServiceB (){
        webDriver.findElement(By.xpath("//*[@id=\"topSearch\"]/ul/li[2]/a")).click();
    }
    @Test
    public void spanishService (){
        webDriver.findElement(By.xpath("//*[@id=\"topSearch\"]/ul/li[4]/a")).click();
    }
    @Test
    public void enrollB(){
        webDriver.findElement(By.xpath("//*[@id=\"topSearch\"]/ul/li[1]")).click();
    }
    @Test
    public void aboutWellsFargoB (){
        webDriver.findElement(By.xpath("//*[@id=\"headerTools\"]/nav/ul/li[2]/a")).click();
    }
   @Test
    public void financialEducationB(){
        webDriver.findElement(By.xpath("//*[@id=\"headerTools\"]/nav/ul/li[1]/a")).click();
    }

}
