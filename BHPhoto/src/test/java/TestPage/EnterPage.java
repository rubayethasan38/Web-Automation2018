package TestPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EnterPage extends CommonAPI {
    @Test
    public void loginAccount() {
        webDriver.findElement(By.xpath("//*[@id=\"js-login\"]/span[4]"));
        webDriver.findElement(By.xpath("//*[@id=\"cat989\"]/a/span")).click();
        webDriver.findElement(By.xpath("//*[@id=\"js-login\"]/span[4]"));
    }
    @Test
    public void click() {
        webDriver.findElement(By.cssSelector("#cat9581 > a > span")).click();
    }

}
