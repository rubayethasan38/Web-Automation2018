package CommercialInterface;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommercialHome extends CommonAPI {
   @Test
    public void signOn() {
       webDriver.findElement(By.xpath("//*[@id=\"tabNavCommercial\"]"));
       webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       webDriver.findElement(By.id("btnSignon")).click();
   }
   }
