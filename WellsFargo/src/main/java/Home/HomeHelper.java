package Home;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeHelper extends CommonAPI {
    @FindBy(xpath = " //*[@id=\"inputTopSearchField\"]") WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"userid\"]" ) WebElement userName;
    @FindBy(xpath = "//*[@id=\"password\"]") WebElement userPassWord;

}
