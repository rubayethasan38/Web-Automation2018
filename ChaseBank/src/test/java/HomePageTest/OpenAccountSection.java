package HomePageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenAccountSection extends CommonAPI {
   //test7
    @Test
    public void searchAtmByZipCode(){
    webDriver.findElement(By.xpath("/html/body/div/div[5]/header/div[4]/div[3]/ul/li[1]/a")).click();
    webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    webDriver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("33027", Keys.ENTER);
    }
}
