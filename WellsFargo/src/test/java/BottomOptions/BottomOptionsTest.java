package BottomOptions;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BottomOptionsTest extends CommonAPI {
   //test30
    @Test
    public void careersTest(){
    webDriver.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[2]/a")).click();
    String Expected = "Wells Fargo Careers";
    String Actual =webDriver.getTitle();
    System.out.println(Actual);
    Assert.assertEquals(Actual,Expected);
    }
}
