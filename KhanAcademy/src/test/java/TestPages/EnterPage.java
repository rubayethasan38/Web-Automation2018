package TestPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EnterPage extends CommonAPI {
    @Test
    public void loginAccount() {
        webDriver.findElement(By.xpath("//*[@id=\"login-or-signup\"]")).click();
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        webDriver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
      // webDriver.findElement(By.cssSelector("#uid-dialog-2-children > div > section.actionScreenContainer_1012r2-o_O-actionScreenHeight_ogyq09 > div > div > div:nth-child(2) > div:nth-child(1) > label > form > input")).sendKeys("selim.pnt", Keys.ENTER);
       // webDriver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }
    @Test
    public void singup(){
       // webDriver.findElement(By.xpath("//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div")).sendKeys("Grade 1",Keys.ENTER);
        webDriver.findElement(By.xpath("//*[@id=\"geometry\"]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"subjects\"]/div/div/div/div/div[3]/div[1]/a/div[1]/div/span/img")).click();
        webDriver.findElement(By.xpath("//*[@id=\"topic-progress\"]/span/div/div/div[3]/div/div[2]/div/div/div[1]/h2/a")).click();

    }

}
