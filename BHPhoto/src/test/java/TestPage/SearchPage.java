package TestPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchPage extends CommonAPI {
    @Test
    public void lookup() {
        webDriver.findElement(By.xpath("//*[@id=\"top-search-input\"]")).sendKeys();
    }
    @Test
    public void inputData(){
        webDriver.findElement(By.cssSelector("#top-search-input")).isSelected();
    }
}
