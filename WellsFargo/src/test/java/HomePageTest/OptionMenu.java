package HomePageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OptionMenu extends CommonAPI {




  //test25
  @Test
  public void hurricaneAlertLearnMore () {
    webDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/p/a")).click();
    String Expected = "Disaster Response Services - Wells Fargo";
    String Actual = webDriver.getTitle();
      System.out.println(Actual);
      Assert.assertEquals(Actual, Expected);
    }
  //test26
    @Test
   public void missPlacedDebit(){
        webDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/div/div[2]/a")).click();
         String Expected = "Pause Your Debit Card if Misplaced - Wells Fargo" ;
         String Actual = webDriver.getTitle();
      System.out.println(Actual);
      Assert.assertEquals(Actual, Expected);
    }

}
