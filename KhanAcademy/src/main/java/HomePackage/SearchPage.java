package HomePackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"logged-out-homepage-root\"]/div/div[1]/nav/div/div[1]/div[2]/a/div/span")
    public static WebElement searchBox;


















    //methods
    public void searchIn () {searchBox.click(); }

}
