package TestPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EnterPage extends CommonAPI {
    @Test
    public void selectPage () {
        webDriver.findElement(By.xpath("//*[@id=\"cat989\"]/a/span")).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"Digital Cameras\"]/img")).click();
        webDriver.findElement(By.xpath("//*[@id=\"searchTermLinksWrap\"]/a[1]/span[1]/img")).click();
    }
}
