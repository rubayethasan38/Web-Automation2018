package SignInFunctions;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignInTest extends CommonAPI {
    @Test
    public void logInFunction() {
        webDriver.switchTo().frame("logonbox");
        webDriver.findElement(By.cssSelector("#userId-input-field")).sendKeys("luillo123");
        webDriver.findElement(By.cssSelector("#password-input-field")).sendKeys("luillo2311");
        webDriver.findElement(By.cssSelector("#signin-button")).click();
    }
    @Test
   public void forgotUsernamePasswordFunction(){
        webDriver.switchTo().frame("logonbox");
        webDriver.findElement(By.xpath("//*[@id=\"forgotPassword\"]")).click();
   }
   @Test
    public void signUp(){
        webDriver.switchTo().frame("logonbox");
        webDriver.findElement(By.xpath("//*[@id=\"enrollment\"]")).click();
   }

   }



