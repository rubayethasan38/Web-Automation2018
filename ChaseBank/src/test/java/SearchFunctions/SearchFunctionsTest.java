package SearchFunctions;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchFunctionsTest extends CommonAPI {
   @Test
   public void searchTest () {
       webDriver.findElement(By.xpath("/html/body/div/div[5]/header/div[4]/div[3]/a")).click();
       webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       webDriver.findElement(By.xpath("/html/body/div/div[5]/header/div[5]/div/div/form/label/input")).sendKeys("ATM", Keys.ENTER);

   }




}


