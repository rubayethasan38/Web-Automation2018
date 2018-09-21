package HomePageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OptionMenu extends CommonAPI {
  @Test
  public void enroll (){
     webDriver.findElement(By.xpath("//*[@id=\"topSearch\"]/ul/li[1]/a")).click();
     webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
     webDriver.findElement(By.xpath("//*[@id=\"ssn\"]")).sendKeys("244455643");
     webDriver.findElement(By.id("accountNumber")).sendKeys("1234234234", Keys.ENTER);
  }
  @Test
   public void moveSlides (){
      webDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/div/div[7]/a/img")).click();
      webDriver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
      webDriver.navigate().refresh();
      webDriver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
      webDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/div/div[1]/a/img")).click();
      webDriver.navigate().refresh();
  }
  @Test
    public void studentLoans() {
      WebDriverWait wait = new WebDriverWait(webDriver, 10);
      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taskbar\"]/div/ul/li[3]/div/div/a/div")));
      webDriver.findElement(By.xpath("//*[@id=\"taskbar\"]/div/ul/li[3]/div/div/a/div")).click();
  }
  @Test
    public void earnKBonusB(){
      WebDriverWait wait = new WebDriverWait(webDriver, 10);
      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taskbar\"]/div/ul/li[1]/div/div/a")));
      webDriver.findElement(By.xpath("//*[@id=\"taskbar\"]/div/ul/li[1]/div/div/a")).click();
  }
   @Test
  public void makeAnAppointment (){
      WebDriverWait wait = new WebDriverWait(webDriver, 10);
      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"taskbar\"]/div/ul/li[4]/div/div[1]")));
      webDriver.findElement(By.xpath("//*[@id=\"taskbar\"]/div/ul/li[4]/div/div[1]")).click();
      webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      webDriver.findElement(By.xpath("//*[@id=\"location\"]")).sendKeys("33027", Keys.ENTER);

  }

}
