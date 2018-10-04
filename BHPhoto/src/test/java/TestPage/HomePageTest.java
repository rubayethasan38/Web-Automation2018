package TestPage;

import Page.HomePage;
import base.CommonAPI;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    HomePage homePage = PageFactory.initElements(CommonAPI.webDriver,HomePage.class);

    @Test
    public void firstTest(){
        clickOnPhotography();
    }

    }