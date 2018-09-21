package HomePageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePageFeatures extends CommonAPI {
    @Test
    public void searchBox(){
         webDriver.findElement(By.xpath("//*[@id=\"inputTopSearchField\"]")).sendKeys("BANK NEAR ME ", Keys.ENTER);
     }
}
