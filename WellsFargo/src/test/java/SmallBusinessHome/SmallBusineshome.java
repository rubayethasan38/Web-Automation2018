package SmallBusinessHome;

import base.CommonAPI;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmallBusineshome extends CommonAPI {
    @Test
    public void signUp (){
        webDriver.findElement(By.xpath("//*[@id=\"tabNavSmallBusiness\"]")).click();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("luillo123");
        webDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234434", Keys.ENTER);
    String Expected = "Sign On to View Your Business Accounts | Wells Fargo";
    String Actual = webDriver.getTitle();
        Assert.assertEquals(Actual,Expected);
    }
   @Test
    public void menuArrowsRigt (){
       webDriver.findElement(By.xpath("//*[@id=\"tabNavSmallBusiness\"]")).click();
       webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"NID1_7\"]/a[2]/img")).click();
    }
    @Test
    public void menuArrowsLeft(){
        webDriver.findElement(By.xpath("//*[@id=\"tabNavSmallBusiness\"]")).click();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@id=\"NID1_7\"]/a[1]/img")).click();
    }
     @Test
    public void findLocationByZip(){
         webDriver.findElement(By.xpath("//*[@id=\"tabNavSmallBusiness\"]")).click();
         webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
         webDriver.findElement(By.xpath("//*[@id=\"location\"]")).sendKeys("33027");
     }
}
