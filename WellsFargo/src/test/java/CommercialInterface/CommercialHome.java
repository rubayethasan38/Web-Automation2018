package CommercialInterface;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommercialHome extends CommonAPI {
  // test 12
   @Test
    public void signOn() {
       webDriver.findElement(By.xpath("//*[@id=\"tabNavCommercial\"]")).click();
       webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       webDriver.findElement(By.id("btnSignon")).click();
       webDriver.findElement(By.xpath("//*[@id=\"comp_id\"]")).sendKeys("34343");
       webDriver.findElement(By.xpath("//*[@id=\"user_id\"]")).sendKeys("2342423");
       webDriver.findElement(By.xpath("//*[@id=\"passwordIdField\"]")).sendKeys("23242", Keys.ENTER);
   }
    @Test
     public void watchvideoSuccessStories () throws InterruptedException {
     webDriver.findElement(By.xpath("//*[@id=\"tabNavCommercial\"]")).click();
     webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
     webDriver.findElement(By.xpath("//*[@id=\"NID1_8_3_1_2_1_1_1_3_1\"]")).click();
     webDriver.findElement(By.xpath("/html/body")).click();
     webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
 }
    @Test
    public void productsAndServicesB (){
       webDriver.findElement(By.xpath("//*[@id=\"tabNavCommercial\"]")).click();
       webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       webDriver.findElement(By.xpath("//*[@id=\"NID1_8_3_1_1_1_3_7_1\"]")).click();
   }

 @Test
    public void moreIndustries(){
     webDriver.findElement(By.xpath("//*[@id=\"tabNavCommercial\"]")).click();
     webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
     webDriver.findElement(By.xpath("//*[@id=\"NID1_8_3_1_1_1_4_7_1\"]")).click();
 }
@Test
    public void moreInsightsB(){
    webDriver.findElement(By.xpath("//*[@id=\"tabNavCommercial\"]")).click();
    webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    webDriver.findElement(By.xpath("//*[@id=\"NID1_8_3_1_1_1_1_8_1\"]")).click();
}
}