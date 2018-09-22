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
 //test31
    @Test
  public void aboutWellsFargoB(){
        webDriver.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[1]/a")).click();
  }
  //test32
  @Test
  public void privacyB(){
        webDriver.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[3]/a")).click();
}
   //test33
    @Test
    public void reportFraudB(){
        webDriver.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[4]/a")).click();
}
   //test34
    @Test
    public void siteMapB(){
        webDriver.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[5]/a")).click();

 }
    //test35
    @Test
    public void accesabitlyB (){
        webDriver.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[6]/a")).click();
 }
 //test36
   @Test
   public void onlineAccesmentB(){
        webDriver.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[7]/a")).click();
    }
   //test37
    @Test
    public void adChoices (){
        webDriver.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[1]/nav/div/ul/li[8]/a")).click();
    }
}
