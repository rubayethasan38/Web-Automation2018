package HomePageTest;

import Home.HomeHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class HomePageFeatures extends HomeHelper {

    HomeHelper objOfHomeHelper;
    @BeforeMethod
    public void init(){
        objOfHomeHelper = PageFactory.initElements(webDriver, HomeHelper.class);
    }
    @Test
    public void searchBox(){
       setSearchBoxFunction();
    }
    @Test
    public void usernameInputT(){
        usernameInput();
    }
    @Test
    public void enrollButtonT(){
        enrollButtonF();
    }
    @Test
    public void careersB(){
        careersButtonF();
    }
    @Test
    public void userPasswordF(){
        userPasswordInput();
    }
    @Test
    public void costumerServiceF(){
        costumerService();
    }
    @Test
    public void moveSlideToRightB(){
        moveSlidesToRight();
    }
    @Test
    public void moveSlideToLeftB(){
        moveSlideToLeft();
    }
}
