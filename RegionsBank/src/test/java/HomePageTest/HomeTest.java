package HomePageTest;

import Home.HomeHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends HomeHelper {

    HomeHelper ObjOfHomeHelper;
    @BeforeMethod
    public void init(){
        ObjOfHomeHelper = PageFactory.initElements(webDriver, HomeHelper.class);
    }
    @Test
    public void locationsF(){
        locations();
    }
    @Test
    public void smallBussinessBankingF(){
        smallBussinessBanking();
    }
    @Test
    public void commercialFunctions(){
        commercial();
    }
    @Test
    public void seachBoxF(){
        searchBox();
    }
    @Test
    public void signInF(){
        signIn();
    }
    @Test
    public void forgotPasswordF(){
        forgotPassword();
    }
    @Test
    public void openAccountF(){
        openAnAccount();
    }
}
