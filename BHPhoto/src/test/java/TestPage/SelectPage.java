package TestPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectPage extends CommonAPI {
    @Test
    public void loginAccount() {
        webDriver.findElement(By.cssSelector("#js-login")).click();
    }
    @Test
    public void addCart(){
        webDriver.findElement(By.cssSelector("#account-cart > div.header-cart.topNavCart > a > div")).isSelected();
    }
}
