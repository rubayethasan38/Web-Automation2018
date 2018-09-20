package TestPage;

import base.CommonAPI;
import jdk.internal.jline.internal.TestAccessible;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EnterPage extends CommonAPI {
    @Test
    public void loginAccount() {
        webDriver.findElement(By.xpath("//*[@id=\"cat989\"]/a/span")).click();
    }
}
