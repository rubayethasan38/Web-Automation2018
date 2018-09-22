package HomePageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageFunctions extends CommonAPI {
   //test1
    @Test
    public void CreateAnAccountFunction() {
        webDriver.findElement(By.xpath("/html/body/div/div[5]/header/div[4]/div[3]/ul/li[1]/a")).click();
      webDriver.navigate().back();
    }
    //test2
    @Test
    public void atmBranchFunctions() {
        webDriver.findElement(By.xpath("/html/body/div/div[5]/header/div[4]/div[3]/ul/li[1]/a")).click();
    }
    //test3
    @Test
    public void lenguageFunction() {
        webDriver.findElement(By.xpath("/html/body/div/div[5]/header/div[4]/div[3]/ul/li[2]/a")).click();
         webDriver.navigate().back();
    }
    //test4
    @Test
    public void searchButtonFunction(){
        webDriver.findElement(By.xpath("/html/body/div/div[5]/header/div[4]/div[3]/a")).click();
    webDriver.navigate().back();
    }
    //test5
    @Test
    public void openAccountTab() {
        webDriver.findElement(By.xpath("/html/body/div/div[5]/header/div[4]/div[1]")).click();
        webDriver.navigate().back();
    }
    //test6
    @Test
    public void OptionsMenu(){
        webDriver.findElement(By.xpath("//*[@id=\"skip-sidemenu\"]")).click();
        }
    }






