package TestPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectPage extends CommonAPI {

        @Test
    public void loginPage () {
            webDriver.findElement(By.xpath("//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/div[3]/a[3]")).click();
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            webDriver.findElement(By.xpath("//*[@id=\"login_signup-widget-root\"]/div/div[3]/section[2]/div")).click();
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            webDriver.findElement(By.xpath("//*[@id=\"login_signup-widget-root\"]/div/div[3]/section[2]/div/div/div[1]/div[2]/button[1]")).click();
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            webDriver.findElement(By.xpath("//*[@id=\"login_signup-widget-root\"]/div/div[3]/section[2]/div/div/div[2]/div/label"));
            webDriver.findElement(By.xpath("//*[@id=\"login_signup-widget-root\"]/div/div[3]/section[2]/div/div/div[2]/div/label/div[2]/div/fieldset/label[1]/select"));


//            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }


}
