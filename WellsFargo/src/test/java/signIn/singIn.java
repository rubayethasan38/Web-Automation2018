package signIn;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class singIn  extends CommonAPI {
    @Test
    public void signIn(){
        webDriver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("luillo123");
        webDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("selenium123", Keys.ENTER);
    }
    @Test
    public void signInB(){
        webDriver.findElement(By.xpath("//*[@id=\"btnSignon\"]")).click();
    }
    @Test
    public void forgotPasswordUser (){
        webDriver.findElement(By.xpath("//*[@id=\"frmSignon\"]/div[6]/a")).click();
     }
}
