package TestPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShowPage extends CommonAPI {
    @Test
    public void showPage() {
        webDriver.findElement(By.cssSelector("#details-page > script:nth-child(9)")).sendKeys();
    }
}
