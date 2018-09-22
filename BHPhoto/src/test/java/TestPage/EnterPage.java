package TestPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EnterPage extends CommonAPI {
    @Test
    public void viewPage() {
        webDriver.findElement(By.xpath("//*[@id=\"menu-9581\"]/div/div/div/ul/li[2]/a")).click();
    }

}
