package SignIn;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignInTest extends CommonAPI {
    @Test

    public void SignIn(){
        webDriver.findElement(By.xpath("//*[@id=\"account\"]")).click();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"accountNav-signIn\"]/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("luisjoelcabrera@gmail.com");
        webDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("luillo123", Keys.ENTER);
    }
   @Test
    public void createAnAccount(){
        webDriver.findElement(By.xpath("//*[@id=\"account\"]")).click();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"accountNav-createAccount\"]/a/div")).click();

    }
}
