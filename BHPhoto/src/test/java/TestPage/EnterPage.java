package TestPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EnterPage extends CommonAPI {
    @Test
    public void click() {
        webDriver.findElement(By.cssSelector("#cat9581 > a > span")).click();
    }

}
